package sec01.exam01;

public class ForExam {

	public static void main(String[] args) {

		int sum = 0;
		for (int i=1; i<=100; i++) { 
			// for (int i=1; 
			//      i<=100; 
			//      i++) ()의 문장은 사실상 각각 한 문장이다.
			sum = sum +i;
		}
		System.out.println("1~100의 합: "+ sum);
		
//		int sum = 0;
//		int i = 1;
//		for (    ; i<=100; i++) { 
//			sum = sum +i;
//		}
//		System.out.println("1~100의 합: "+ sum);
//		
//		int sum = 0;
//		int i;
//		for ( i = 1; i<=100; i++) { 
//			sum = sum +i;
//		}
//		System.out.println("1~100의 합: "+ sum); 
//		위 코드들은 같은 코드
		
		int sum0 = 0;
		for (int i = 1; i<=100; i = i + 2) { 
			sum0 = sum0 +i;
		}
		System.out.println(sum0);
		
		// 1씩 증가하는 것을 10번 하려고 할 때 
		int sum1 = 0;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		System.out.println(sum1);
		
		// for문으로 변경
		sum1 = 0;
		for(int i=1; i<=10; i++) {
			sum1 = sum1 + 1;
		}
		System.out.println("sum1: "+ sum1);	
		
		int limit = 10;
		for(int i = 1; i <= limit; i = i + 1) {
			sum1 = sum1 + 1;
		}
		
		// 1~5까지 합 구하기 
		/*
		for (int i = 1; i<=5; i = i + 1) { 
			sum = sum +i;
		}
		분해해 보자.
		 */
		
		int i = 1;
		sum = 0;
		
		sum = sum + i; // i:1
		i++;
		
		sum = sum + i; // i:2
		i++;

		sum = sum + i; // i:3
		i++;
		
		/*
		 * 반복문 만드는 원리
		 1. 반복되는 것 찾기
		  	ctrl + c, v 했을 때 바뀌지 않는 것
		 2. 반복되지 않는 것에서 규칙(패턴) 찾기
		  	변수를 활용해서 더 이상 바뀌지 않게 만들기
		 3. 시작 조건 파악
		 4. 종료 조건 파악	
		 
		 for : 반복 횟수를 아는 경우
		 while : 반복 횟수를 모르는 경우
		 */
		
		// 구구단 2단을 출력하시오

		int x2 = 0;
		for(int i2 =1; i2<=9; i2++) {
			x2 = 2 * i2;
			System.out.println("2 x "+ i2 +" = "+ x2);
		}
		
		// 2~10까지 중 짝수만 출력
		/* 
		 * int i3 = 2;
		 
		System.out.println(i3);
		i3 = i3 + 2;
		
		System.out.println(i3);
		i3 = i3 + 2;
		
		System.out.println(i3);
		i3 = i3 + 2;
		
		System.out.println(i3);
		i3 = i3 + 2;
		
		System.out.println(i3);
		*/
		
		for(int i3 = 2; i3<=10; i3 = i3 + 2) {
			System.out.println(i3);
		}
	
		// 10~1까지 출력
		/* 
		 * int i4 = 10;
		 
		System.out.println(i4);
		i4 = i4 - 1;
		
		System.out.println(i4);
		i4 = i4 - 1;
		
		System.out.println(i4);
		i4 = i4 - 1;
		
		System.out.println(i4);
		i4 = i4 - 1;
		
		System.out.println(i4);
		*/		
		for(int i4 = 10; i4 >=1; i4 = i4 - 1) {
			System.out.println(i4);
		}
				
		// 1~10까지 다음과 같이 출력
		// 1: 홀수
		// 2: 짝수
		for(int i5 = 1; i5<=10; i5++) {
			if(i5 % 2 == 0) {
				System.out.println(i5 +": 짝수");
			} else {
				System.out.println(i5 +": 홀수");
			}
		}
		
		// 1~10까지 3개씩 옆으로 찍기
		for(int i6 = 1; i6 <= 10; i6++) {
			if(i6 % 3 == 0) {
				System.out.println(i6);
			} else {
				System.out.print(i6+ " ");
			}
		}
		
		/* 
		 * 다른 방법1
		 * for(int i6 = 1; int6 <= 10; int6 += 3) {
		 * 		if(int6 != 10) {
		 * 			System.out.println(i6+ " "+(i6+1) +" "+ (i6+2));
		 * 		} else {
		 * 			System.out.println(i6);
		 * 		}
		 * }
		 */
		/*
		 * 다른 방법2
		 * int i6 =1;
		 * for(int i6 =1; i6 <= 10; i6++) {
		 * 		System.out.print(i6+ " ");
		 * 		if(i6 % 3 == 0) {
		 * 			System.out.println();
		 * 		}
		 * }
		 */
		
		System.out.println();
		
		// 1부터 100까지 홀수의 개수
	
		int count = 0;
		for(int i7 = 1; i7 <= 100; i7++) {
			if(i7 % 2 != 0) {
			count = count +1;	// count++;로 쓰기 가능
			}
		}
		System.out.println("홀수는 "+ count+ "개 입니다");
		
		
		// 구구단 전체 출력 (2단부터 9단까지)
		for(int d = 2; d <=9; d++) {
			System.out.println(d + "단");
			for(int i8 = 1; i8<=9; i8++) {
				System.out.println(d+ " x "+ i8+ " = "+ (d * i8));
			}
			System.out.println();
		}
		
		// 구구단 단별로 한줄로 출력
		for(int d = 2; d <=9; d++) {
			for(int i8 = 1; i8<=9; i8++) {
				System.out.print(d+ " x "+ i8+ " = "+ (d * i8)+ " ");
			}
			System.out.println();
		}
		
		// 두~세단씩 옆으로 출력
		System.out.println("문제-------------------------");
		for(int k = 2; k <=9; k+=2) {
			for(int i8 = 1; i8<=9; i8++) {
				System.out.println(k+ " x "+ i8+ " = "+ (k * i8)+ " "+k+ " x "+ i8+ " = "+ (k * i8)+ " ");
			}
		}
		// 풀이
		System.out.println("문제풀이-------------------------");
		for(int k=2; k<=9; k+=2) {
			for(int j = 2; j<=9; j++) {
				System.out.print(k+ " x "+ j+ " = "+ (k * j)+ " ");
				if((k+1)<=9) {
				System.out.println((k+1)+ " x "+ j+ " = "+ ((k+1) * j)+ " ");
				}
			}	
			System.out.println();
			
		}

		// 피라미드 찍기
		/*
		....+....
		...+++...
		..+++++..
		.+++++++.  
		+++++++++ 
		 */
		
		// 0단계: + 5번 찍기
		/*
			 +
			 +
			 +
			 +
			 +
		 */
//		System.out.println("+");
//		System.out.println("+");
//		System.out.println("+");
//		System.out.println("+");
//		System.out.println("+");

		for(int j=1; j<=5; j++) {
			System.out.println("+");
		}
		
		String mark = "+";
		// 1단계
		// +++++ 출력
		System.out.print(mark);
		System.out.print(mark);
		System.out.print(mark);
		System.out.print(mark);
		System.out.println(mark);
		
		for(int j=1; j<=5; j++) {
			System.out.print(mark);
		}
		System.out.println();
		
		// 2단계
		// +.+.+.+.+. 출력
		String space = ".";
		for(int j=1; j<=5; j++) {
			System.out.print(mark + space);
		}
		System.out.println();
		// 다른방법
		for(int j=1; j<=5; j++) {
			System.out.print(mark);
			System.out.print(space);
		}
		System.out.println();
		
		// 3단계
		/*
			 +++++
			 +++++
			 +++++
		 */
		for(int q=1; q<=3; q++) {
			for(int j=1; j<=5; j++) {
				System.out.print(mark);
			}
			System.out.println();
		}
		
		// 4단계
		/*
			11111
			22222
			33333
			44444
			55555
		 */
		for(int q=1; q<=5; q++) {
			for(int j=1; j<=5; j++) {
				System.out.print(q);
			}
			System.out.println();
		}
		// 5단계
		/*
			 1
			 22
			 333
			 4444
			 55555
		 */
		
		for(int q=1; q<=5; q++) {
			for(int j=1; j<=q; j++) {
				System.out.print(q);
			}
			System.out.println();
		}
		
		// 6단계
		/*
			+
			++
			+++
			++++
			+++++ 
		 */
		for(int q=1; q<=5; q++) {
			for(int j=1; j<=q; j++) {
				System.out.print(mark);
			}
			System.out.println();
		}
		
		// 7단계
		/*
			11111
			2222
			333
			44
			5
		 */
		for(int q=1; q<=5; q++) {
			for(int j=5; j>=q; j--) {
				System.out.print(q);
			}
			System.out.println();
		}
		
		// 8단계
			/*
				+....
			    ++...
			    +++..
			    ++++.
			    +++++
			 */
		for(int q=1; q<=5; q++) {
			for(int j=1; j<=q; j++) {
				System.out.print(mark);
			}
			for(int t=4; t>=q; t--) {
				System.out.print(space);
			}
			System.out.println();
		}
		
		// 9단계
		/*
			....+
		    ...++
		    ..+++
		    .++++
		    +++++
		 */
		for(int q=1; q<=5; q++) {
			for(int t=4; t>=q; t--) {
				System.out.print(space);
			}
			for(int j=1; j<=q; j++) {
				System.out.print(mark);
			}
			System.out.println();
		}
		
		
		// 10단계
		/*
			....+
		    ...+++
		    ..+++++
		    .+++++++
		    +++++++++
		 */
		for(int q=1; q<=5; q++) {
			for(int t=4; t>=q; t--) {
				System.out.print(space);
			}
			for(int j=1; j<=q; j++) {
				System.out.print(mark);
			}
			for(int j=2; j<=q; j++) {
				System.out.print(mark);
			}
			System.out.println();
		}
		
		
		// 11단계
		/*
			....+....
		    ...+++...
		    ..+++++..
		    .+++++++.
		    +++++++++
		 */
		for(int q=1; q<=5; q++) {
			for(int t=4; t>=q; t--) {
				System.out.print(space);
			}
			for(int j=1; j<=q; j++) {
				System.out.print(mark);
			}
			for(int j=2; j<=q; j++) {
				System.out.print(mark);
			}
			for(int t=4; t>=q; t--) {
				System.out.print(space);
			}
			System.out.println();
		}
		
		
		// 12단계
		// 입력받은 줄 수대로 출력
		// 예를 들어 3이면
		/*
			..+..
		    .+++.
		    +++++ 
		 */
		int h = 10;
		for(int q=1; q<=h; q++) {
			for(int s=h-1; s>=q; s--) {
				System.out.print(space);
			}
			for(int j=1; j<=q; j++) {
				System.out.print(mark);
			}
			for(int j=2; j<=q; j++) {
				System.out.print(mark);
			}
			for(int s=h-1; s>=q; s--) {
				System.out.print(space);
			}
			System.out.println();
		}
		
		
		
		
	}

}
