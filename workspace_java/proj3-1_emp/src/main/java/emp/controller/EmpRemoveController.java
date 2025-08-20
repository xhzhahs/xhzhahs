package emp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;
import emp.service.EmpService;

@WebServlet("/remove")
public class EmpRemoveController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("/remove doPost 실행");
		
		// 0. 언제 : detail 페이지에서 삭제버튼을 눌렀을 때
		// 어떻게?
		// 1. 사원번호로 값 뽑아서
		int empno = 0;
		try {
			// parameter empno를 int를 String으로 형변환하는 업무
			String sEmpno = request.getParameter("empno");
			
			if(sEmpno != null) {
				empno = Integer.parseInt(sEmpno);
			}
			
			EmpDTO empDTO = new EmpDTO();
			empDTO.setEmpno(empno);
		}catch (Exception e) {
			e.printStackTrace();
		}
		// 2. DTO에 담고 set
		EmpDTO empDTO = new EmpDTO();
		empDTO.setEmpno(empno);
		
		// 3. DB 접속해서 삭제
		EmpService empService = new EmpService();
		int result = empService.removeEmp(empDTO);
		System.out.println(result + " 만큼 삭제 되었습니다.");
		
		// 4. 이후는 전체 목록으로 이동
		response.sendRedirect("list");
		
		// 삭제 DAO 만들고
		// 삭제 Service 만들고
		// 컨트롤러에서는
		// 삭제 버튼 눌렀을때
		// 사원번호를 토대로 정보 한줄 가져와서 삭제
		// 삭제 후 목록으로 이동
		
		
	}

}
