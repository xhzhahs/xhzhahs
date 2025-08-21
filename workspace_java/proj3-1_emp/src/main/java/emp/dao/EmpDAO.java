package emp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import emp.dto.EmpDTO;

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
	
	// select
	public List<EmpDTO> selectAllEmp() {
		
		List<EmpDTO> list = new ArrayList<EmpDTO>();

		try {
			
			// DB 접속
			Connection conn = getConn();
			
			// SQL 준비
			String query = " select * from emp2";
			PreparedStatement ps = conn.prepareStatement(query);
			
			// SQL 실행
			ResultSet rs = ps.executeQuery();
			
			// 결과 활용
				// rs.next()는 커서를 다음줄로 이동시켜줌
			while(rs.next()) {

				// DTO 불러와서 한줄한줄 담아주기
				EmpDTO dto = new EmpDTO();
				
				int empno = rs.getInt("empno");
				dto.setEmpno(empno);
				
				dto.setEname(rs.getString("ename"));
				dto.setSal(rs.getInt("sal"));
			
				
				// 만들어진 DTO를 list에 담기
				list.add(dto);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	// 한명만 조회
	public EmpDTO selectOneEmp(EmpDTO empDTO) {
		
		EmpDTO resultDTO = null;
		
		try {
			
			// DB 접속
			Connection conn = getConn();
			
			// SQL 준비
			String query = " select * from emp2";
				   query += " where empno = ?";
				   
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, empDTO.getEmpno());
			
			// SQL 실행
			ResultSet rs = ps.executeQuery();
			
			// 결과 활용
				// rs.next()는 커서를 다음줄로 이동시켜줌
//			while(rs.next()) {
			// 하나만 있기때문에 while보다는 if가 적당하다.
			if(rs.next()) {

				// resultDTO가 null로 되어있어서 new 해줘야함
				resultDTO = new EmpDTO();
				
				int empno = rs.getInt("empno");
				resultDTO.setEmpno(empno);
				
				resultDTO.setEname(rs.getString("ename"));
				resultDTO.setJob(rs.getString("job"));
				resultDTO.setMgr(rs.getInt("mgr"));
				resultDTO.setHiredate(rs.getDate("hiredate"));
				resultDTO.setSal(rs.getInt("sal"));
				resultDTO.setComm(rs.getInt("comm"));
				resultDTO.setDeptno(rs.getInt("deptno"));
			
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return resultDTO;
	}
	
	// delete
	public int deleteEmp(EmpDTO empDTO) {
		
		int result = -1;
		
		try {
			
			// DB 접속
			Connection conn = getConn();
			
			// SQL 준비
			String query = " delete emp2";
				   query += " where empno = ?";
		   
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, empDTO.getEmpno());
			
			// SQL 실행
			result = ps.executeUpdate();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	// insert
	public int insertEmp(EmpDTO empDTO) {
		
		int result = -1;
		
		try {
			
			// DB 접속
			Connection conn = getConn();
			
			// SQL 준비
			String query = " insert into emp2 (empno,ename, job, mgr, hiredate, sal, comm, deptno)";
				   query += " values(?, ?, ?, ?, ?, ?, ?, ?)";
			
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, empDTO.getEmpno());
			ps.setString(2, empDTO.getEname());
			ps.setString(3, empDTO.getJob());
			ps.setInt(4, empDTO.getMgr());
			ps.setDate(5, empDTO.getHiredate());
			ps.setInt(6, empDTO.getSal());
			ps.setInt(7, empDTO.getComm());
			ps.setInt(8, empDTO.getDeptno());
			
			// SQL 실행
			result = ps.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	// update
	public int updateEmp(EmpDTO empDTO) {
		
		int result = -1;
		
		try {
			
			// DB 접속
			Connection conn = getConn();
			
			// SQL 준비
			String query = " update emp2";
			query += " set ename = ?, ";
			query += "     job = ?, ";
			query += "     mgr = ?, ";
			query += "     hiredate = ?, ";
			query += "     sal = ?, ";
			query += "     comm = ?, ";
			query += "     deptno = ?";
			query += " where empno = ?";
			
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, empDTO.getEname());
			ps.setString(2, empDTO.getJob());
			ps.setInt(3, empDTO.getMgr());
			ps.setDate(4, empDTO.getHiredate());
			ps.setInt(5, empDTO.getSal());
			ps.setInt(6, empDTO.getComm());
			ps.setInt(7, empDTO.getDeptno());
			ps.setInt(8, empDTO.getEmpno());
			
			// SQL 실행
			result = ps.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
