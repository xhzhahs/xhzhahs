package sec04.exam01.method;

public class CalcExam {

	public static void main(String[] args) {

		Calc calc = new Calc();
		
		calc.powerOn(); // 여기서 ()는 실행의 괄호
		calc.powerOff();
		
		int sum = calc.plus(5, 7);
		System.out.println("sum: "+ sum);
		
		int x = 5;
		sum = calc.plus(x, 7);
		System.out.println("sum: "+ sum);
		
		int a = 5; // 값만 있다면 변수명은 상관 없음
		sum = calc.plus(a, 7);
		System.out.println("sum: "+ sum);
		
		double b = calc.divide(10, 5);
		System.out.println("divide: "+ b);
		
		int[] c = {1,2,3,4,5};
		int sum2 = calc.sum(c);
		System.out.println("sum2: "+ sum2);
		System.out.println("c[0]: "+ c[0]);
		
		
		
		
		
		
		
		
		
		
	}

}
