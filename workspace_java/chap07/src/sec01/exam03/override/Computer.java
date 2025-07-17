package sec01.exam03.override;

public class Computer extends Calc {
	
	/**
	 	부모가 private일 때 자식이 public이 될 순 있지만
	 	부모가 public일 때 자식이 private가 될 수 없다.
	 */
	@Override	// 부모에 해당 매소드가 똑같이 선언되어 있는지 검사해주는 역할 
	public double areaCircle(double r) {
		System.out.println("Computer의 areaCircle");
		return r * r * Math.PI;		// 원의 너비 구하는 공식
	}
	
	@Override 
	public int plus(int x, int y) {
		int result = super.plus(x, y);	// 부모의 plus를 불러와서 쓴다.
		
		System.out.println("Computer의 plus 실행");
		System.out.println("정답은 바로 "+result+"입니다.");
		return result;
	}
}
