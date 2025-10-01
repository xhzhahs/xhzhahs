package kr.or.human3;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	// cal/1 입력시
	// 1과 {month}중에 더 구체적인 1이 출력됨
	@RequestMapping("/cal/1")
	public void cal() {
		System.out.println("1월! 달력");
	}
	// "{}"의 영역을 변수에 넣어줘야함.
	@RequestMapping("/cal/{month}")
	public void cal2(
			// PathVariable은 생략불가능
			// 생략하면 RequestParam이 되어버리기때문
			@PathVariable("month")
			int mon
			
			) {
		System.out.println(mon+"월 달력");
	}
	
	// {}가 여러개 들어갈 수 있다.
	// 대신 여러개 들어간 만큼 변수에 포함시켜야한다.
	@RequestMapping("/lunch/{store}/order/{menu}/start")
	public void lunch(
			// PathVariable은 생략불가능
			// 생략하면 RequestParam이 되어버리기때문
			@PathVariable("store")
			String store,
			
			@PathVariable("menu")
			String menu
			
			) {
		System.out.println(store + "에서 "+menu+"(을)를 준비합니다.");
	}
	
	// jsp로만 갈 수 있음
	// forward 방식으로 넘어감
	@RequestMapping("/join8")
	public String join8() {
		
		// String만 작성해도 jsp를 찾고
		// join.jsp로 넘어감
		return "join";
	}
	
	// forward 방식으로 가지만 
	// jsp가 아닌 다시 Controller로 보내서
	// 해당 주소로 보냄
	@RequestMapping("/join10")
	public String join10() {
		
//		joinForm3();	// 메소드이기 때문에 호출 가능
		return "forward:join3.do";
	}
	
	// sendRedirect로 넘어감
	@RequestMapping("/join9")
	public String join9() {
		
		return "redirect:join3.do";
	}
	
	
	///////////////// 이것이 최종 현업 소스 /////////////////////////
	@RequestMapping("/join11")
	// Model이 request역할을 해줌
	// request와 생명 주기가 같다.
	// model은 얕은복사로 넘어간다.
	public String join11(Model model, String id) {
		System.out.println("/join11 실행, id :"+ id);
		
		model.addAttribute("id",id);
		
		return "result";
	}
	
	// method없이 value만 있다면
	// value= 는 생략가능
	@RequestMapping(value="/join12")
	public String join12() {
		
		return "join";
	}
	
	// 주소를 2개 쓸 수 있다.
	// 대신 {} 안에 써야함.
	@RequestMapping({"/join13","/join14"})
	public String join13() {
		
		return "join";
	}
	
	// method 안쓰면 모두 허용
	// 쓰면 그것만 허용
	@RequestMapping(value="/join15", method=RequestMethod.POST)
	public String doPost() {
		
		System.out.println("join15 doPost 실행");
		return "join";
	}
	
	// method가 다르면 주소가 같아도 가능
	@RequestMapping(value="/join15", method=RequestMethod.GET)
	public String doGet() {
		
		System.out.println("join15 doGet 실행");
		return "join";
	}
	
	// method에 둘 다 사용할 수 있음.
	// 이것도 동일하게 {} 안에 써야함.
	@RequestMapping(value="/join16", method= {RequestMethod.GET, RequestMethod.POST})
	public String join16() {
		
		System.out.println("join15 doGet 실행");
		return "join";
	}
	
	@RequestMapping("/join17")
	// return type이 void일때 return 생략가능
	// 자동으로 Mapping 주소로 이동
	public void join17() {
		System.out.println("join17 실행");
	}
	
	
}
