package quiz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/login doGet 실행");
		// 요청할 때 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		
		// 응답할 때 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8;");
		String id = request.getParameter("id"); 
		String pw = request.getParameter("pw");
		System.out.println("id : "+id);
		System.out.println("pw : "+pw);
		
		String message = null;
		
		try {
			if(id == null || id.equals("") || pw.equals("")) {
				message = "아이디와 비밀번호를 확인하세요";
			} else {	
	
				if(id.equals("admin") && pw.equals("1234")) {
					message = "<h1>관리자 화면<h1>";
				} else {
					message = "<h1> 아이디 : "+ id + "</h1>" + "<h1> 비밀번호 : " + pw + "</h1>"+"<h1> 로그인성공 </h1>";
				}
			}
			request.setAttribute("message", message);
			
			System.out.println("message: \n"+ message);
			
			request.getRequestDispatcher("/WEB-INF/view/login/quiz.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/login doPost 실행");
	}

}
