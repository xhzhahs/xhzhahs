package sec05.exam02_static;

import java.util.Scanner;

public class Calc {

	// static 선발대같은 의미
	// 메모리가 다른 곳으로 감
	// static이긴 하지만 그래봤자 필드다.
	String color;
	static double pi = 3.14; 
	
	static int a =10;
//	int a = 10;
//	static int price = a;
	
	static int price;
//	price = 100; 행동이므로 필드에 사용할 수 없다.
	// 생성자처럼 쓸 수 있는 static 블럭이 따로 있다.
	static {
		price = 100;
		
		System.out.println("값을 입력하시오");
		// 스캐너로도 가능
//		Scanner scan = new Scanner(System.in);
//		price = scan.nextInt();
	}
	
	Calc(){
		price = 10000;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
