package kr.or.human2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.human2.service.MemberService;

// Controller = 여기에 있는 것을 찾을 수 있게 해줌
@Controller
public class MemberController {

	MemberController(){
		System.out.println("MemberController 생성자 실행");
	}
	
	@Autowired
	MemberService memberservice;
	
	@RequestMapping("/member")
	String listMember() {
		System.out.println("MemberController listMember() 실행");
		
//		new를하지 않고 필드 영역에 @Autowired로 빼주면 알아서 new해줌
//		MemberService memberservice = new MemberService();
		
		List list = memberservice.getList();
		
		System.out.println("list : "+ list);
		
		
		return "home";
	}
	
}
