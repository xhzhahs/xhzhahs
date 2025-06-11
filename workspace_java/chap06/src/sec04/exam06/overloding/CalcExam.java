package sec04.exam06.overloding;

public class CalcExam {

	public static void main(String[] args) {

		Calc calc = new Calc();
		
		calc.plus(10, 3);
		calc.plus(10.5, 3.3);
		calc.plus(10, 3.3);
		
		Calc c1 = new Calc();
		Calc c2 = new Calc();
		Calc c3 = new Calc();
		Calc c4 = new Calc();
		Calc c5 = new Calc();
		
		c1.setInfo("모델a", "검정", 2025);
		c2.setInfo("모델b", "파랑", 2025);
		c3.setInfo("모델c", "빨강"); // 출고연도 동일할 경우
		c4.setInfo("모델d"); // 출고연도, 색상 동일할 경우
		
		
		// int나 double에 null을 넣고 싶다면?
		Integer i = 3;
		
		if( i != null ) {
			int i2 = i;
		}
		Integer i3 = null; // Integer가 참조타입이므로 null 가능
//		int i1 = i3; int에 null을 넣을 수 없으므로 에러남 
		Double i4 = null; // D가 대문자인 Double은 참조타입
		
		Calc d = calc.newCalc();
		
		
		
		
	}

}
