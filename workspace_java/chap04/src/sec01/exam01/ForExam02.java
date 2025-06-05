package sec01.exam01;

import java.util.Scanner;

public class ForExam02 {

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
		
		// 다른 방법
		for(int q=5; q>=1; q--) {
			for(int j=1; j<=q; j++) {
				System.out.print(6-q);
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
		
		// 다른 방법
		for(int q=1; q<=5; q++) {
			for(int j=1; j<=q; j++) {
				System.out.print(mark);
			}
			for(int t=1; t<=5-q; t++) {
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
		// 다른 방법
		for(int q=1; q<=5; q++) {
			for(int j=1; j<=5-q; j++) {
				System.out.print(space);
			}
			for(int t=1; t<=q; t++) {
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
		
		// 다른 방법
		for(int q=1; q<=5; q++) {
			for(int j=1; j<=5-q; j++) {
				System.out.print(space);
			}
			for(int t=1; t<=q; t++) {
				System.out.print(mark);
			}
			for(int j=1; j<=q-1; j++) {
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
		
		// 다른 방법
		for(int q=1; q<=5; q++) {
			for(int j=1; j<=5-q; j++) {
				System.out.print(space);
			}
			for(int t=1; t<=q; t++) {
				System.out.print(mark);
			}
			for(int j=1; j<=q-1; j++) {
				System.out.print(mark);
			}
			for(int j=1; j<=5-q; j++) {
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
		
		// 다른 방법
//		Scanner scan = new Scanner(System.in);
//		System.out.print("총 몇줄?");
//		int max = scan.nextInt();
//		
//		for(int q=1; q<=max; q++) {
//			for(int j=1; j<=max-q; j++) {
//				System.out.print(space);
//			}
//			for(int t=1; t<=q; t++) {
//				System.out.print(mark);
//			}
//			for(int j=1; j<=q-1; j++) {
//				System.out.print(mark);
//			}
//			for(int j=1; j<=max-q; j++) {
//				System.out.print(space);
//			}
//			System.out.println();
//		}
//		문제 1
//		주사위 2개를 굴려서 나올 수 있는 모든 조합을 출력한다
//		[1,1] [1,2]

		for(int x=1; x<=6; x++) {
			for(int y=1; y<=6; y++) {
				System.out.print("("+ x+ ","+ y+ ")");
			}
			System.out.println();
		}
		
		
//		문제 2
//		주사위 2개의 합 별로 나올 수 있는 조합
//		합2 : [1,1]
//		합3 : [1,2] [2,1]
		
		for(int s=2; s<=12; s++) {
			System.out.println("합: "+ s);
			for(int x=1; x<=6; x++) {
				for(int y=1; y<=6; y++) {
					if(x+y == s) {
						System.out.print("("+ x+ ","+ y+ ")");
					}
				}
			}
			System.out.println();
		}
		
//		문제 3
//		합 별 조합의 수 출력
		
		for(int s=2; s<=12; s++) {
			System.out.println("합: "+ s);
			int cnt = 0;
			for(int x=1; x<=6; x++) {
				for(int y=1; y<=6; y++) {
					if(x+y == s) {
						System.out.print("("+ x+ ","+ y+ ")");
						cnt++;
					}
				}
			}
			System.out.println("총 개수: "+ cnt);
			System.out.println();
		}
		
//		문제 4
//		순서에 관계 없이 중복 제거
//		합2 : [1,1]
//		합3 : [1,2]와 [2,1]는 같음
		System.out.println("문제 4번-----------");
		for(int s=2; s<=12; s++) {
			System.out.println("합: "+ s);
			for(int x=1; x<=6; x++) {
				for(int y=1; y<=6; y++) {
					if(x+y == s && x<=y) {
						System.out.printf("(%d, %d)", x, y);
					}
				}
			}
			System.out.println();
		}
		
		// 다른 방법
		for(int x=1; x<=6; x++) {
			for(int y=x; y<=6; y++) {
					System.out.printf("(%d, %d)", x, y);
			}
			System.out.println();
		}
		
		// 문제 5
        // 입력받은 정수에 따라 다음과 같이 출력
        /* 3
         * 00 01 02
         * 10 11 12
         * 20 21 22
         */
        /* 4
         * 00 01 02 03
         * 10 11 12 13
         * 20 21 22 23
         * 30 31 32 33
         */
        int z = 3;
		for(int x=0; x<=z-1; x++) {
			for(int y=0; y<=z-1; y++) {
				System.out.printf("%d%d ", x, y);
			}
			System.out.println();
		}
		
        // 문제 6
        // 입력받은 정수에 따라 다음과 같이 출력
        // (정사각형)
        /* 3
         * +++
         * +.+
         * +++
         */
        /* 5
         * +++++
         * +...+
         * +...+
         * +...+
         * +++++
         */
		
		int a = 10;
		for(int x=1; x<=a; x++) {
			System.out.print(mark);
		}
		System.out.println();
		for(int x=1; x<=a-2; x++) {
			System.out.print(mark);
			for(int y=1; y<=a-2; y++) {
				System.out.print(space);
				}	
			System.out.println(mark);
			}
		for(int x=1; x<=a; x++) {
			System.out.print(mark);
		}
		System.out.println();

		//  다른 방법
		
		int b = 10;
		// 한 줄마다
		for(int x=1; x<=b; x++) {
			// 한 칸마다
			for(int y=1; y<=b; y++) {
				// 처음과 마지막 줄
				if(x ==1 || x == b) {
					System.out.print(mark);
				} else {
					// 다른 줄에서
					// 처음과 마지막 칸
					if(y == 1 || y == b) {
						System.out.print(mark);
					} else {
						System.out.print(space);
					}
				}
			}	
			System.out.println();
		} 
	}

}
