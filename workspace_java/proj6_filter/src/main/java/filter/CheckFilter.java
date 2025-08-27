package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class CheckFilter
 */
@WebFilter("/*")
public class CheckFilter implements Filter {

    /**
     * Default constructor. 
     */
    public CheckFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()	// 소멸자 -> 가비지컬렉터가 가져가기전에 동작
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 *	// 여기가 본체 여기다 코딩할거다.
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// 무엇인가를 하기 전에 시간을 기록한다.
		long before = System.currentTimeMillis();
		
		// place your code here
		System.out.println("doFilter 실행 전");
		
		// 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		
		// 모든 것을 html로 응답하기 때문에 여기에 어울리지 않다.
		// json같은 것은 json으로 응답해야 한다.
//		response.setContentType("text/html;charset=utf-8");
		
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp = (HttpServletResponse)response;
		
		String path = req.getServletPath();
		System.out.println("path : "+path);
		
		if(isExclude(path)) {
			// 로그인 없이 갈 수 있는 곳
			// 실제 사용자가 원했던 일
			// 세션없이 접근 허용
			System.out.println("세션없이 진행");
			chain.doFilter(request, response);	// 서블릿 호출하는 놈
		}else {
			// 로그인 필수
//			HttpSession session = req.getSession(false);
//			if(session == null) {
//				// 로그인 페이지로 보내기
//			}
			HttpSession session = req.getSession();
			String login = (String)session.getAttribute("login");
			if("Y".equals(login)) {
				// 실제 사용자가 원했던 일
				chain.doFilter(request, response);
				
			}else {
				System.out.println("로그인 안해서 통과 못함");
				resp.sendRedirect(req.getContextPath()+"/login.html");
			}
		}
		
		// 무조건 호출하기 때문에 if문 안에 넣어서 확인
//		// 실제 사용자가 원했던 일
//		chain.doFilter(request, response);	// 서블릿 호출하는 놈
		System.out.println("doFilter 실행 후");

		long after = System.currentTimeMillis();
		System.out.println("걸린 시간 : "+ (after - before));
	}

	/**
	 * @see Filter#init(FilterConfig)
	 *  // 생성자 실행 후 바로 실행
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

	private boolean isExclude(String path) {
		boolean result = false;
		
		// indexOf로 하면 편한데 gassets과 같은 폴더가 있을 수도 있으니
		// 안전빵으로 사용
		// .startsWith는 ()로 시작하는
		if(path.equals("/login.html")
			|| path.equals("/login")
			|| path.startsWith("/assets")) {
			result = true;
		}
		
		return result;
	}
	
}
