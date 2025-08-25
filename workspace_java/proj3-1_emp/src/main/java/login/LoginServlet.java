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
		
		String id = request.getParameter("ename");
		
		EmpDTO empDTO = new EmpDTO();
		HttpSession session = request.getSession();
		
		// DB 다녀와서 출력하기
		try {
	
			EmpService empService = new EmpService();
			EmpDTO user = empService.loginEmp(empDTO);
			
			PrintWriter out = response.getWriter();
		
			if(user != null) {
				session.setAttribute("user", user);
			}
			
			if("KING".equals(id)) {
				out.println("관리자 KING님 환영합니다.");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/login doPost 실행");
		
		// 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
	
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		int empno = 0;
	    if (pw != null && !pw.isEmpty()) {
	        empno = Integer.parseInt(pw);
	    }
		
		EmpDTO empDTO = new EmpDTO();
		empDTO.setEname(id);
		empDTO.setEmpno(empno);
		
		
		// DB 다녀와서 출력하기
		try {
	
			EmpService empService = new EmpService();
			EmpDTO user = empService.loginEmp(empDTO);
			
			PrintWriter out = response.getWriter();
		
			if(user != null) {
				System.out.println(id);
				if("KING".equals(id)) {
					out.println(id + " 관리자님 안녕하세요");
					
				} else {
					
					out.println(id +" 일반회원님 안녕하세요");
				}
				
			} else {
				out.println("다시 입력하세요.");
			}
				
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
}
