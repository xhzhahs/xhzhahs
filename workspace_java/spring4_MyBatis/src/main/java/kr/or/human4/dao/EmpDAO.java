package kr.or.human4.dao;

import java.util.List;
import java.util.Map;

import kr.or.human4.dto.EmpDTO;

public interface EmpDAO {

	public List<EmpDTO> selectListEmp();
	public EmpDTO selectOneEmp();
	public Map selectOneEmpMap();
	public List<EmpDTO> selectEmpno(int empno);
	public List<EmpDTO> selectEname(String ename);
	public List<EmpDTO> selectEmpnoEname(EmpDTO dto);
	public int insertEmp2(EmpDTO dto);
	public int updateEmp2(EmpDTO dto);
	public int deleteEmp2(EmpDTO dto);
	public EmpDTO selectOneEmpno(int empno);
	
	public List<EmpDTO> selectEmp(EmpDTO empDTO);
}
