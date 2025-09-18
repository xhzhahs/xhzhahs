package kr.or.human2.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

// component로 써도 되는데 repository가 try-catch가 좀 더 묻어있어서
// 주로 repository 사용

// repository = 저장소
// 별칭을 사용할 수 있음.
// 생략한다면 기본값은 앞글자만 소문자로 ex)memberDAOImpl
@Repository("dao1")	
public class MemberDAOImpl implements MemberDAO{

	@Override
	public List select() {
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		return list;
	}
	
}
