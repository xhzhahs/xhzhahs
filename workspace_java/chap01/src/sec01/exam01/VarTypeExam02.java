package sec01.exam01;

public class VarTypeExam02 {

	public static void main(String[] args) {

		byte b1;
		b1 = 127;
		System.out.println("b1: "+ b1);
//		b1 = 128; // byte 이기 때문에 128은 못쓴다. 127까지만 가능
		
		char c1 = 65;
		System.out.println("c1: "+ c1); // char는 글씨 전용 변수로 A가 출력
		c1 = 65 + 2;
		System.out.println("c1: "+ c1); // C 출력
		
		char c2 = 'F'; // char 타입에만 유일하게 홀따옴표''를 사용
		System.out.println("c2: "+ c2);
		System.out.println("c1-c2: "+ (c2-c1));
		
		char c3 = '한';
		System.out.println("c3: "+ c3);
		System.out.println("c3: "+ (c3+1)); // ()를 씌우면 숫자로 계산 됨
		
		String s1 = "최아라";
		System.out.println("s1: "+ s1);
		
		String s2 = "최\"아라"; // "" 안에 "를 넣고 싶으면 중간"앞에 \입력
	    System.out.println("s2: "+ s2);
		
	    String s3 = "최\t아\n라"; // \n은 엔터역할, \t는 tab 역할
		System.out.println("s3: "+ s3);
		
		s3 = s3 + "글씨" + 3 + 2 + (3 + 2); // 덧셈만 가능. 앞 순서부터 계산되므로 앞 순서가 문자면 뒷순서 숫자도 문자로 인식.
		                                    // 뒤 순서에 숫자 계산 할거면 () 사용
		System.out.println(s3);
		
		String s4 = 3 + 2 + "글씨"; // 앞 순서가 숫자이므로 숫자 먼저 계산 후 문자 덧셈.
		System.out.println(s4);
		
		String s5 = s3 + s4;
		System.out.println(s5);
		
		
		int i1 = 2100000000;
//		int i2 = 2200000000; int에서 21억 이상은 사용할 수 없음
		System.out.println(i1);
		
		long l1 = 2200000000L; // L을 붙이지 않으면 int로 인식. 그러므로 long 사용시 L 붙여주기.
							   // int 허용 범위 숫자에는 L붙이지 않아도 됨.
		long l2 = 123;
		System.out.println(l1 + l2);
		
		float f1 = 3.14f; // float를 사용할 때는 뒤에 f를 써야함. 8자리 수까지만 가능
		System.out.println("f1: "+ f1);
		double d1 = 3.14;
		System.out.println("d1: "+ d1);
		
		float f2 = 0.123456789f;
		System.out.println("f2: "+ f2); // 0.12345679로 나온 이유는 자리수 부족으로 뒷자리에서 반올림 되었기 때문
		                                // float의 정밀도 : 소수점 7번째 자리까지만 신뢰가능
		
		double d2 = 0.12345678901234567890; // double의 정밀도 : 소수점 16번째 자리까지 신뢰가능
		System.out.println("d2: "+ d2);
		
		double i10 = 5e2; // 10*10 자바에서는 e2로 표현. c언어는 10^2로 표현
		System.out.println(i10);
		
		boolean stop = true;
		boolean start = false;
		System.out.println(stop);
		
		// 문제
		
		int age = 29;
				
		boolean car = true;
		
		int phone = 4;
		
		String name = "최아라";
		
		double area = 5 * 3.3;
		
		// 문제
		
		int a = 3;
		int b = 4;
		
		System.out.println(a + "과 "+ b);
		
		// 퀴즈 1
		
		System.out.println(a + ">" + b + "의 결과는 " +(a>b) + "입니다");
		
		a = 6;
		b = 5;
		System.out.println(a + ">" + b + "의 결과는 " +(a>b) + "입니다");
		
		// 퀴즈 2
//		내가 푼 답
//		int a100 = 5;
//		int a10 = 3;
//		int a1 = 7;
//		
//		System.out.println("백의 자리: " + a100 + "\n십의 자리: " + a10 + "\n일의 자리: " + a1 );
		
		int num = 987;
		int bak = num / 100;
		System.out.println("백의 자리: " + bak);
		num = num - (bak * 100);
		System.out.println("num: " + num);
		int ship = num / 10;
		System.out.println("십의 자리: " + ship);
		num = num - (ship * 10);
		System.out.println("num: " + num);
		System.out.println("일의 자리: " + num);
		
		
		
	}

}
