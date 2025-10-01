package kr.or.human4.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.human4.dto.EmpDTO;

@Repository
public class EmpDAOImpl implements EmpDAO{

//	mybatis를 실행
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<EmpDTO> selectListEmp() {

		List<EmpDTO> resultList = null;
		
		// DB접속 및 SQL 실행
		// xml에 (namespace.id) 넣어주기
		resultList = sqlSession.selectList("mapper.emp.selectEmp");
		
		System.out.println("resultList : " + resultList);
		
		return resultList;
	}
	
	@Override
	public EmpDTO selectOneEmp() {
		
		EmpDTO dto = null;
		
		// DB접속 및 SQL 실행
		// xml에 (namespace.id) 넣어주기
		dto = sqlSession.selectOne("mapper.emp.selectOneEmp");
		
		System.out.println("dto : " + dto);
		
		return dto;
	}
	
		
	
	@Override
	public Map selectOneEmpMap() {
		
		Map map = null;
		
		// DB접속 및 SQL 실행
		// xml에 (namespace.id) 넣어주기
		map = sqlSession.selectOne("mapper.emp.selectOneEmpMap");
		
		System.out.println("map : " + map);
		
		return map;
	}
	
	@Override
	public List<EmpDTO> selectEmpno(int empno) {
		// , 이후 한개 지정가능 빼먹지 말기 
		return sqlSession.selectList("mapper.emp.selectEmpno", empno);
	}

	@Override
	public List<EmpDTO> selectEname(String ename) {
		// , 이후 한개 지정가능 빼먹지 말기 
		return sqlSession.selectList("mapper.emp.selectEname", ename);
	}
	
	@Override
	public List<EmpDTO> selectEmpnoEname(EmpDTO dto) {
		return sqlSession.selectList("mapper.emp.selectEmpnoEname", dto);
	}

	@Override
	public int insertEmp2(EmpDTO dto) {
		System.out.println("dto : " + dto);
		int result = sqlSession.insert("mapper.emp.insertEmp2", dto);
		return result;
	}

	@Override
	public int updateEmp2(EmpDTO dto) {
		int result = sqlSession.update("mapper.emp.updateEmp2", dto);
		return result;
	}

	@Override
	public int deleteEmp2(EmpDTO dto) {
		System.out.println("dto : " + dto);
		int result = sqlSession.delete("mapper.emp.deleteEmp2", dto);
		return result;
	}
	
	@Override
	public EmpDTO selectOneEmpno(int empno) {
		return sqlSession.selectOne("mapper.emp.selectEmpno",empno);
	}
	
	
	
	
//	java로 구현
	private void testSeq() {
		EmpDTO dto = new EmpDTO();
		
		// insert 전에 seq 따오기
		int seq_empno = sqlSession.selectOne("mapper.emp.getSeqEmp2");
		
		// dto에 저장하기
		dto.setEmpno(seq_empno);
		
		// 활용하기(2군데 이상 동일한 empno 전달 가능)
		sqlSession.insert("mapper.emp.insertEmp2345", dto);	// empno 유지
		sqlSession.insert("mapper.emp.insertEmp9876", dto);	// empno 유지
	}

	// 실무편 selectKey 사용
	private void testSeq2(EmpDTO dto) {
		
		// 내부에서 seq를 따서 setEmpno로 dto에 저장함.
		sqlSession.insert("mapper.emp.insertEmp3", dto);
		// 얕은 복사라서 현재 위 줄의 dto에도 empno가 저장되어 있음.
		// 그래서 재사용 가능함.
		
		sqlSession.insert("mapper.emp.insertEmp9876", dto);	// empno 유지
	}
	
	
	// 검색. 조건을 곁들인
	@Override
	public List<EmpDTO> selectEmp(EmpDTO empDTO) {

		List<EmpDTO> resultList = null;
		
		resultList = sqlSession.selectList("mapper.emp.dynamic.selectEmp", empDTO);
		
		return resultList;
	}

	// 체크박스 선택조회
	@Override
	public List<EmpDTO> foreach(EmpDTO empDTO) {
		List<EmpDTO> resultList = null;
		
		return sqlSession.selectList("mapper.emp.dynamic.foreach", empDTO);
		
	}
	

}
