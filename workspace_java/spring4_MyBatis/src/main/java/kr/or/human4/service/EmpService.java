package kr.or.human4.service;

import java.util.List;
import java.util.Map;

import kr.or.human4.dto.EmpDTO;

public interface EmpService {

	public List<EmpDTO> getEmpList();
	public EmpDTO getEmp();
	public Map getEmpMap();
	public List<EmpDTO> getEmpno(int empno);
	public List<EmpDTO> getEname(String ename);
	public List<EmpDTO> getEmpnoEname(EmpDTO dto);
	public int addEmp2(EmpDTO dto);
	public int modifyEmp2(EmpDTO dto);
	public int removeEmp2(EmpDTO dto);
	public EmpDTO getOneEmpno(int empno);
	
	
	public List<EmpDTO> selectEmp(EmpDTO dto);
	public List<EmpDTO> foreach(EmpDTO dto);
}
