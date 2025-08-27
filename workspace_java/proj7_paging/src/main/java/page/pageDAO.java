package page;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class pageDAO {

	// DB 접속 메소드
	private Connection getConn() {
		
		Connection conn = null;
		
		try {
			
			// JNDI 방식으로 -> 글씨로 가져오는 것
			// context.xml에 있는 DB정보를 가져온다.
			// new부터 java:/comp/env/까지가 JNDI 방식으로 가져오는 방식
			// jdbc/oracle은 context.xml에 있는 name 작성
			Context ctx = new InitialContext();
			
			// DataSource : 커넥션 풀 관리자
			DataSource dataFactory = (DataSource)ctx.lookup("java:/comp/env/jdbc/oracle"); 
			
			// DB 접속
			conn = dataFactory.getConnection();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	// emp2 목록 뽑기
	public List selectAll(EmpDTO empDTO) {
		
		List list = new ArrayList();
		
		
		try {
			// DB 접속
			Connection conn = getConn();
			
			// SQL 준비
			String query = " select * from ("
					+ "    select rownum rnum, t1.* from ("
					+ "        select emp2.* from emp2"
					+ "        where lower(ename) like lower('%'|| ? ||'%')"
					+ "        order by hiredate desc"
					+ "    ) t1"
					+ " ) t2"
					+ " where rnum >= ? and rnum <= ?"
					+ " order by ename";
			
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, empDTO.getKeyword());
			ps.setInt(2, empDTO.getStart());
			ps.setInt(3, empDTO.getEnd());
			
			// SQL 실행
			ResultSet rs = ps.executeQuery();
			
			// 결과 활용
			while(rs.next()) {
				
				EmpDTO dto = new EmpDTO();
				
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setMgr(rs.getInt("mgr"));
				dto.setHiredate(rs.getDate("hiredate"));
				dto.setSal(rs.getInt("sal"));
				dto.setComm(rs.getInt("comm"));
				dto.setDeptno(rs.getInt("deptno"));
				
				// 리스트에 담아주기
				list.add(dto);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return list;
	}
	public int selectTotal(EmpDTO empDTO) {
		

		int result = -1;
		
		try {
			// DB 접속
			Connection conn = getConn();
			
			// SQL 준비
			String query = " select count(*) cnt from emp2"
						 + " where lower(ename) like lower('%'|| ? ||'%')";
					
			
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, empDTO.getKeyword());
			
			// SQL 실행
			ResultSet rs = ps.executeQuery();
			
			// 결과 활용
			while(rs.next()) {
				
				result = rs.getInt("cnt");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return result;
	}
	
}
