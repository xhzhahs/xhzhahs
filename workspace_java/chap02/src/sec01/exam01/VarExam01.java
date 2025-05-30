package sec01.exam01;

public class VarExam01 {

	public static void main(String[] args) {

		// 이클립스 단축키
		/*
		 * 한줄 지우기 : ctrl + d
		 * 한줄 복사   : ctrl + alt + 위아래 방향키
		 * 주석 단축키 : ctrl + /
		 * 한줄 이동   : alt + 위아래 방향키
		 * 자동 정렬   : ctrl + shift + f
		 */
		
		// userInfo 처럼 중간에 대소문자를 바꿔서 작성하는 것을 카멜케이스(camel case)라고 한다.
		// user_info 처럼 _를 사용하는 것을 스네이크 케이스(snake case)라고 한다.
		// user-info 처럼 -를 중간에 사용하는 것을 캐밥케이스(kebab case)라고 한다.
		// nUserInfo, sUserInfo : 헝가리언 표기법
		
		int value; // 변수 선언
		value = 5; // 변수에 값 넣기
		value = 6; // 5였다가 6으로 덮어씀
		System.out.println(value);
		
		int result = value + 10;
		
		System.out.println(result); // syso 입력하고 ctrl+ 스페이스바 누르면 자동완성됨

		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분"); // 숫자 + 문자 = 문자
		
		System.out.println("value : "+ value);

		value = value + 1; // = 을 기준으로 우측이 먼저 실행됨. 그러므로 value는 7
		System.out.println("value : "+ value);

		// 변수 a를 선언과 동시에 10으로 초기화
		int a = 10;
		int b; // 변수 선언
//		System.out.println(b); 에러 발생
		System.out.println(a);
		
		 int x = 10;
		 int y = x;
//		 int x = 10000; 덮어쓸 때는 int를 제외하고 x만 사용하여야 함
//		 x = 10000; x를 10000으로 덮어씀
		 
		 System.out.println(y);
		 {
//			 int x = 3; {} 밖에 x가 {} 안에 영향을 미치기 때문에 선언불가
			 System.out.println(x);
			 int z = 5;
			 System.out.println("z :"+z);
		 }
//		 System.out.println("z :"+z); 지역변수 z가{}밖으로 벗어났기 때문에 실행할 수 없음
	
		 int z = 55; // 앞 {} 안에 있는 지역변수 z가 소멸되었기 때문에 {} 밖에서 다시 선언가능
		 System.out.println("z : "+ z);
		 
		 
		 int x1 = 26845;
		 int x2 = 684684;
		 
		 int x3 = x1;
		 x1 = x2;
		 x2 = x3;
		 
//		 int x2 = x1*0 + x2;
//		 int x1 = x2*0 + x1;
		 		 
		 
		 System.out.println("x1 : "+ x1);
		 System.out.println("x2 : "+ x2);
		 
		 
	}

}

