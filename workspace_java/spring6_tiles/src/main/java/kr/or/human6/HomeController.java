package kr.or.human6;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		
		return "/layout/layout";
	}
	
	@RequestMapping("/seven")
	public String seven() {
		// 리턴값에 jsp 파일명이 아닌 xml에 적은 name값적기.
		return "seven";
	}

	@RequestMapping("/mabi")
	public String mabi() {
		return "mabi";
	}
	
	@RequestMapping("/롤체")
	public String tft() {
		// *.tiles이기 때문에 .tiles붙이기
		return "TFT.tiles";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
}
