package quiz;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sign")
public class SignServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("/sign doGet 실행");
		
		String s_id = request.getParameter("sign_id");
		String s_pw = request.getParameter("sign_pw");
		String c_pw = request.getParameter("confirm_pw");
		
		String signMessage = null;
		try {
			if(s_id == null || s_pw == null || c_pw == null) {
				signMessage = "빈칸 입력하세요";
				
			} else if(!s_pw.equals(c_pw)) {
				System.out.println("비밀번호 불일치");
				signMessage = " 비밀번호 불일치 ";
			} else {
				signMessage = " 회원가입 완료";
			}
			request.setAttribute("sign", signMessage);
			
			
			request.getRequestDispatcher("/WEB-INF/view/login/quiz.jsp").forward(request, response);	
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/sign doPost 실행");
	}

}
