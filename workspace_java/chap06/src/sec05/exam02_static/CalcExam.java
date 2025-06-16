package sec05.exam02_static;

//import java.util.ArrayList; // 패키지를 포함한 클래스 정보 적어두기
//import java.util.HashMap;
import java.util.*; // *로 쓰면 폴더는 건드리지 않고 파일만 가져옴.


public class CalcExam {

	public static void main(String[] args) {
		
		// static은 new를 하지 않아도 Calc로 불러올 수 있다.
		// static 쓰는 방법 
		System.out.println("Calc : "+ Calc.pi);

		// 이렇게도 쓸수 있지만 Calc.pi로 쓰는 게 올바른 사용법이다.
		Calc c1 = new Calc();
		c1.color = "블루";
		c1.pi = 3.141592; // c1을 변경하였는데 c2도 변경됨
		System.out.println("c1 : "+ c1.pi);
		
		Calc c2 = new Calc();
		c1.color = "레드";
		System.out.println("c1 : "+ c1.pi);
		
		System.out.println(Math.PI);
		
		// test 메소드 사용하기
//		test(); // static 이 아니라서 사용할수 없음
		
//		CalcExam c3 = new CalcExam();
//		c3.test();
		
		test(); // static void로 static으로 바꿔줘서 사용가능
	
		// import 하는 방법
//		java.util.ArrayList list = new java.util.ArrayList();
		ArrayList list = new ArrayList();
		
		HashMap map = new HashMap();
		
	}
		// main 영역 밖에서 static 사용
	
		// 1. 메소드명 test 만들기
		// 전달인자 / 리턴타입 없음
		// 그냥 아무 말이나 출력
		
//		void test() {
		static void test() {
			System.out.println("홍길동");
		}
		

}
