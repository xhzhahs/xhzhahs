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

@WebServlet("/detail")
public class MovieDetailController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("/list doGet 실행");
		
		// 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		int movie_id = 0;
		
		try {
			
			String id = request.getParameter("movie_id");
			
			if(id != null) {
				
				movie_id = Integer.parseInt(id);
			}

			MovieDTO dto = new MovieDTO();
			dto.setMovie_id(movie_id);
			
			// DB 조회
			MovieService movieService = new MovieService();
			MovieDTO dtoOne = movieService.getOne(dto);
			
			// 컬럼명 화면 출력
			PrintWriter out = response.getWriter();
			
			out.println("<table border=1>");
			out.println("	<tr>");
			out.println("		<th>movie_id</th>");
			out.println("		<td>"+ dtoOne.getMovie_id()+"</td>");
			out.println("	</tr>");
			out.println("	<tr>");
			out.println("		<th>title</th>");
			out.println("		<td>"+ dtoOne.getTitle()+"</td>");
			out.println("	</tr>");
			out.println("	<tr>");
			out.println("		<th>img_url</th>");
			out.println("		<td>"+ dtoOne.getImg_url()+"</td>");
			out.println("	</tr>");
			out.println("	<tr>");
			out.println("		<th>open_date</th>");
			out.println("		<td>"+ dtoOne.getOpen_date()+"</td>");
			out.println("	</tr>");
			out.println("</table>");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
