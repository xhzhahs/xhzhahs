package kr.or.human3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody	//  여기다 쓰면 모든 메소드에 자동으로 붙어서 메소드에서는 생략가능
@RestController	// 이건 @Controller + @ResponseBody 의미
public class Rest_Controller {

	@RequestMapping("/a")
//	@ResponseBody
	public String a( ) {
		return "a";
	}

	// 이렇게 사용할 수도 있음.
	@RequestMapping("/b")
//	public @ResponseBody String b( ) {
	public String b( ) {
		return "b";
	}
	
	
}
