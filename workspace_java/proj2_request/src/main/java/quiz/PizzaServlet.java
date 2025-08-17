package quiz;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pizza")
public class PizzaServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/pizza doGet 실행");
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/pizza doPost 실행");
		
		// 요청할 때 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		
		// 응답할 때 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8;");
		
		String p_type = request.getParameter("type");
		String p_size = request.getParameter("size");
		String[] p_toppings = request.getParameterValues("check");
		String text = request.getParameter("text");
		String t_order = "";
		
		try {
			System.out.println(p_type);
			System.out.println(p_size);
			if(p_toppings !=null) {
				for(String chk : p_toppings) {
					System.out.println(chk);
					t_order += ", " + chk;
				}
			}
			request.setAttribute("p_type", p_type);
			request.setAttribute("p_size", p_size);
			request.setAttribute("t_order", t_order);
			request.setAttribute("text", text);
			request.getRequestDispatcher("/WEB-INF/view/login/order.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
