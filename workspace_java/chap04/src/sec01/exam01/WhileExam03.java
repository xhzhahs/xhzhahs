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
		int game = -1;
		while(game != 0) {
			
			System.out.println("1:가위, 2:바위, 3:보, 0:종료");
			
			int zone = (int)(Math.random() * 3) + 1;
			game = scan.nextInt();
			
			if(game == zone) {
				System.out.println("비겼습니다.");
			} else if((game == 1 && zone == 3)||(game == 2 && zone == 1)||(game == 3 && zone == 2)) {
				System.out.println("이겼습니다.");
			} else if((game == 3 && zone == 1)||(game == 1 && zone == 2)||(game == 2 && zone == 3)) {
				System.out.println("졌습니다.");
			} else if(game == 0) {
				System.out.println("종료합니다");
			} else {
				System.out.println("잘못입력하셨습니다. 다시 입력하세요");
			}
		}
		
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
			
			int menu = scan.nextInt();
			
			switch (menu) {
            case 1:
                System.out.print("금액: ");
                int p = scan.nextInt();
                if(p <= 0) {
                	System.out.println("잘못입력하셨습니다.");
                } else {
                	money = money + p;
                }
                break;

            case 2:
                System.out.print("금액:");
                int m = scan.nextInt();
                if(m <= 0) {
                	System.out.println("잘못입력하셨습니다.");
                } else if(m>money) {
                	System.out.println("잔액이 부족합니다.");
                } else {
                	money = money - m;
                }
                break;

            case 3:
                System.out.println("잔고:" + money);
                break;

            case 4:
                run = false;
                break;

            default:
                System.out.println("잘못된 선택입니다.");
                break;
        }
    }
		System.out.println("프로그램 종료");

		
		
		
		
		
		
	}

}
