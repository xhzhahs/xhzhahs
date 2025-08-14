package sec01.exam01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			System.out.println("/calc doGet 실행");
			
			String a1 = request.getParameter("a");
			String b1 = request.getParameter("b");

			// 필요없는 것은 빼고 감싸는 것이 100점짜리 try-catch 사용법
			try {
				int a = Integer.parseInt(a1);
				int b = Integer.parseInt(b1);
				
				int c = a + b;
				
				PrintWriter out = response.getWriter();
				out.println("<h1>a1"+ a +"</h1>");
				out.println("<h1>b1"+ b +"</h1>");
				out.println("<h1>sum"+ c +"</h1>");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		
		

				
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
