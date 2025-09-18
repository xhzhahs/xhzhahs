package kr.or.human2.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

// component로 써도 되는데 repository가 try-catch가 좀 더 묻어있어서
// 주로 repository 사용

// repository = 저장소
@Repository
//@Primary	// css에서 !important같은 역할 먼저 선택됨. 딱 한번만 사용가능
public class MemberDAOImpl2 implements MemberDAO{

	@Override
	public List select() {
		List list = new ArrayList();
		list.add("하나");
		list.add("둘");
		list.add("셋");
		
		return list;
	}
	
}
