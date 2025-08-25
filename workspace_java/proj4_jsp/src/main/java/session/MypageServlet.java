package session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/mypage")
public class MypageServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 한글깨짐 방지
		response.setContentType("text/html; charset=utf-8;");
		
		HttpSession session = request.getSession(false);

		if(session == null) {
			System.out.println("로그인 안함 1");
			System.out.println("아예 처음 방문");
			// 로그인 안함
			response.sendRedirect("cookie_5.jsp");

		} else {
			System.out.println("로그인 안함 2");
			System.out.println("처음 방문아님");
			
			// getAttribute : 없으면 null
			// (Boolean) null이 담길 수 있는 것
			Boolean login = (Boolean)session.getAttribute("login");
			if(login == null || login != true) {
				// 로그인 안함
				response.sendRedirect("cookie_5.jsp");
			} else {
				response.getWriter().println("여긴 로그인해야 올 수 있는 곳");
				response.getWriter().println("<br>아이디 : "+ session.getAttribute("userId"));
				
			}
			
		}
		
	
	}


}
