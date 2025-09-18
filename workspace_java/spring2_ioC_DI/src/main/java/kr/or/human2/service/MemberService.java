package kr.or.human2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import kr.or.human2.dao.MemberDAO;

// bean으로 등록시키는 component 역할을 해줌
@Service
public class MemberService {

//	1. 강한 의존 상태
//	public List getList() {
//		MemberDAOImpl memberDAO = new MemberDAOImpl();
//		return memberDAO.select();
//	}
	
//	2. 전달 받아서 의존성을 낮춘 상태( 약하게 만듦)
//	public List getList(MemberDAO memberDAO) {
//		return memberDAO.select();
//	}
	
//	getter, setter 형태
//	private MemberDAO memberDAO = null;
//	public void setMemberDAO(MemberDAO memberDAO) {
//		this.memberDAO = memberDAO;
//	}
//	
//	MemberService(MemberDAO memberDAO) {
//		this.memberDAO = memberDAO;
//	}
	
	
//	spring에 등록된 bean들 중에 
//	자동 형변환되는 애들을 찾아 
//	대신 new해서 대신 memberDAO에 넣어줌
//	우선순위
//	1. 정확히 동일한 타입의 클래스
//	2. 자동 형 변환이 가능한 클래스
//	Autowired = 자동으로 엮어줌.
	
	// Qualifier = dao에서 별칭이 있는 것을 지정해서 불러옴
	// Autowired와 같이 있어야함
//	@Qualifier("dao1")	
//	@Autowired
//	MemberDAO memberDAO;
//	public List getList() {
//		return this.memberDAO.select();
//	}
	
	// 별칭 붙여서 가져올시 이런 방법도 가능
	@Autowired
	MemberDAO dao1;
	public List getList() {
		return this.dao1.select();	// 별칭으로 바꿔주기
	}
	
	
	
}
