package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import emp.dto.EmpDTO;

public class OrderDAO {

	// DB 접속 메소드
	private Connection getCon() {
		Connection con = null;
		
		try {
			
			Context ctx = new InitialContext();
			
			DataSource dataFactory = (DataSource)ctx.lookup("java:/comp/env/jdbc/oracle"); 
			
			// DB 접속
			con = dataFactory.getConnection();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}


	// select
	public List selectAll() {
		
		List list = new ArrayList();
		
		try {
			
			// DB 접속
			Connection con = getCon();
			
			// SQL 준비
			String query = " select * from ";
			PreparedStatement ps = con.prepareStatement(query);
			
			// SQL 실행
			ResultSet rs = ps.executeQuery();
			
			// 결과 활용
			while(rs.next()) {
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	// 상세페이지 하나만 조회
	public DTO selectOneOrder(DTP DTO) {
		
		DTO resultDTO = null;
		
		try {
				
			// DB 접속
			Connection conn = getCon();
			
			// SQL 준비
			String query = " select * from ";
				   query += " where date = ?";
				   
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setDate(1, DTO.getEmpno());
			
			// SQL 실행
			ResultSet rs = ps.executeQuery();
			
			// 결과 활용
			if(rs.next()) {

				// resultDTO가 null로 되어있어서 new 해줘야함
				resultDTO = new DTO();
				
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
	
	
	
}
