package sec01.exam01;

public class TypeCastingExam03 {

	public static void main(String[] args) {
	

		// 기본 타입 허용 범위 크기순
		// byte < short < int < long < float < double
		// type이 다른 두 변수는 호환 불가능. 숫자는 서로 변환 가능
		
		// 형 변환 연산자( type casting operator )
		int intValue = 10;
		byte byteValue = (byte)intValue;
		
		intValue = 200;
		byteValue = (byte)intValue;
		System.out.println(byteValue); // byte의 허용범위를 넘어가는 값이 들어가면 예상하기 힘들다.
								       // 비트를 2의 보수로 계산한 결과가 나온다.
		
		double d = -3.14;
		int i = (int) d; // double 타입을 int타입에 넣는 형식 
		                  // int는 정수만 담을 수 있으므로 소수점은 버린다.
		System.out.println("i: "+ i);
		
		int i2 = 100;
		long l1 = (long)i2; // long이 int보다 더 큰 범위를 허용하므로 (long)을 생략할 수 있다.
		long l2 = i2;
		
		int i3 = 3;
		long l3 = 4L;
		long l4 = i3 + l3; // (long)i3 + l3이어야 하는데 연산시 int가 long으로 자동 변환된 경우다.
		System.out.println(l4);
		
		int i7 = 10;
		double d7 = 5.5;
		double d8 = i7 + d7; // (double)i7 + d7 이어야 하는데 생략된 경우이다.
		System.out.println("d8: "+ d8);
		
//		double d9 = 10 / 4; // 2.5가 아닌 2.0이 나오는 이유는? 
		                    // "=" 우측부터 계산되므로 10과 4는 int에 담긴것으로 되어서 결과도 int로 나온 것
//		double d9 = (double)10 / (double)4; double이 더 큰 범위이기 때문에 4는 int여도 자동으로 double로 변환된다.
		double d9 = (double)10 / 4;
		System.out.println("d9: "+ d9);
		
		
		// 문자를 숫자로 바꾸는 방법
		String s1 = "123";
//		String s1 = "123a"; 숫자가 아닌 문자가 포함되면 변환하지 못한다.
//		int i8 = (int)s1; 문자는 int로 바꾸지 못함. int로 바꾸는 것은 숫자끼리만 가능.
		int i8 = Integer.parseInt(s1);
		System.out.println(i8);
		
		// 가장 쉽게 숫자를 문자로 바꾸는 방법
		String s2 = ""+ i8;
		
		//퀴즈
		double total = 4.3; 
		int count = 4; 
		double result1 = total / count;
		System.out.println("1번: "+ (result1 * 10000));
		
		int result2 = (int)result1;
		System.out.println("2번: "+ (result2 * 10000));
		
		double result3 = total - (result2 * (count-1));
		System.out.println("3번: "+ (result3 * 10000));
		System.out.println("3번: "+ (Math.ceil(result3 * 10000)));
		
				
		
		
		
		
	}

}
