
// 빨간줄 나왔을때
// 프로젝트에서 오른쪽 클릭 후 
// Properties 또는 Build Path 클릭 후
// 1. 라이브러리 탭 클릭
// unbound 된 자바 눌러서 연결
// 2. compiler 도 자바 변경
// 3. project Facets 도 자바 변경

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
//@WebServlet("/hello")
@WebServlet("/hello.human")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
        System.out.println("Hello Servlet 생성");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("<h1>Served</h1> at: ").append(request.getContextPath());
	
    	// 한글 깨짐 방지
    	response.setContentType("text/html; charset=utf-8");
    	
    	// Writer는 글씨 전용 output
    	PrintWriter out = response.getWriter();
    	out.println("<h1>");
    	out.print("Hello Servlet 한글");
    	out.println("</h1>");
    	
    	for(int i=0; i<10; i++) {
    		if( Math.random() < 0.5) {
    			out.println(i);
    			out.println("<br>");
    		}
    		
    	}
    	
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
