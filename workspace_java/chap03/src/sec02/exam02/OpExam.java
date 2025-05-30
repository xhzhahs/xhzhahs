package sec02.exam02;

public class OpExam {

	public static void main(String[] args) {

		int x = 10;
		
		x++; 
		System.out.println("x: "+ x);
		
		++x;
		System.out.println("x: "+ x);
		
		x = 10;
		x = x + 1; 
		x += 1; // 위와 같은 코드
		x++; // 위와 같은 코드지만 1을 증가할때만 사용
		
		
		int y = 10;
		y--;
		--y;
		System.out.println("y: "+ y);
		
		x=10;
		int z = ++x; // ++가 앞에 있으면 무조건 먼저 덧셈
		System.out.println("z: "+ z);
		
		x=10;
		z = x++; // ++가 뒤에 있으면 항이 끝날 때 덧셈
		System.out.println("z: "+ z);
		System.out.println("x: "+ x);
		
		x = 10;
		System.out.println("++x: "+ ++x);
		
		x = 10;
		System.out.println("x++: "+ x++);
		System.out.println("x: "+ x);
		
		x = 1;
	//  z = 1   +   3
		z = x++ + ++x; 
		System.out.println("x: "+ x);
		System.out.println("z: "+ z);
		
		x = 1;
		// x 변화 1 >> 2 >> 1 >> 2 >> 1
		//  1   -   1 * 1   - 2    단항연산자가 먼저 계산되므로 x값 먼저 넣은 후 계산
		//  1   -  (1 * 1)  - 2
		z = x++ - --x * x++ - x--; 
		System.out.println("x: "+ x +", z: "+ z);
		System.out.printf("x: %d, z: %d", x, z);
		System.out.println();
		
		boolean a = false;
		a = !a;
		System.out.println("a: "+ a);
		
		// 나누기 할 때 0 으로 나누지 않도록 조심해야한다.
		int b = 10;
//		int c = b / 0;  0으로 나누면 에러가 난다.
		
		double d = 7.3;
		double e = d / 0;
		System.out.println(e); // 에러는 아니지만 무한으로 나타남
		
		boolean f = 3 > 4;
		System.out.println(f);
		
		System.out.println(0.1 == 0.1f); // 소수점 비교시 같은 type으로 변환 후 비교하기
		
		String s1 = "s1";
		String s2 = "s1";
		System.out.println(s1.equals(s2)); // 문자비교는 == 대신 무조건 .equals 사용
		System.out.println( "s1".equals(s2)); // 위 코드와 같은 코드
		System.out.println( !"s1".equals(s2)); 
		
		// 퀴즈
		int money = 10000;
		int coffee = 4500;
		int count = money / coffee;
		System.out.println("총 "+ count +"잔");
		int change = money % coffee;
		System.out.println("잔액: "+ change);
		
		// 퀴즈 2
		int tea = 8000;
		double pay = tea - (tea * 0.15);
		System.out.println(pay+ "원");
		
		int score = 87;
		System.out.println("내 점수는 80과 90사이다 참? 거짓?");
		
		System.out.println(score>= 80 && score <= 90);
		
		// 어떤 숫자를 10의 자리 이하 버림하고 싶은 경우
		// 957을 900으로 바꾸는 법
		// 957 - (957 % 100)
		
		int k = 1937;
		k = k - (k % 100);
		k = k / 100; // k /= 100;
		k = k * 100; // k *= 100;
		System.out.println(k);
		
		// 퀴즈
		// v1 / v2를 소수점 3자리까지 출력하시오
		double v1 = 1000.0;
		double v2 = 794.0;
		double v3 = (int)((v1 / v2) * 1000);
//		double v3 = ((int)((v1 / v2) * 1000)) / 1000.0;
//		System.out.println(v3);
		double v4 = v3 / 1000;
		System.out.println(v4);
		
		int s = 95;
		String grade = (s > 90) ? "A" : "B";
		System.out.println("grade "+ grade);
		
		
		
	}

}
