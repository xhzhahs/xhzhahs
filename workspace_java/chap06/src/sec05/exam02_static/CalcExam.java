package sec05.exam02_static;

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
		
		
		
		
		
		
		
	}

}
