package sec06.exam02.pack3;

import sec06.exam02.pack2.Human;
//import sec06.exam02.pack1.Human; // 동일한 클래스 명이라 안됨

import sec06.exam02.pack1.*;

public class HumanExam {

	public static void main(String[] args) {

		
		new Human(); // pack2.Human

//		Human h2 = new sec06.exam02.pack1.Human(); 우연히 내용물이 같을 뿐 이렇게 쓸 수 없다.
//		sec06.exam02.pack1.Human h2 = new sec06.exam02.pack1.Human(); // 이렇게 써야함.
		
		new Human(); // import sec06.exam02.pack1.*;로 인하여 pack1.Human은 가능
		
		// 하위 패키지의 클래스라서 가져오지 못한다.
//		new Sub1(); // pack1.sub1.Sub1
		
		// import java.lang.* 은 자동 선언 되어서 import 생략
		String a = "1"; // String
		System.out.println(); // System
		Math.random(); // Math
		
		
		
	}

}
