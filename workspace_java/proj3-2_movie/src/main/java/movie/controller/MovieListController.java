package movie.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import movie.dto.MovieDTO;
import movie.service.MovieService;

@WebServlet("/list")
public class MovieListController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("/list doGet 실행");
		
		// 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
	
		try {
			// DB 조회
			MovieService movieService = new MovieService();
			List<MovieDTO> list = movieService.getAll();
			
			// 컬럼명 화면 출력
			PrintWriter out = response.getWriter();
			
			out.println("<table border=1>");
			out.println("	<tr>");
			out.println("		<th>movie_id</th>");
			out.println("		<th>title</th>");
			out.println("		<th>img_url</th>");
			out.println("		<th>open_date</th>");
			out.println("	</tr>");
			
			// 저장된 리스트 보여주기
			for( MovieDTO dto : list ) {
				System.out.println(dto);
				
				out.println("<tr>");
				out.println("	<td>"+ dto.getMovie_id()+"</td>");
				out.println("	<td><a href='detail?movie_id="+dto.getMovie_id()+"'>"+ dto.getTitle()+"</a></td>");
				out.println("	<td>"+ dto.getImg_url()+"</td>");
				out.println("	<td>"+ dto.getOpen_date()+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			out.println("<a href = 'add'><button type='button'>추가</button></a>");
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}


}
