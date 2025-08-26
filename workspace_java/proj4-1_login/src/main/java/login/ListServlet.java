package login;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list")
public class ListServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/list doGet 실행");
		
		// 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		// DB에서 목록 조회
		EmpDAO dao = new EmpDAO();
		List list = dao.selectAll();
		
		// 목록 request에 담아서 세팅
		request.setAttribute("list", list);
		// 조회한 목록을 list.jsp로 보내기
		request.getRequestDispatcher("list.jsp").forward(request, response);
		
	}	

}
