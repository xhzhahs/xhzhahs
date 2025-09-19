package kr.or.human3;

import org.springframework.web.bind.annotation.RequestMapping;

// class에 붙이면 
// 여기 클래스에 있는 메소드는
// 모두 /mes로 시작함.
@RequestMapping("/mes")
public class MesController {

//	@RequestMapping("/mes/bom")
//	public String bom() {
//		return "bom";
//	}
//	@RequestMapping("/mes/standard")
//	public String standard() {
//		return "standard";
//	}
	
	@RequestMapping("/bom")
	public String bom() {
		return "bom";
	}
	@RequestMapping("/mes/standard")
	public String standard() {
		return "standard";
	}
	
}
