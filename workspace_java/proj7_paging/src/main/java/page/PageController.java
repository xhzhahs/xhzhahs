package page;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/page")
public class PageController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("/page doGet 실행");
		
		// 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		// 몇개 보여줄 것인가
		String sPagePerRows = request.getParameter("size");
		// 현재 몇페이지인가
		String sPage = request.getParameter("page");
		
		// 기본값
		// 한페이지에 10개 보여주자
		int pagePerRows = 10;
		int page = 1;
		try {
			pagePerRows = Integer.parseInt(sPagePerRows);
		}catch (Exception e) {
//			e.printStackTrace();	// 에러나도 동작함 에러가 자꾸입력되어서 주석처리
		}
		try {
			page = Integer.parseInt(sPage);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		EmpDTO empDTO = new EmpDTO();
		empDTO.setPagePerRows(pagePerRows);
		empDTO.setPage(page);
		empDTO.setKeyword(request.getParameter("keyword"));
		
		
		// DB에서 목록 조회
		pageService service = new pageService();
		Map map = service.getAll(empDTO);
		
		// 목록 request에 담아서 세팅
		request.setAttribute("map", map);
		request.setAttribute("empDTO", empDTO);
		
		// 조회한 목록을 list.jsp로 보내기
		request.getRequestDispatcher("paging.jsp").forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	}

}
