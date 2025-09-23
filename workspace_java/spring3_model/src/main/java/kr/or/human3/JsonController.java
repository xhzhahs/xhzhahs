package kr.or.human3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonController {

	@RequestMapping("ajax.do")
	public String ajax() {
	
		return "ajax";
	}
	
	
	// @RequestBody 사용
	@RequestMapping("ajax1")
	public String ajax1(
			// json은 해석하지 못함.
//			@RequestParam(value="id", required=false)
//			String id
			
			// json을 읽기 위해서 사용.
			// GET 방식은 안됨. GET으로 사용하려면 주소창에 적으면됨.
			// POST, PUT, DELETE는 가능.
			@RequestBody
			MemberDTO dto 
			
			) {
//		System.out.println("id : "+ id);
		System.out.println("dto : "+ dto);
		return "ajax";
	}
	
	
	@RequestMapping("ajax2")
	// html이 아닌 그냥 return값이 나옴.
	@ResponseBody
	public String ajax2() {

		
		return "ajax";
	}
	
	@RequestMapping("ajax3")
	@ResponseBody
	public String ajax3() {
		
		MemberDTO dto = new MemberDTO();
		
		return "ajax";
	}
	
}
