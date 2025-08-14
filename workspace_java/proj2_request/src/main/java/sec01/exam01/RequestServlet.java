package sec01.exam01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/req")
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/req doGet 실행");
		
		// 요청할 때 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		
		// 응답할 때 한글 깨짐 방지
		response.setContentType("text/html; charset=utf-8;");
		
		// getParameter
		// 전달받은 파라메터의 key를 적어서 해당 값을 얻어오기
		String num1 = request.getParameter("num1");
		System.out.println("num1: " + num1);

		// 없으면 null
		String num2 = request.getParameter("num2");
		System.out.println("num2: " + num2);

		// 없으면 빈칸
		System.out.println("pw: " + request.getParameter("pw"));

		// 먼저 나온 한개만 출력
		// querySelector 와 같은 역할
		System.out.println("check: " + request.getParameter("check"));

		// getParameterValues
		// 체크된 모든 것 출력 
		// querySelectorAll과 같은 역할
		// 반복문을 돌릴 때
		// 체크된 것이 없으면 null에러 나기 때문에 if문 쓰기
		String[] checks = request.getParameterValues("check");
		System.out.println("checks: " + checks);
		if(checks !=null) {
			for(String chk : checks) {
				System.out.println(chk);
			}
		}
	
		// hidden
		System.out.println("hidden1: "+ request.getParameter("hidden1"));
		
		// 버튼은 submit해도 전달 안됨. 
		System.out.println("btn1: "+ request.getParameter("btn1"));
		System.out.println("btn2: "+ request.getParameter("btn2"));
	
		// radio
		// 어차피 한개만 선택되므로 getaParameter로 잡기
		// 체크 안되어 있으면 null
		System.out.println("radio1: "+ request.getParameter("radio1"));

		// date
		System.out.println("date1: "+ request.getParameter("date1"));

		// number
		// 숫자만 들어감 e는 예외
		// 없으면 빈칸
		System.out.println("number1: "+ request.getParameter("number1"));

		// div, span, strong 등등 
		// 전송되는 form요소가 아니라 null
		System.out.println("div1: "+ request.getParameter("div1"));

		// select
		System.out.println("select1: "+ request.getParameter("select1"));

		// textarea
		System.out.println("textarea1: "+ request.getParameter("textarea1"));
	
		response.getWriter().println("{\"k\":123}");
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/req doPost 실행");
		
		System.out.println("num2: " + request.getParameter("num2"));
		
		response.getWriter().println("{\"k\":456}");
		
	}

}
