package login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginCheck")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/login doPost 실행");
		
		// 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String ename = request.getParameter("ename");	// pw
		String sEmpno = request.getParameter("empno");	// id
		int empno = Integer.parseInt(sEmpno);
		
		EmpDTO dto = new EmpDTO();
		dto.setEname(ename);
		dto.setEmpno(empno);
		
		// DB 다녀오기
		EmpDAO dao = new EmpDAO();
		EmpDTO result = dao.getEmp(dto);
		
		// 로그인 성공여부 판단
		if(result == null) {
			// 비회원
			
			// 로그인 페이지로 이동시킴
			response.sendRedirect("login.jsp?msg=1");
		} else {
			// 회원
			// 세션 사용
			HttpSession session = request.getSession();
			// 세션에 담아서 전달
			session.setAttribute("dto", result);
			// 로그인 성공시 list 서블릿으로 가서 list.jsp로 가기
			response.sendRedirect("list");
		}
	
	}

	
}
