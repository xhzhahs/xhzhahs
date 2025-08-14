package sec01.exam02;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("/redirect doGet 실행");
		
		// 요청할 때 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		
		// 응답할 때 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8;");
		
		String text = request.getParameter("text");
   		System.out.println("text: "+ text);
   		
   		response.sendRedirect("/proj2_request/another");
   		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("/redirect doPost 실행");
		
		String text = request.getParameter("text");
   		System.out.println("text: "+ text);
   		
   		// redirect post로 보내도 get방식으로 받음.
   		response.sendRedirect("/proj2_request/another");
	}

}
