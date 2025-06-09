package sec01.exam01;

import java.util.Scanner;

public class ArrayExam02 {

	public static void main(String[] args) {

		/*
		 * 배열 array
		 * 한번에 여러 변수를 만드는 방법
		 * 같은 타입만 선언할 수 있음
		 * 생성할 때 전체 크기를 지정해줘야 함
		 * 생성된 여러 변수들은 index로 관리한다(index는 무조건 0부터 시작한다)
		 */
		
		// 선언 방법
		int[] a1;  // java 스타일
		int a2[]; // c 스타일
		
		// 배열 변수는 참조 변수라서 null을 넣을 수 있다
		a1 = null;
		
		int score_0 = 90;
		int score_1 = 80;
		int score_2 = 75;

		
		/*
		 * 첫번째 [] : int[]
		 * 		int로 이루어진 배열 변수 타입이다
		 * 두번째 [] : new int[3]
		 * 		배열의 크기. 즉 한번에 만들 변수의 개수
		 * 세번째 [] : score[0] = 90;
		 * 		만들어진 변수 중에서 몇번째인가?
		 * 		index는 0부터 시작한다
		 */
		
		int[] score = new int[30];
		score[0] = 90;
		score[1] = 80;
		score[2] = 75;
		System.out.println("score[1] :"+ score[1]);
		System.out.println("score[3] :"+ score[3]);
		
		String[] str = new String[3];
		System.out.println("str[0] : "+ str[0]);
		
		// 배열 생성 후 기본 값은 0, false, null로 초기화 됨
		
		// 에러 : ArrayIndexOutOfBoundsException: Index 100 out of bounds for length 3 
		// 길이가 3이라서 0~2까지만 사용 가능한데 100을 넣어서 예외 발생
		//		System.out.println("str[100] : "+ str[100]);
		
		// 배열을 선언하는 두번째 방법
		// 넣을 값을 모두 정확히 알고 있는 경우
		int[] i1 = new int[] {90, 80, 75};
		int[] i2 = null;
		i2 = new int[] {90, 80, 75};
		
		// 배열을 선언하는 세번째 방법
		// new int[]를 생략할 수 있다. 선언과 동시에 초기화 하는 경우에만
		int[] i3 = {90, 80, 75}; // new int[] 생략
		int[] i4 = null;
//		i4 = {90, 80, 75};

		int[] scores = {83, 90, 87};
		int sum = 0;
		for(int i=0; i<3; i++) {
			System.out.println(scores[i]);
			sum += scores[i];
		}
		System.out.println("총 합 : "+ sum);
		System.out.println("평 균 : "+ (sum/3));
		
		// 배열의 길이 .length
		System.out.println("scores.length : "+ scores.length);
		
		int b0 = 5;
		int b1 = 15;
		int b2 = 55;
		
		int[] bs0 = new int[3];
		bs0[0] = b0;
		bs0[1] = b1;
		bs0[2] = b2;
	
		int[] bs1 = new int[3];
		bs1[0] = b0+1;
		bs1[1] = b1+1;
		bs1[2] = b2+1;
		
		int[][] bs = new int[2][3]; // 3개짜리 배열을 2개 만들겠다
		bs[0] = bs0;
		bs[1] = bs1;
		
		System.out.println("bs.length : "+ bs.length);
		System.out.println("bs[0].length : "+ bs[0].length); // bs[0]은 int[] bs0이므로 3
		
		
		// 가변 배열
		// 서로 다른 크기를 가지는 요소로 구성된 배열
		// int[][] aa = new int[2][4]; 형태로는 사용할 수 없다.
		int[][] aa = { {1,2,3}, {4,5,6,7}, {8,9} };
		
		int[] d1 = new int[] {1,2,3,4,5};
		int[] d2 = d1; // 얕은 복사: stack 영역의 값(주소)만 복사. 복사본 수정 시 원본도 바뀜
		int[] d3 = new int[] {1,2,3,4,5}; // 깊은 복사: 다른 heap영역에 똑같은 내용을 채움. 원본과 복사본이 전혀 다른 객체
		
		System.out.println("d1 == d2: "+ (d1 == d2)); // 주소가 같으므로 true
		System.out.println("d1 == d3: "+ (d1 == d3)); // 값은 같지만 주소가 다르므로 false
		
		d2[1] = 10; // d1과 d2는 똑같은 주소를 바라보므로 같이 변경된다
		System.out.println("d1[1] : "+ d1[1]);
		
		// 반복문 사용해서 1-10까지 저장
		// 다른 반복문에서 출력
		int[] s = new int[10];
		s[0] = 1;
		s[1] = 2;
		s[2] = 3;
		s[3] = 4;
		for(int i=0; i<10; i++) {
			s[i] = i+1;
		}
		for(int i=0; i<10; i++) {
			System.out.println("int["+i+"] = "+ s[i]);
		}

		int[] f = { 4,5,7,2,6 };
		int[] f2 = new int [f.length];
		
		for(int i=0; i<f.length; i++) {
			System.out.println(f[i]);
		}
		
		for(int i=0; i<f2.length; i++) { // i를 2로 바꾸면 3번째 숫자부터 나온다
			f2[i] = f[i]; // 깊은 복사
			System.out.println(f2[i]);
		}
		
		for(int i=0; i<f.length; i++) {
			int data = f[i];
			System.out.println("data : "+ data);
		}
		
		// 향상된 for문
		System.out.println("-------for문-------------------");
		for(int i=0; i<f.length; i++) {
			int data = f[i];
			System.out.println("data : "+ data);
		}
		
		System.out.println("-------------향상된 for문 -------------------");
		for(int data : f ) {
			System.out.println("data : "+ data);
		}
		// 향상된 for문은 처음부터 끝까지 무조건 반복한다.
		// 중간에 건너뛰기 불가능
		// 현재 몇번째 반복중인지 알 수 없다.
		
		// 문제 0 
		// 배열 깊은 복사 : {1,2,3} -> {1,2,3}
		System.out.println("---------문제 0----------");
		int[] x1 = {1,2,3};
		int[] x2 = new int[x1.length];
		for(int i=0; i < x1.length; i++) {
			x2[i] = x1[i];
					System.out.print(x2[i]);
		}
		System.out.println();
		// 문제 1
		// 배열 뒤집기 : {1,2,3} -> {3,2,1}
//		x3[0] = 3 = x1[2]
//		x3[1] = 2 = x1[1]
//		x3[2] = 1 = x1[0]
				
		System.out.println("---------문제 1----------");
		int[] x3 = new int[x1.length];
		for(int i=2; i < x1.length && i >= 0; i--) {
			x3[i] = x1[i];
			System.out.print(x3[i]);
		}
		System.out.println();
		
		
		int[] a = {3,4,7,5,1,9,4};
		
		// 변수 a = {3,4,7,5,1,9,4}		
		// 문제 2
		// 변수 a 배열에서  홀수의 개수 찾기
		System.out.println("---------문제 2----------");
		int cnt1 = 0;
		for(int i=0; i < a.length; i++) {
			if(a[i] % 2 != 0) {
				cnt1++;	
				}
			}
			System.out.println("홀수는 "+ cnt1+ "개 입니다");
		
		// 문제 3
		// 변수 a = {3,4,7,5,1,9,4}	
		// 변수 a 배열에서 4보다 큰 수의 개수 구하기
		System.out.println("---------문제 3----------");
		int cnt2 = 0;	
		for(int i=0; i < a.length; i++) {
			if(a[i] > 4) {
				cnt2++;	
				}
			}
			System.out.println("4보다 큰 수는 "+ cnt2+ "개 입니다");	
			
		
		// 문제 4
		// 변수 a = {3,4,7,5,1,9,4}
		// 변수 a 배열에서 최대값 출력
		
		System.out.println("---------문제 4----------");
		int max1 = 0;	
		for(int i=0; i < a.length; i++) {
			if(a[i] > max1) {
				max1 = a[i];
			}
		}	
		System.out.println(max1);
		
		// 문제 5
		// 변수 a = {3,4,7,5,1,9,4}	
		// 변수 a 배열에서 두번째 큰 수 구하기
		
		System.out.println("---------문제 5----------");
		int max2 = 0;	
		for(int i=0; i < a.length; i++) {
			if(max2 < a[i] && a[i] != max1) {
				max2 = a[i];
			}
		}	
		System.out.println(max2);
		
		// 문제 6
		// 변수 a = {3,4,7,5,1,9,4}	
		// 변수 a 배열에서 오른쪽으로 한칸 밀기(왼쪽은 0으로 채우기)
		// 예시 : {0,3,4,7,5,1,9,4}
		System.out.println("---------문제 6----------");
		int[] b = new int[8];
		for(int i = 0; i < b.length; i++) {
			if(i == 0) {
				b[0] = 0;
			} else {
				b[i] = a[i-1];
			}
			System.out.print(b[i]);
		}
		System.out.println();
		
		// 문제 7
		// 변수 a = {3,4,7,5,1,9,4}	
		// 변수 a 배열에서 오른쪽으로 이동하는데 맨 끝 값을 맨 처음으로 보내기
		// {3,4,7,5,1,9,4} -> {4,3,4,7,5,1,9}
		System.out.println("---------문제 7----------");
//		a1[0] = 3 = a2[1]
//		a1[1] = 4 = a2[2]
//		a1[2] = 7 = a2[3]
//		a1[3] = 5 = a2[4]
//		a1[4] = 1 = a2[5]
//		a1[5] = 9 = a2[6]
//		a1[6] = 4 = a2[0]
		int[] c = new int [7];
		for(int i = 0; i < a.length; i++) {
			if(i == 0) {
				c[0] = a[6];
			} else {
				c[i] = a[i-1];
			}
			System.out.print(c[i]);
		}
		System.out.println();
		
		// 문제 8
		// 임시비밀번호 생성 ( 랜덤 사용 ) 몇자리? 8자리?
		// 8-1 : 숫자만 생성
		// 8-2 : 소문자만 생성
		// 8-3 : 숫자 2개 이상, 대/소문자 각 1개 이상
		System.out.println("---------문제 8-1---------");
		
		int[] password0 = new int[8];
		// 8-1
		for(int i = 0; i < 8; i++) {
			password0[i] = (int)(Math.random() * 10); 
			System.out.print(password0[i]+" ");
		}	
		System.out.println();
		
		// 8-2
		// a = 97,  z = 122 / 총 26개 Math.random() * 26 = 0 - 25까지 출력
		System.out.println("---------문제 8-2---------");
		char[] password1 = new char[8];
		for(int i = 0; i < 8; i++) {
			password1[i] = (char)((Math.random() * 26) +'a'); 
			System.out.print(password1[i]+" ");
		}	
		System.out.println();
		
		// 8-3
		
		
		// 문제 9
		// 자리가 10개 있는 소극장의 예약 시스템
		// 자리 번호는 1~10번까지 번호의 자리가 있습니다.
		// 메뉴 : "1. 예약 2. 모든 좌석 현황 3. 잔여좌석 0.종료"
		// 만약1 : 예약이 가능하다면 " n번 자리 예약 했습니다."
		// 만약2 : 예약이 불가능하다면 " 이미 예약 되어 있습니다."
//		System.out.println("---------문제 9----------");
//		Scanner scan = new Scanner(System.in);
//		
//		boolean run = true;
//		int[] seat = new int[10];
//		
//		while(run) {
//			
//			System.out.println("1:예약, 2:모든 좌석 현황, 3: 잔여좌석, 0:종료");
//			
//			int r = scan.nextInt();
//			
//			
//			
//			switch (r) {
//			 case 1:
//				 System.out.println("좌석선택: ");
//				 for(int i = 0; i < seat.length; i++) {
//					 System.out.print(seat[i]+ " ");
//				 }
//				 System.out.println();
//				 System.out.println("1~10번 중 원하는 좌석을 선택하세요.");
//				
//				 int p = scan.nextInt();
//
//				 if(p < 1 || p > 10) {
//						System.out.println("잘못된 입력입니다");
//				} else if (seat[p-1] == 1) {
//					System.out.println("이미 예약 되어 있습니다.");
//				} else if (p != 0) {
//					seat[p-1] = 1; 
//					System.out.println(p+ "번 좌석 예약되었습니다.");
//				}
//				 break;
//				 
//			 case 2:
//				 System.out.println("모든 좌석 현황");
//				 for(int i = 0; i < seat.length; i++) {
//					 System.out.print(seat[i]+ " ");
//				 }
//				 System.out.println();
//				 break;
//			 case 3:
//				 int cnt = 0;
//				 for(int i = 0; i < seat.length; i++) {
//					 if(seat[i] == 0) {
//						 cnt++;
//					 }
//				 }
//				 System.out.println("잔여 좌석: "+ cnt);
//				 break;
//			 case 0:
//				 run = false;
//				 break;
//				 
//			default:
//				System.out.println("잘못된 입력입니다.");
//				break;
//			
//			}
//		}
		
		//문제 10
		// 로또 6개 생성. 단, 중복 없이
				
		System.out.println("---------문제 10----------");
		// 6개의 숫자를 뽑을 것이다.
		// 먼저 한개를 뽑고 저장
		// 그 다음 숫자를 뽑는다.
		// 만약 저장된 숫자와 중복된 숫자라면 다시 뽑는다.
		
		int[] lotto = new int[6];
		
		// 6개 뽑기
		for(int i = 0; i < 6; i++) {
			int lot = (int)(Math.random()*45)+ 1;
	
			boolean same = false;	
			// 중복아니다.
			
			// 중복되었는가
			for(int j = 0; j < i; j++) {
				if(lotto[j] == lot) {
					same = true;
					break; // 중복되었다면 종료
				}
			}
			
			if(same == true) {
				i--;
			} else {
				lotto[i] = lot; // 중복아니면 배열에 저장
				System.out.print(lot+ " ");
			}
			
		}
		System.out.println();
		
		
		
		
		
		
		
		
	}

}
