package kr.or.human3;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/main")
	// return이 void면 RequestMapping 주소로 감
	public String main(Model model, HttpServletRequest req) {
		System.out.println("/main");
		
		model.addAttribute("id","abcd");
		
		HttpSession session = req.getSession();
		session.setAttribute("level", "admin");
		
		return "main";
	}
}
