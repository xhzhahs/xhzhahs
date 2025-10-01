package movie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import emp.service.EmpService;
import movie.dto.MovieDTO;

public class MovieDAO {

	// DB 접속 메소드 만들기
	private Connection getCon() {
		
		Connection con = null;
		
		try {
			Context ctx = new InitialContext();
			
			DataSource dataFactory = (DataSource)ctx.lookup("java:/comp/env/jdbc/oracle"); 
			
			// DB 접속
			con = dataFactory.getConnection();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return con;
	}
	
	
	// select 
	public List<MovieDTO> selectAllMovie(){
		
		List<MovieDTO> list = new ArrayList<MovieDTO>();
		
		try {
			// DB 접속
			Connection con = getCon();
			
			// SQL 준비
			String query = " select * from movie";
			PreparedStatement ps = con.prepareStatement(query);
			
			// SQL 실행 및 결과 확보
			ResultSet rs = ps.executeQuery();
			
			// 결과 활용
			while (rs.next()) {
				
				// DTO 불러와서 한줄씩 담기
				MovieDTO dto = new MovieDTO();
				
				dto.setMovie_id(rs.getInt("movie_id"));
				dto.setTitle(rs.getString("title"));
				dto.setImg_url(rs.getString("img_url"));
				dto.setOpen_date(rs.getDate("open_date"));
				
				// 만든 DTO list에 add
				list.add(dto);
				System.out.println("조회된 행 개수: " + list.size());
			}
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return list;
	}
	
	// 한줄만 뽑기
	public MovieDTO selectOne(MovieDTO dto) {
		
		MovieDTO result = null;
		
		try {
			// DB 접속
			Connection con = getCon();
			
			// SQL 준비
			String query = " select * from movie";
				  query += " where movie_id = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1,dto.getMovie_id());
			
			// SQL 실행 및 결과 확보
			ResultSet rs = ps.executeQuery();
			
			// 결과 활용
			if(rs.next()) {
				result = new MovieDTO();
				
				result.setMovie_id(rs.getInt("movie_id"));
				result.setTitle(rs.getString("title"));
				result.setImg_url(rs.getString("img_url"));
				result.setOpen_date(rs.getDate("open_date"));
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	// insert
	
	public int insert(MovieDTO dto) {
		int result = -1;
		
		try {
			
			// DB 접속
			Connection con = getCon();
			
			// SQL 준비
			String query = " insert into movie (movie_id, title, img_url, open_date)";
			       query += " values(?, ?, ?, ?)";
			       
	        PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, dto.getMovie_id());
			ps.setString(2, dto.getTitle());
			ps.setString(3, dto.getImg_url());
			ps.setDate(4, dto.getOpen_date());
			
			// SQL 실행 및 결과확보
			result = ps.executeUpdate();
			
			
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return result;
	}
	
}
