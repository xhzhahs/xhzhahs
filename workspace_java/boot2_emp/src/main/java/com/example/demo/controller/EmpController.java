package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dao.EmpDAO;
import com.example.demo.dto.EmpDTO;

@Controller
public class EmpController {

//	mybatis를 실행
	@Autowired
	EmpDAO empDAO;
	
//	@RequestMapping(value="/hello", method=RequestMethod.GET)
	// 위 코드를 축약한 버전 = @GetMapping
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@RequestMapping(value="/empList", method=RequestMethod.GET)
	public String empList() {
		List<EmpDTO> list = empDAO.empList();
		System.out.println("controller > list : "+ list);
		return "list";
	}
	
}
