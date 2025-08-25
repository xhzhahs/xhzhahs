package session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session")
public class SessionServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 기존 세션이 없으면 새로 만들어주고
		// 있으면 그걸 가져온다.
		HttpSession session = request.getSession();
		
		// 기존 세션이 없으면 null
		// 있으면 그것을 가져온다.
//		HttpSession session = request.getSession(false);
		
		session.setAttribute("k", "v");
		
		String id = session.getId();
		
		System.out.println("getId(): " + id);
		
		// isNew 쓸때는 getSession(false); 쓰는게 낫다.
		// null이 나올것이기 때문
		boolean isNew = session.isNew();
		System.out.println("isNew(): " + isNew);
		
		String userId = request.getParameter("id");
		if("minsu".equals(userId)){
			session.setAttribute("login", true);
			session.setAttribute("userId", userId);
		} else if("admin".equals(userId)){
			session.setAttribute("login", true);
			session.setAttribute("userId", userId);
			session.setAttribute("level", "1");
		}
		
	}


}
