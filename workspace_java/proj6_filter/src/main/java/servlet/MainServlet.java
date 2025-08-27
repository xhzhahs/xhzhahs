package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/main")
public class MainServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("main doGet 실행");
		
		// filter에서 다 처리했으므로 주석
//		HttpSession session = request.getSession();
		
//		if (session.getAttribute("login") != null ) {
//			
//			request.setAttribute("codeName", "3500");
//			System.out.println("forward 고고씽");
//			
//			// forward는 filter를 거치지 않고 바로 간다.
//			request.getRequestDispatcher("/WEB-INF/views/main.jsp").forward(request, response);
//		} else {
//			response.sendRedirect("login.html");
//		}
		
		request.setAttribute("codeName", "3500");
		System.out.println("forward 고고씽");
		
		// forward는 filter를 거치지 않고 바로 간다.
		request.getRequestDispatcher("/WEB-INF/views/main.jsp").forward(request, response);
		
	}


}
