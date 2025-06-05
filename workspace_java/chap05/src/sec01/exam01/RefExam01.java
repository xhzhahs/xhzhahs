package sec01.exam01;

public class RefExam01 {

	public static void main(String[] args) {

		int a = 10;
		int b = a;
		System.out.println(a+ ", "+ b);
		
		b = 12;
		System.out.println(a+ ", "+ b);

		String c = "최아라"; 
		// = 기준으로 우측이 먼저 실행됨
		// "최아라"가 힙(heap) 영역에 비어있는 번지에 할당됨
		// 그 다음에 스택(stack) 영역 변수 c에 방금 할당된 번지를 저장
		System.out.println("c : "+ c);
		
		System.out.println(a == b);
		// == 또는 != 는 무조건 stack의 값을 비교함
		
		String d = new String("최아라"); // 이게 원래 정석이지만 String d = "최아라"로 사용 가능
		
		System.out.println(c == d);
		System.out.println(c.equals(d));
		// d는 새로운 번지가 할당되기 때문에 c와 d는 다르다
		// String(문자)의 값을 비교하기 위해서는 == 대신 .equals() 사용
		
		String e = d;
		System.out.println(e == d);
		
		String f0 = "최아라";
		System.out.println("c == f0: "+ (c == f0));
		String f = "최"+"아라";
		System.out.println("c == f: "+ (c == f));
		
//		a = null; 기본 타입에는 null을 넣을 수 없다. 참조타입에는 가능
		
		// null : 참조하는 주소가 없는 상태

		String g = "휴먼";
		System.out.println("g == null: "+ (g == null));
		System.out.println("g == null: "+ (g != null));
		
		String h = ""; // ""은 null이 아니다
		System.out.println("h == null: "+ (h != null));
		
		g = null;
		System.out.println("g == null: "+ (g == null));
		System.out.println("g + \"abc\": "+ (g+ "abc"));
		
		System.out.println(h.equals(g));
		if( g!= null) { // 방어코딩
			System.out.println(g.equals(h));
		}
		
		
	}

}
