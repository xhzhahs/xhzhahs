package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class EmpDAO {

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
	
	// 기획
	// 리턴내용은
	// 회원이라면 회원 EmpDTO
	// 비회원이라면 null
	
	public EmpDTO getEmp(EmpDTO dto) {
		
		EmpDTO resultDTO = null;
		
		try {
			
			// DB 접속
			Connection conn = getConn();
			
			// SQL 준비
			String query = " select * from emp3";
				   query += " where ename = ? and empno= ?";
				   
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, dto.getEname());
			ps.setInt(2, dto.getEmpno());
			
			// SQL 실행
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {

				// resultDTO가 null로 되어있어서 new 해줘야함
				// resultDTO에 다시 담아줌.
				resultDTO = new EmpDTO();
				
				int empno = rs.getInt("empno");
				resultDTO.setEmpno(empno);
				
				resultDTO.setEname(rs.getString("ename"));
				resultDTO.setJob(rs.getString("job"));
				resultDTO.setMgr(rs.getInt("mgr"));
			
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return resultDTO;
	}
	
	// 전체 목록 조회
	public List selectAll() {
		
		List list = new ArrayList();
		
		try {
			
			// DB 접속
			Connection conn = getConn();
			
			// SQL 준비
			String query = " select * from emp3";
			
			PreparedStatement ps = conn.prepareStatement(query);

			// SQL 실행
			ResultSet rs = ps.executeQuery();
			
			// 여러줄이니까 if아니고 while
			while(rs.next()) {
				
				// resultDTO가 null로 되어있어서 new 해줘야함
				// resultDTO에 다시 담아줌.
				EmpDTO resultDTO = new EmpDTO();
				
				int empno = rs.getInt("empno");
				resultDTO.setEmpno(empno);
				
				resultDTO.setEname(rs.getString("ename"));
				resultDTO.setJob(rs.getString("job"));
				resultDTO.setMgr(rs.getInt("mgr"));
				
				// 리스트에 담기
				list.add(resultDTO);
				
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
	
