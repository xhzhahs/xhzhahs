package kr.or.human3;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ParamController {

	//////////////////////////////login으로 보내기/////////////////////////////////
	@RequestMapping("/join.do")
	public void joinForm(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			request.getRequestDispatcher("/WEB-INF/views/join.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
	@RequestMapping("/join2.do")
	public ModelAndView joinForm2() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("join");
		
		return mav;
	}
	
	@RequestMapping("/join3.do")
	public ModelAndView joinForm3() {
		// 들어오긴 함
		System.out.println("/join3.do 실행");
		ModelAndView mav = new ModelAndView();
		// 나가진 못함
		return mav;
	}
	
	/////////////////////////////result로 보내기//////////////////////////////
	//////////////////////////////////////////////////////////////////////////
	// 보통 별칭은
	// jsp action과 맞추는게 편하다
	@RequestMapping("/join1")
	public ModelAndView join1(HttpServletRequest request, HttpServletResponse response) {
		
		String id = request.getParameter("id");
		System.out.println("id : "+ id);
		request.setAttribute(id,"id");
		
		// foward하는 방법1
		ModelAndView mav = new ModelAndView("result");
		return mav;
		
		
		// foward하는 방법2
//		try {
//			request.getRequestDispatcher("/WEB-INF/views/result.jsp").forward(request, response);
//		} catch (ServletException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
	
	@RequestMapping("/join3")
	public ModelAndView join3(HttpServletRequest request, HttpServletResponse response) {
		
		String id = request.getParameter("id");
		System.out.println("id : "+ id);
//		request.setAttribute(id,"id");
		
		ModelAndView mav = new ModelAndView("result");
		
		// request.setAttribute 대신 사용가능
		mav.addObject("id", id);
		
		return mav;
	}
	
	@RequestMapping("/join4")
	public ModelAndView join4(HttpServletRequest request) {
		
		MemberDTO memberDTO = new MemberDTO();
		
		try {
			
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			String sAge = request.getParameter("age");
			int age = Integer.parseInt(sAge);
			
			memberDTO.setId(id);
			memberDTO.setPw(pw);
			memberDTO.setAge(age);

		}catch (Exception e) {
			e.printStackTrace();
		}
		
//		request.setAttribute(id,"id");
		
		
		ModelAndView mav = new ModelAndView("result");
		
		// request.setAttribute 대신 사용가능
		mav.addObject("memberDTO", memberDTO);
		
		return mav;
	}
	
	@RequestMapping("/join5")
	public ModelAndView join5(
			
				// String id = request.getParameter("id"); 와 같음
				@RequestParam("id")
				String id,

				// 위에다 쓸 수도 있고 앞에다 쓸 수도 있다.
//				@RequestParam("pw") String pw,
				
				// 기본적으로 필수값이다.
				// 기본값은 value=, required=true
				@RequestParam(value="pw", required=true)
				String pw,
				
				// false인 경우 필수는 아니다.
				// 값이 없으면 null
				@RequestParam(value="name", required=false)
				String name,
				
				@RequestParam("age")
				int age,
				
//				@RequestParam("tel")
				// Param의 key와 변수명이 같다면 @RequestParam 생략가능
				// 생략했을 경우는 required=false 다.
				String tel,
				
				String t,	// null
//				, int a		// null이고 형변환 안되서 400 코드
				
				// key값을 다 담아서 출력함.
				@RequestParam
				Map map
				
				// 여기서 DTO는 안된다.
//				@RequestParam
//				MemberDTO dto
			) {
		
		System.out.println("id : " + id);
		System.out.println("pw : " + pw);
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("tel : " + tel);
		System.out.println("t : " + t);		// null 나옴
		
		System.out.println("map : " + map);
//		System.out.println("dto : " + dto);

		ModelAndView mav = new ModelAndView("result");
		
		
		return mav;
	}
	
	@RequestMapping("/join5_1")
	// 변수명 이렇게 옆으로 쭉 쓰는 것도 가능
	public ModelAndView join5_1(String id, String pw, String name, int age, String tel) {
		
		MemberDTO memberDTO = new MemberDTO();
		
		// request.setAttribute 대신 사용가능
		ModelAndView mav = new ModelAndView("result");
		
		memberDTO.setId(id);
		memberDTO.setPw(pw);
		memberDTO.setName(name);
		memberDTO.setAge(age);
		memberDTO.setTel(tel);
		
		mav.addObject("memberDTO", memberDTO);
		return mav;
		
	}
	
	
	@RequestMapping("/join6")
	public ModelAndView join6(
			
			// parameter에서 꺼내서 DTO에 알아서 넣어줌.
				@ModelAttribute
				MemberDTO dto1 ,
				
				// DTO를 자동으로 채우고
				// 모델에 넣어주기까지 함.setAttribute
				// mav.addObject("memberDTO2", dto2); 이걸 대신해줌
				@ModelAttribute("memberDTO2")
				MemberDTO dto2,
				
				// @ModelAttribute 생략 가능함.
				// 생략하면 타입(클래스)의 앞글자를 소문자로 변경한 key로 
				// 모델에 넣어줌
				// @ModelAttribute("memberDTO")
				MemberDTO dto3
			
			) {
		System.out.println("dto1: "+ dto1);
		System.out.println("dto2: "+ dto2);
		System.out.println("dto3: "+ dto3);
		
		ModelAndView mav = new ModelAndView("result");
//		mav.addObject("memberDTO", dto1);
//		mav.addObject("memberDTO2", dto2);
		return mav;
	}
	
	
	// 결과적으로 이것이 가능하다.
	@RequestMapping("/join7")
	public void join7(String id, MemberDTO dto) {
		
	}
	
}
