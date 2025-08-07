package sec02.exam01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderExam {

	public static void main(String[] args) {

		MemberDTO m1 = new MemberDTO();
		MemberDTO m2 = new MemberDTO();
		MemberDTO m3 = new MemberDTO();
		
		System.out.println(m1);
		System.out.println(m1.toString());
		
		m1.name = "이름1";
		m1.age = 25;

		m2.name = "이름2";
		m2.age = 32;
		
		m3.name = "이름3";
		m3.age = 29;
		
		
		// ArrayList list = new ArrayList(); 대신 아래 많이 씀
		// new List();는 안됨. 이유는 List는 인터페이스이기 때문에
		List list = new ArrayList();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		
		
		
		
		// 클래스로 구현한 경우
		Comparator c1 = new ComparatorImpl();
		
		// 익명 객체로 구현한 경우
		// 여기서 딱 한번만 쓸거기 때문에 파일로 만들지 않고
		// 익명 객체로 구현한다.
		Comparator c2 = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				MemberDTO dto1 = (MemberDTO)o1;
				MemberDTO dto2 = (MemberDTO)o2;
			
				int result = dto1.age - dto2.age; // 오름차순 
				
				return result;
			}
			
		};
		
		// Collections가 list를 가져다가  c2에 있는 정보로 정렬해준다.
		// 현재 c2(compare)가 오름차순이기 때문에 오름차순으로 정렬
		Collections.sort(list, c2);  
		
		for(int i=0; i<list.size(); i++) {
			MemberDTO dto = (MemberDTO)list.get(i);
			System.out.println(dto.age);
		}
	}

}
