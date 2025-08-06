package sec02.exam01;

import java.util.Comparator;

public class ComparatorImpl implements Comparator {

	// 여기서 Object는 최상위 클래스다. 
	// 숫자든 문자든 아무거나 넣어도 된다.
	@Override
	// compare는 작은 값이 앞으로 가게 해준다.
	// 같으면 그냥 그대로
	public int compare(Object o1, Object o2) {
		MemberDTO dto1 = (MemberDTO)o1;
		MemberDTO dto2 = (MemberDTO)o2;
	
		int result = dto1.age - dto2.age; // 오름차순 
		
		return result;
	}

}
