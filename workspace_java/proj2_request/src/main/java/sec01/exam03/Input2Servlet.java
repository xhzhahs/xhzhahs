package sec01.exam03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/input2")
public class Input2Servlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("input2 doGet 실행");
		// 요청할 때 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		
		// 응답할 때 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8;");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("input2 doPost 실행");
	
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");

		try {
			int n1 = Integer.parseInt(num1);
			int n2 = Integer.parseInt(num2);
			
			int n3 = n1 + n2;
		
			System.out.println("n3 : " + n3);
			
			// request.setAttribute()
			// request에 value를 담아서 전달
			request.setAttribute("number3", n3);
			
			// request.getAttribute()
			// setAttribute로 넣은 값 꺼내기
			int n4 = (int)request.getAttribute("number3");
			System.out.println("n4: "+n4);
			
			request.getRequestDispatcher("/WEB-INF/view/calc/inputResult.jsp").forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
