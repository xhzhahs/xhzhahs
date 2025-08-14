package sec01.exam02;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {
       
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		System.out.println("/forward doGet 실행");
   		
   		String text = request.getParameter("text");
   		System.out.println("text: "+ text);
   	
   		// 이동할 서블릿주소를 /없이 적기
   		RequestDispatcher dispatcher = request.getRequestDispatcher("another");
   		dispatcher.forward(request, response);
   		// 이렇게 쓰는 것도 당연히 가능
//   	request.getRequestDispatcher("another").forward(request, response);
   	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/forward doPost 실행");

		String text = request.getParameter("text");
   		System.out.println("text: "+ text);
   	
   		// 이동할 서블릿주소를 /없이 적기
   		RequestDispatcher dispatcher = request.getRequestDispatcher("another");
   		dispatcher.forward(request, response);
	}

}
