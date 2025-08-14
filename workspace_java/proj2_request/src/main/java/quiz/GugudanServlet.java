package quiz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gugudan")
public class GugudanServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/gugudan doGet 실행");
		
		String dan = request.getParameter("dan");
		
		
		
		try {
			int ddan = Integer.parseInt(dan);
		
			System.out.println(ddan + "단");
			
			for(int i = 1; i<=9; i++) {
				System.out.println(ddan+ " x "+ i+ " = "+ (ddan * i));
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/gugudan doPost 실행");
	
	}

}
