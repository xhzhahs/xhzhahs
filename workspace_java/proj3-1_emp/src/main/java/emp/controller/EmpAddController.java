package emp.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;
import emp.service.EmpService;

@WebServlet("/add")
public class EmpAddController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("/add doGet 실행");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("/add doPost 실행");
		
		// 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
	
		EmpDTO dto = new EmpDTO();
		
		try {
			
			String sEmpno = request.getParameter("empno");
			int empno = Integer.parseInt(sEmpno);
			dto.setEmpno(empno);
			
			String ename = request.getParameter("ename");
			dto.setEname(ename);
			
			String job = request.getParameter("job");
			dto.setJob(job);
			
			String sMgr = request.getParameter("mgr");
			int mgr = Integer.parseInt(sMgr);
			dto.setMgr(mgr);
			
			String sHiredate = request.getParameter("hiredate");
			Date hiredate = Date.valueOf(sHiredate);
			dto.setHiredate(hiredate);
			
			String sSal = request.getParameter("sal");
			int sal = Integer.parseInt(sSal);
			dto.setSal(sal);
			
			String sComm = request.getParameter("comm");
			int comm = Integer.parseInt(sComm);
			dto.setComm(comm);
			
			String sDeptno = request.getParameter("deptno");
			int deptno = Integer.parseInt(sDeptno);
			dto.setDeptno(deptno);
			
//			dto.setEmpno((int)getParam(sEmpno));	// 메소드를 생성해서 사용했을 경우 이렇게 쓸 수 있겠다.
			
			// DB 삽입
			EmpService empService = new EmpService();
			int result = empService.addEmp(dto);
			System.out.println("삽입 결과 : "+ result);
			
			// 삽입 후 이동할 곳
			response.sendRedirect("list");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	// 메소드 만들어보기
	// 파라메터 String 값을 줌
	// 만약 원래 String인 값이면 String으로 돌려줌
	// 		원래 int인 값이면 int로 돌려줌
	// 리턴타입을 2개 가질 수 없으므로 Object로 돌려준다면?
	private Object getParam(String param) {
		// 일단 모든 것을 try안에서 int로 변경
		// 글씨는 에러가 날 것이다.
		// 에러가 난다면 try를 넘어가서 catch로 넘어가고 return으로 넘어감

		Object o = param;
		
		try {
			o = Integer.parseInt(param);
		}catch (Exception e) {
			e.printStackTrace();
		}
	
		return o;
	}
}
