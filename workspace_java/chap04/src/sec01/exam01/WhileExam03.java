package sec01.exam01;

import java.util.Scanner;

public class WhileExam03 {

	public static void main(String[] args) {

		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("메뉴를 고르세요");
//		System.out.println("1:커피, 2:차, 0:종료");
//		int menu = scan.nextInt();
//		
//		if(menu == 1) {
//			System.out.println("커피 드릴께요");
//		} else if(menu == 2) {
//			System.out.println("차 드릴께요");
//		} else if(menu == 0) {
//			System.out.println("주문을 종료합니다. 다음에 뵈요");
//		} else {
//			System.out.println("주문을 확인하세요");
//		}
		
//		int menu = -1;
////		for( ; menu != 0; ) { for와 while은 서로 바꿔 사용가능하다
////		for는 반복횟수를 아는 경우
////		while은 반복횟수를 모르는 경우 사용한다
//		while(menu != 0) {
//			
//			System.out.println("메뉴를 고르세요");
//			System.out.println("1:커피, 2:차, 0:종료");
//			
//			menu = scan.nextInt();
//			
//			if(menu == 1) {
//				System.out.println("커피 드릴께요");
//			} else if(menu == 2) {
//				System.out.println("차 드릴께요");
//			} else if(menu == 0) {
//				System.out.println("주문을 종료합니다. 다음에 뵈요");
//			} else {
//				System.out.println("주문을 확인하세요");
//			}
//		}
//		
//		// do - while문
//		do {
//			
//			System.out.println("메뉴를 고르세요");
//			System.out.println("1:커피, 2:차, 0:종료");
//			
//			menu = scan.nextInt();
//			
//			if(menu == 1) {
//				System.out.println("커피 드릴께요");
//			} else if(menu == 2) {
//				System.out.println("차 드릴께요");
//			} else if(menu == 0) {
//				System.out.println("주문을 종료합니다. 다음에 뵈요");
//			} else {
//				System.out.println("주문을 확인하세요");
//			}
//		} while(menu != 0);
		

//		문제 1,
//		특정 수(0)가 오기 전까지 반복
//		수를 입력하세요
//		-3
//		"음수"
//		나머지는 "양수"
		
		int a = 1;
		while(a != 0) {
			System.out.println("수를 입력하세요");
			
			if(a < 0) {
				System.out.println("음수");
			} else {
				System.out.println("양수");
			}
			break;
		}
		
//		문제 2,
//		월을 입력하면 계절이 나오고
//		0을 입력하면 종료
		int month = 1;
		if (month >= 3 && month <=5) {
			System.out.println("봄");
		} else if (month >= 6 && month <=8) {
			System.out.println("여름");
		} else if (month >= 9 && month <=11) {
			System.out.println("가을");
		} else if( month == 12 || month == 1 || month == 2 ) {
			System.out.println("겨울");
		} else {
			System.out.println("종료");
		}
		
//		문제 3,
//		가위바위보게임 0이 입력될 때 까지 반복

		// 방법 1 if 가위가 가위를 만나면 비긴다 else if 바위를 만나면 진다 else 이긴다 
		
		// 방법 2 if 가위가 보를 만나거나 바위가 가위를 만나거나 보가 바위를 만나면 이긴다
		
//		문제 4,
//		은행에서
//		1. 예금, 2. 출금, 3. 잔고확인, 4. 종료,
//		조건
//		예금할 때 음수 불가
//		출금할 때 음수 불가, 잔고보다 큰 금액 불가
		boolean run = true;
		int money = 0;
		while(run) {
			
			System.out.println("1:예금, 2:출금, 3: 잔고확인, 4:종료");
			money = scan.nextInt();
			
			if(money == 1 || money == 2) {
				System.out.println("금액을 입력하세요");
				money = scan.nextInt();
			} else if(money == 3) {
				System.out.printf("잔고는 %d원 입니다", money);
				money = scan.nextInt();
			} else if(money == 4) {
				break;
			} else {
				System.out.println("입력을 확인하세요");
				money = scan.nextInt();
			}
		}
		System.out.println("종료합니다");
		
		
		
		
		
		
	}

}
