package cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie/set")
public class SetCookie extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/setcookie doGet 실행");
		
		// 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
	
		// 만료일이 있는 쿠키
		Cookie c1 = new Cookie("addr", "천안시");
//		c1.setMaxAge(60*60*24); // 초단위로
		c1.setMaxAge(10); // 초단위로
		response.addCookie(c1);
		
		// 만료일이 없는 쿠키
		// 세션쿠키
		// 브라우저를 끄기 전까지 계속 남아있음
		// setMaxAge를 설정하지 않거나
		// setMaxAge(-1) 음수로 설정한다.
		// 브라우저 메모리에만 저장된다.
		// 즉, 모든 탭을 끄면 사라진다.
		Cookie c2 = new Cookie("dinner", "회");
		c2.setMaxAge(-1);
		response.addCookie(c2);
		
		Cookie c3 = new Cookie("showPopup", "N"); // 팝업을 안보여주겠다라는 의미로 적음
		c3.setMaxAge(12);
		response.addCookie(c3);
	}


}
