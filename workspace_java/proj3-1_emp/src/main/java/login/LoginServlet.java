package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import emp.dto.EmpDTO;
import emp.service.EmpService;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/login doGet 실행");
		
		// 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/login doPost 실행");
		
		// 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String user_id = request.getParameter("id");
		String user_pw = request.getParameter("pw");
		String job = request.getParameter("job");
		
		EmpDTO dto = new EmpDTO();
		
		try {

			dto.setEname(user_id);
			
			int pw = Integer.parseInt(user_pw);
			dto.setEmpno(pw);
			
			dto.setJob(job);
			
			// DB 삽입
			EmpService empService = new EmpService();
			EmpDTO login = empService.loginEmp(dto);
			System.out.println("로그인 결과 : "+ login);
			
			// 삽입 후 이동할 곳
			if (login == null) {
				PrintWriter out = response.getWriter();
				
				out.println("<script>");
				out.println("alert('아이디/비밀번호를 확인하세요.');");
				out.println("</script>");
				
		    } else {
		    	
		    	response.sendRedirect("/proj3-1_emp/list");
		    }
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	
		
	}

	
}
