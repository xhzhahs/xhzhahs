package movie.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import movie.dto.MovieDTO;
import movie.service.MovieService;

@WebServlet("/add")
public class MovieAddController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/add doGet 실행");
		
		// 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
			PrintWriter out = response.getWriter();
			
			out.println("<form method='post' action='add'>");
			out.println("	<table border=1>");
			out.println("		<tr>");
			out.println("			<th>movie_id</th>");
			out.println("			<td><input type='text'></td>");
			out.println("		</tr>");
			out.println("		<tr>");
			out.println("			<th>title</th>");
			out.println("			<td><input type='text'></td>");
			out.println("		</tr>");
			out.println("		<tr>");
			out.println("			<th>img_url</th>");
			out.println("			<td><input type='text'></td>");
			out.println("		</tr>");
			out.println("		<tr>");
			out.println("			<th>open_date</th>");
			out.println("			<td><input type='date'></td>");
			out.println("		</tr>");
			out.println("	</table>");
			out.println("	<input type='submit' value='추가하기'>");
			out.println("</form>");
			
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/add doPost 실행");
		
		// 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		MovieDTO dto = new MovieDTO();
		
		try {
			String id = request.getParameter("movie_id");
			int movie_id = Integer.parseInt(id);
			dto.setMovie_id(movie_id);
			
			String title = request.getParameter("title");
			dto.setTitle(title);
			
			String url = request.getParameter("img_url");
			dto.setImg_url(url);
			
			String date = request.getParameter("open_date");
			Date open_date = Date.valueOf(date);
			dto.setOpen_date(open_date);
			
			// DB 수정
			MovieService movieService = new MovieService();
			movieService.addMovie(dto);
			
			// 수정 후 이동할 것
			response.sendRedirect("/list");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
