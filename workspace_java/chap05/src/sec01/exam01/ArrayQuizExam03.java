package sec01.exam01;

import java.util.Scanner;

public class ArrayQuizExam03 {

	public static void main(String[] args) {

		/* 내가 푼 풀이		
		System.out.println("---------문제 0----------");
		int[] x1 = {1,2,3};
		int[] x2 = new int[x1.length];
		for(int i=0; i < x1.length; i++) {
			x2[i] = x1[i];
					System.out.print(x2[i]);
		}
		System.out.println();
		*/
		
//		문제 0
//		배열 깊은 복사 : {1,2,3} -> {1,2,3}
		int[] arr0 = {1,2,3};
//		int[] arr01 = ;
//		int[] arr01 = {1,2,3};
		int[] arr01 = new int[arr0.length];
		for(int i=0; i<arr0.length; i++) {
			arr01[i] = arr0[i];
		}
		System.out.println("-------------문제 0 ----------------");
		for(int i=0; i<arr0.length; i++) {
			System.out.println(arr01[i]);
		}
		
		/* 내가 푼 풀이
		System.out.println("---------문제 1----------");
		int[] x3 = new int[x1.length];
		for(int i=2; i < x1.length && i >= 0; i--) {
			x3[i] = x1[i];
			System.out.print(x3[i]);
		}
		System.out.println();
		*/
		
//		문제1
//		배열 뒤집기 : {1,2,3} -> {3,2,1}
		arr01 = new int[arr0.length];
		arr01[0] = arr0[2]; // [arr0.length-1]
		arr01[1] = arr0[1]; // [arr0.length-2]
		arr01[2] = arr0[0]; // [arr0.length-3]
		for(int i=0; i < arr01.length; i++) {
			arr01[i] = arr0[arr01.length - (i + 1)];
		}
		System.out.println("-------------문제 1 ----------------");
		for(int i=0; i<arr0.length; i++) {
			System.out.println(arr01[i]);
		}
		
		/* 내가 푼 풀이
		System.out.println("---------문제 2----------");
		int cnt1 = 0;
		for(int i=0; i < a.length; i++) {
			if(a[i] % 2 != 0) {
				cnt1++;	
				}
			}
			System.out.println("홀수는 "+ cnt1+ "개 입니다");
		*/
		
//		여기서 = {3,4,7,5,1,9,4}
		int[] array = {3,4,7,5,1,9,4};
//		문제2
//		여기서 홀수의 개수 찾기

		int cnt = 0;
		for(int i=0; i < array.length; i++) {
			// 홀수만 세기
			if(array[i] % 2 == 1) {
				cnt++;
			}
		}
		System.out.println("-------------문제 2 ----------------");
		System.out.println(cnt);
		
		/* 내가 푼 풀이
		System.out.println("---------문제 3----------");
		int cnt2 = 0;	
		for(int i=0; i < a.length; i++) {
			if(a[i] > 4) {
				cnt2++;	
				}
			}
			System.out.println("4보다 큰 수는 "+ cnt2+ "개 입니다");	
		*/
		
//		문제3
//		여기서 4보다 큰 수의 개수 구하기
		cnt = 0;
		for(int i=0; i < array.length; i++) {
			// 4초과
			if(array[i] > 4) {
				cnt++;
			}
		}
		System.out.println("-------------문제 3 ----------------");
		System.out.println(cnt);
		
		/* 내가 푼 풀이
		System.out.println("---------문제 4----------");
		int max1 = 0;	
		for(int i=0; i < a.length; i++) {
			if(a[i] > max1) {
				max1 = a[i];
			}
		}	
		System.out.println(max1);
		*/
		
//		문제4
//		여기서 최대값을 출력하시오
		// 만약에 두개라면?
		int a = 3;
		int b =4;
		if(a > b) {
			System.out.println("둘 중에 큰 수는 "+ a);
		} else if (a < b) {
			System.out.println("둘 중에 큰 수는 "+ b);
		} else {
			System.out.println("둘 다 같음");
		}
//		else {
//			System.out.println("둘 중에 큰 수는 "+ b);// a는 b보다 크지 않다. = b가 같거나 크다
//		}
		// 1. 일단 처음 값을 최대값으로 저장
		// 2. 다음부터 최대값이었던 것과 비교해서 큰 값을 최대값으로 갱신
		// 3. 반복하다 보면 가장 큰 값이 최대값 변수에 남아있겠다.
		
		int max = array[0];
//		max = Integer.MIN_VALUE; // 가장 작은값을 지정함. 배열에 음수가 있을 수도 있으니
		for(int i=0; i < array.length; i++) {
			// 전 값과 비교
			if(array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("-------------문제 4 ----------------");
		System.out.println(max);
		
		
		/* 내가 푼 풀이
		System.out.println("---------문제 5----------");
		int max2 = 0;	
		for(int i=0; i < a.length; i++) {
			if(max2 < a[i] && a[i] != max1) {
				max2 = a[i];
			}
		}	
		System.out.println(max2);
		*/
		
//		문제5
//		여기서 두번째 큰 수 구하기
		// 두번째 큰 수는 첫번째를 제외하고 가장 큰 수
		
		int max2 = Integer.MIN_VALUE;	
		for(int i=0; i < array.length; i++) {
			if(max2 < array[i] && array[i] != max) {
				max2 = array[i];
			}
		}	
		System.out.println("-------------문제 5 ----------------");
		System.out.println(max2);
		
		/* 내가 푼 풀이
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
		*/
		
//		문제6
//		오른쪽으로 한칸 밀기(왼쪽은 0으로 채우기)
//		예시 : {3,4,7,5,1,9,4} -> {0,3,4,7,5,1,9,4}

		int[] array2 = new int[array.length + 1];
//		array2[0] = 0; // 이미 초기화 되어있기때문에 0이 들어있으므로 안해도 됨
		for(int i=1; i < array2.length; i++) { // 첫번째는 0이므로 2번째부터 시작이니 i=1로 시작
			array2[i] = array[i-1];
		}
		System.out.println("-------------문제 6 ----------------");
		for(int i=0; i < array2.length; i++) {
			System.out.print(array2[i]);
		}
		System.out.println();
		/* 내가 푼 풀이
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
		*/
		
//		문제7
//		오른쪽이 이동 하는데 맨 끝에 값을 맨 처음으로 보내기
//		{3,4,7,5,1,9,4} -> {4,3,4,7,5,1,9}
		// 같은 크기의 배열을 일단 만들어 놓고
		// 원본의 맨 마지막 값을 사본의 맨 처음에 넣기
		// 나머지는 사본의 두번째 부터 복사
		
		int[] array7 = new int[array.length];
		array7[0] = array[array.length - 1]; // array.length-1 은 가장 오른쪽에 있는 수
		for(int i=1; i < array7.length; i++) {
			array7[i] = array[i-1];
		}
		System.out.println("-------------문제 7 ----------------");
		for(int i=0; i < array7.length; i++) {
			System.out.print(array7[i]);
		}
		System.out.println();
		
		/* 내가 푼 풀이
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
		*/
		
//		문제8
//		임시비밀번호 8자리 생성
//		    + 8-1 : 숫자만
//		    + 8-2 : 소문자만
//		    + 8-3 : 숫자2개 이상, 대/소문자 각 1개 이상

		int[]arr8 = new int[8];
		for(int i=0; i < arr8.length; i++) {
			// 한자리 숫자 random 0~9
			arr8[i] = (int)(Math.random()*10);
		}
		System.out.println("-------------문제 8-1 ----------------");
		for(int i=0; i < arr8.length; i++) {
			System.out.print(arr8[i]);
		}
		System.out.println();
		
		// 97~122까지 random()으로 뽑기
		// 0~25
//		(int)(Math.random()*26) + 97;
//		// 번외편. random 공식을 완성해보가
//		int start = 97;
//		int end = 122;
//		(int)(Math.random()*(end - start + 1)) + start;
		char[] arr82 = new char[8];
		for(int i=0; i<arr82.length; i++) {
			int start = 97;
			int end = 122;
			arr82[i] = (char)((int)(Math.random()*(end - start + 1)) + start);
		}
		System.out.println("-------------문제 8-2 ----------------");
		for(int i=0; i < arr82.length; i++) {
			System.out.print(arr82[i]);
		}
		System.out.println();
		
		char[] arr83 = new char[8];
		// 숫자
		int start = 48;
		int end = 59;
		arr83[0] = (char)((int)(Math.random()*(end - start + 1)) + start);
		arr83[1] = (char)((int)(Math.random()*(end - start + 1)) + start);
		
		// 대문자
		start = 65;
		end = 90;
		arr83[2] = (char)((int)(Math.random()*(end - start + 1)) + start);

		// 소문자
		for(int i=3; i<arr83.length; i++) {
			start = 97;
			end = 122;
			arr83[i] = (char)((int)(Math.random()*(end - start + 1)) + start);
		}
		
		System.out.println("-------------문제 8-3 ----------------");
		for(int i=0; i < arr83.length; i++) {
			System.out.print(arr83[i]);
		}
		System.out.println();
		
		// 8번 반복하면서
		// 이번에 나올 숫자/ 대문자/ 소문자 random()으로 선택
		// 대충 마지막 쯤에서 숫자2개/대문자1개/소문자1개 나왔었는지 판단
		
		/* 내가 푼 풀이
		System.out.println("---------문제 9----------");
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		int[] seat = new int[10];
		
		while(run) {
			
			System.out.println("1:예약, 2:모든 좌석 현황, 3: 잔여좌석, 0:종료");
			
			int r = scan.nextInt();
			
			switch (r) {
			 case 1:
				 System.out.println("좌석선택: ");
				 for(int i = 0; i < seat.length; i++) {
					 System.out.print(seat[i]+ " ");
				 }
				 System.out.println();
				 System.out.println("1~10번 중 원하는 좌석을 선택하세요.");
				
				 int p = scan.nextInt();

				 if(p < 1 || p > 10) {
						System.out.println("잘못된 입력입니다");
				} else if (seat[p-1] == 1) {
					System.out.println("이미 예약 되어 있습니다.");
				} else if (p != 0) {
					seat[p-1] = 1; 
					System.out.println(p+ "번 좌석 예약되었습니다.");
				}
				 break;
				 
			 case 2:
				 System.out.println("모든 좌석 현황");
				 for(int i = 0; i < seat.length; i++) {
					 System.out.print(seat[i]+ " ");
				 }
				 System.out.println();
				 break;
			 case 3:
				 int cnt = 0;
				 for(int i = 0; i < seat.length; i++) {
					 if(seat[i] == 0) {
						 cnt++;
					 }
				 }
				 System.out.println("잔여 좌석: "+ cnt);
				 break;
			 case 0:
				 run = false;
				 break;
				 
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			
			}
		}
		*/
		
//		문제9
//		자리가 10개 있는 소극장의 예약 시스템
//		자리 번호는 1~10번까지 번호의 자리가 있습니다.
//		메뉴 : "1.예약 2.모든 좌석 현황 3.잔여좌석 0.종료"
//		만약1 : 예약이 가능하다면 "n번 자리 예약 했습니다"
//		만약2 : 예약이 불가능하다면 "이미 예약 되어 있습니다"
		
		int[] seat = new int[10];	// 0:예약가능, 1:예약완료
		// 예를 들어 3번째 자리에 예약을 했다
//		seat[2] = 1;
		
//		System.out.println("1.예약 2.모든 좌석 현황 3.잔여좌석 0.종료");
//		Scanner scan = new Scanner(System.in);
//		int booking = scan.nextInt();
		int menu = -1;
		// int를 아래 선언하면서 scan.nextInt()로 받을 수 있지만
		// 그러면 do문 안에 지역변수로 있기 때문에 while에서 인식할 수 없다.
		// 그러므로 밖으로 빼서 선언한 후, 영향 받지 않은 숫자를 넣어준 것
		do {
			// 받기
			System.out.println("1.예약 2.모든 좌석 현황 3.잔여 좌석 0.종료");
			Scanner scan = new Scanner(System.in);
			menu = scan.nextInt();
			
			switch(menu) {
				case 1:
					System.out.println("몇번 자리?(0-9)");
					int booking = scan.nextInt();
					if(booking<0 || booking>9) {
						System.out.println("자리를 확인해주세요");
					} else { 
						// else if로 써도 됨.
						// else 입력 후 다시 if를 쓴 이유: 단락을 나눈 느낌. 
						// 위 if는 잘못 입력했을 때, 아래 if는 제대로 입력했을때 
						if(seat[booking] == 1) {
							System.out.println("이미 예약된 자리");
						} else {
							seat[booking] = 1;
							System.out.println(booking +"자리 예약 했습니다");
						}
					}
					break;
				case 2:
					for(int i=0; i<seat.length; i++) {
						String a1 = "가능";
						if(seat[i] == 1) {
							a1 = "불가능";
						}
						System.out.print(i + "번 자리 : "+ a);
					}
					System.out.println();
					break;
				case 3:
					System.out.println("예약 가능 좌석 번호 : ");
					for(int i=0; i<seat.length; i++) {
						if(seat[i] == 0) {
							System.out.print(i + "번, ");
						}
					}
					System.out.println();
					break;
				case 0:
					System.out.println("종료 합니다");
					break;
			}
			
		}while(menu != 0);
		
		
		/* 내가 푼 풀이
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
			// 중복 여부.
			
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
		*/
		
//		문제10
//		로또 6개 생성. 단, 중복 없이 
		
	   int[] lotto = new int[6];
        boolean flag = false;
        for(int i=0; i<lotto.length; i++) {
            do {
                flag = false;
                lotto[i] = (int)(Math.random()*45) + 1;
                for(int j=0; j < i; j++) {
                    if(lotto[j] == lotto[i]) {
                        System.out.println("중복:"+ lotto[i]);
                        flag = true;
                    }
                }
            } while( flag );
        }
        for(int i=0; i<lotto.length; i++) {
            System.out.print(lotto[i]+ ", ");
        }
        System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
