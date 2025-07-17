package sec01.exam03.override;

public class Calc {

	double areaCircle(double r) {
		System.out.println("Calc의 areaCircle");
		return r * r * Math.PI;		// 원의 너비 구하는 공식
	}
	
	public int plus(int x, int y) {
		System.out.println("Calc의 plus실행");
		return x + y;
	}
	
}
