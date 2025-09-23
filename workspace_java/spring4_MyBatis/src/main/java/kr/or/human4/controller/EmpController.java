package kr.or.human4.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.human4.dto.EmpDTO;
import kr.or.human4.service.EmpService;

@Controller
public class EmpController {

	@Autowired
	EmpService empService;
	
	@RequestMapping("/listEmp")
	public String listEmp(Model model) {

		List<EmpDTO> list = empService.getEmpList();
		model.addAttribute("list", list);
		
		// jsp로 보내기
		return "emp";
	}
	
	@RequestMapping("/empOne")
	public String empOne(Model model) {
		
		EmpDTO empDTO = empService.getEmp();
		model.addAttribute("empDTO",empDTO);
		
		// jsp로 보내기
		return "emp";
	}
	
	@RequestMapping("/empOneMap")
	public String empOneMap(Model model) {
		
		Map map = empService.getEmpMap();
		model.addAttribute("map",map);
		
		// jsp로 보내기
		return "emp";
	}
	
	@RequestMapping("/getEmpno")
	public String getEmpno(Model model, int empno) {
		System.out.println("empno: "+ empno);
		List list = empService.getEmpno(empno);
		
		model.addAttribute("list",list);
		// jsp로 보내기
		return "emp";
	}
	
	@RequestMapping("/getEname")
	public String getEname(Model model, String ename) {
		System.out.println("ename: "+ ename);
		List list = empService.getEname(ename);
		
		model.addAttribute("list",list);
		// jsp로 보내기
		return "emp";
	}
	
	@RequestMapping("/getEmpnoEname")
	public String getEmpnoEname(Model model, EmpDTO dto) {
		List list = empService.getEmpnoEname(dto);
		
		model.addAttribute("list",list);

		return "emp";
	}

	// 회원가입페이지로 이동
	@RequestMapping("/add")
	public String add() {
		return "join";
	}
	
	@RequestMapping("/addEmp2")
	public String addEmp2(Model model, EmpDTO dto) {
		int result = empService.addEmp2(dto);
		System.out.println("회원 가입 결과 : "+ result);
		
//		if(result == 0) {
//			// 다시 회원가입창으로 보내기
//		}else {
//			
//			return "redirect:/listEmp";
//		}
		
		
		return "redirect:/listEmp";
		
	}
	
	// 수정 페이지
	@RequestMapping("/modify")
	public String modify(Model model, EmpDTO dto) {
		EmpDTO empDTO = empService.getOneEmpno(dto.getEmpno());
		model.addAttribute("empDTO",empDTO);
		return "modify";
	}
	
	// 수정 후 상세
	@RequestMapping("/modifyEmp")
	public String modifyEmp(Model model, EmpDTO dto) {
		int result = empService.modifyEmp2(dto);
		System.out.println("수정 결과 : "+ result);
		
		return "detail";
	}
 
	// 삭제 후 목록
	@RequestMapping("/delete")
	public String delete(Model model, EmpDTO dto) {
		int result = empService.removeEmp2(dto);
		System.out.println("삭제 결과 : "+ result);
		
		return "redirect:/listEmp";
	}
	
	
	// 상세조회 by empno
	@RequestMapping("/detail")
	public String detail(Model model, int empno) {
		EmpDTO empDTO = empService.getOneEmpno(empno);
		model.addAttribute("empDTO", empDTO);
		
		return "detail";  
	}
	
	// 검색 기능
	@RequestMapping("/search")
	public String search(Model model, EmpDTO dto) {
		
		List<EmpDTO> list = empService.selectEmp(dto);
		
		model.addAttribute("list",list);
		
		return "emp";
	}
	
}
