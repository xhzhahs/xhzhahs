package sec01.exam01;

public class IfExam {

	public static void main(String[] args) {

		int score = 73;
		
		if(score >= 90) {
			System.out.println("90이상입니다");
			System.out.println("A등급");
		}
		
		if(score < 90) {
			System.out.println("90미만입니다");
			System.out.println("B등급");
		} else {
			System.out.println("90미만입니다");
			System.out.println("B등급");
		}
		
		if(score >= 90) {
			System.out.println("A등급");
//		} else if(score < 90 && score >= 80) { 아래 코드와 같은 뜻
		} else if(score >= 80) {
			System.out.println("B등급");
		} else if(score >= 70) {
			System.out.println("C등급");
		} else { // else가 있으면 무조건 하나의 실행 블럭이 실행됨을 보장
			System.out.println("D등급");
		}
		
		score = 97;
		if(score >= 95) {
			System.out.println("90점 이상");
			System.out.println("95점 이상");
		} else if(score >= 90) {
			System.out.println("90점 이상");
		}		
		
		// if문 안에 if문 사용
		
		if(score >= 90) {
			System.out.println("90점 이상");
			
//			if(score >= 90 && score >= 95) {
			if(score >= 95) {
				System.out.println("95점 이상");
			}	
		}
		
		if(score >= 90) {
			System.out.println("90점 이상");
		}
		if(score >= 95) {
			System.out.println("95점 이상");
		}
		
		int x = 3;
		if(x%2 == 0) {
			System.out.println("짝수");
//		} else if(x%2 != 0) { else 와 같은 코드
//		} else if(x%2 == 1) { else 와 같은 코드
		} else {	
			System.out.println("홀수");
		}
			
		// random
		double random1 = Math.random();
		System.out.println(random1);
		
		// Math.random()
		// 무조건 0 <= Math.random() < 1 해당 범위 내의 숫자가 나온다
		// 주사위 만드는 법
		// 1. 나머지를 이용하기
		double random2 = Math.random() * 10000;
		int dice = ( (int)random2 ) % 6 + 1; 
		// % 6은 0~5까지만 나오기 때문에 1~6 숫자가 나오게 하기 위해서 +1해준다 
		System.out.println("주사위: "+ dice);
		
		// 2.
		int dice1 = (int)(Math.random() * 6) + 1;
		System.out.println("주사위: "+ dice1);
		
		// 로또번호 뽑기 : 1~ 45
		int lotto = ( (int)random2 ) % 45 + 1;
		System.out.println("로또 번호: "+ lotto);
		
		int lotto1 = (int)(Math.random() * 45) + 1;
		System.out.println("로또 번호: "+ lotto1);
		
		int num = 1;
		if( num == 1 ) {
			System.out.println("num은 1입니다");
		} else if( num ==2 ) {
			System.out.println("num은 2입니다");
		} else {
			System.out.println("num은 1과 2가 아닙니다");
		}
		
		int i = 10;
		if(i > 5) {
			System.out.println("5보다 크다");
		}
		if(i > 5) 
			System.out.println("5보다 크다");
		// if문 안쪽이 한줄일때는 {} 생략가능. 하지만 가독성이 떨어지기 때문에 생략하지 않는다
		
		
		switch(num) { 
		// char, byte, short, int, String(== 대신 equals사용)은 사용 가능.
		// long, boolean, float, double은 사용불가
			case 1:
				System.out.println("switch num은 1입니다");
//				break;
			case 2:
				System.out.println("switch num은 2입니다");
				break;
			default :
				System.out.println("switch num은 1과 2가 아닙니다");
				break;
		}
		
		// 퀴즈
		int month = 1;
		
		if (month >= 3 && month <=5) {
			System.out.println("봄");
		} else if (month >= 6 && month <=8) {
			System.out.println("여름");
		} else if (month >= 9 && month <=11) {
			System.out.println("가을");
		} else {
//		if( month == 12 || month == 1 || month == 2 )
//		if( month == 12 || month >= 1 && month <= 2 )
			System.out.println("겨울");
		}
			
		switch(month) {
		case 1:
			 System.out.println("겨울");
			 break;
		case 2:
			 System.out.println("겨울");
			 break;
		 case 3:
			 System.out.println("봄");
			 break;
		 case 4:
			 System.out.println("봄");
			 break;
		 case 5:
			 System.out.println("봄");
			 break;
		 case 6:
			 System.out.println("여름");
			 break;
		 case 7:
			 System.out.println("여름");
			 break;
		 case 8:
			 System.out.println("여름");
			 break;
		 case 9:
			 System.out.println("가을");
			 break;
		 case 10:
			 System.out.println("가을");
			 break;
		 case 11:
			 System.out.println("가을");
			 break;
		 case 12:
			 System.out.println("겨울");
			 break;
		}
		
		// switch를 잘 쓰는 방법
		switch(month) {
		 case 1:
		 case 2:
			 System.out.println("겨울");
			 break;
		 case 3:
		 case 4:
		 case 5:
			 System.out.println("봄");
			 break;
		 case 6:
		 case 7:
		 case 8:
			 System.out.println("여름");
			 break;
		 case 9:
		 case 10:
		 case 11:
			 System.out.println("가을");
			 break;
		 case 12:
			 System.out.println("겨울");
			 break;
		}
		
		// 퀴즈
//		문제 1.
//		int 변수에 임의의 수를 넣고 그 수가 "양수", "0", "음수" 구분하여 출력
		
		int q = 3;
		
		if (q == 0) {
			System.out.println("0");
		} else if (q > 0) {
			System.out.println("양수");
		} else {
			System.out.println("음수");
		}
		
//		문제 2.
//		a와 b 두 수 중에서 큰 값을 출력
		
		int a = 3;
		int b = 5;
		
		if (a < b) {
			System.out.println("b");
		} else if (a > b) {
			System.out.println("a");
		} else {
			System.out.println("a,b");
		}
		
		
//		문제 3.
//		시간 과 분이 있을 때 35분이 지난 시간을 출력

		int h = 1;
		int min = 30;
		int min1 = 35;
		
		if (min + min1 >= 60) {
			System.out.println( (h+1)+ "시 "+ (min + min1 - 60)+ "분");
		} else {
			System.out.println( h + "시 "+ (min + min1)+ "분");
		}
		
//		문제 4.
//		어떤 수가 15와 20 사이(포함)에 있는가?

		int r = 13;
		
		if (r >= 15 && r <= 20) {
			System.out.println("포함되었습니다");
		} else {
			System.out.println("포함되지 않았습니다");
		}
		
		
//		문제 5.,
//		통장 잔액이 10000원 있을 때 출금액에 따라
//		"잔액이 부족합니다", "얼마 출금 했고 얼마 남았습니다", "정확히 입력 해주세요"
		
		int m = 10000;
		int c = 1000;
		
		if (m - c < 0) {
			System.out.println("잔액이 부족합니다.");
		} else if ( c < 0 ){
			System.out.println("정확히 입력해주세요");
		} else {
			System.out.println(c +"원을 출금했고 "+ (m - c)+ "원이 남았습니다 ");
		}
		
//		문제 6.
//		값에 따라(예를 들어 125)(단, 0은 양수+짝수) "100 보다 큰 수이며, 양수이고, 홀수입니다"
//		예를들어 -6 "100 보다 작은 수이며, 음수이고, 짝수입니다"
		
		int n = 0;
		
		if (n > 0 && n >100 && n % 2 == 0) {
			System.out.println("100보다 큰 수 이며, 양수이고, 짝수입니다");
		} else	if (n > 0 && n >100 && n % 2 == 1) {
				System.out.println("100보다 큰 수 이며, 양수이고, 홀수입니다");
		} else if ( n >= 0 && n < 100 && n % 2 == 0){
			System.out.println("100보다 작은 수 이며, 양수이고 짝수입니다");
		} else if ( n > 0 && n < 100 && n % 2 == 1){
			System.out.println("100보다 작은 수 이며, 양수이고 홀수입니다");
		} else if ( n < 0 && n % 2 == 0){
			System.out.println("100보다 작은 수 이며, 음수이고 짝수입니다");
		} else {
			System.out.println("100보다 작은 수이며, 음수이고 홀수입니다");
		}
		
//		문제 7.
//		어제 온도, 오늘 온도 변수 두개 2, -3
//		"오늘 온도는 영하 3도 입니다. 어제보다 5도 낮습니다" 

		int yt = 2;
		int tt = -3;
		
		if (tt > 0 && yt < tt ) {
			System.out.println("오늘 온도는 영상 "+ tt +"도 입니다. 어제보다 "+ (yt - tt)+ "도 높습니다");
		} else if (tt > 0 && yt > tt){
			System.out.println("오늘 온도는 영상 "+ tt +"도 입니다. 어제보다 "+ (yt - tt)+ "도 낮습니다" );
		} else if (tt < 0 && yt < tt){
			System.out.println("오늘 온도는 영하 "+ (tt*-1) +"도 입니다. 어제보다 "+ (yt - tt)+ "도 높습니다 ");
		}  else {
			System.out.println("오늘 온도는 영하 "+ (tt*-1) +"도 입니다. 어제보다 "+ (yt - tt)+ "도 낮습니다 ");
		}
		
//		문제 8번.
//		변수에 두자리 숫자(10~99)가 있을 때 10의 자리와 1의 자리가 같은 수인지 판단

		int n10 = 99;  
		
		if (n10 / 10 == n10 - (n10 / 10) * 10) {
			System.out.println("같습니다");
		} else {
			System.out.println("다릅니다 ");
		}
		
		
//		문제 9번.
//		사각형의 한쪽 모서리 x1:10, y1:20
//		대각선 모서리       x2:90, y2:100
//		이럴 때 새로운 점 x3, y3는 사각형에 포함되는가?

		int x3 = 50;
		int y3 = 50;
				
		if (x3 >= 10 && x3 <= 90 && y3 >= 20 && y3 <= 100) {
			System.out.println("사각형에 포함됩니다");
		} else {
			System.out.println("사각형에 포함되지 않습니다");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
