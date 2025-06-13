package quiz;

import java.util.Scanner;

public class Game {
	
	Game(){}
	
	boolean isDebug = false; // 디버깅모드
	Game(boolean isDebug){
		this.isDebug = isDebug;
	}
	
	// 랜덤 숫자를 생성해서 돌려주기
		int getNumber(int start, int end){
			int result = Integer.MIN_VALUE;
			if(end >= start) {
				result = (int)(Math.random() * (end - start + 1)) + start;
			} else {
				System.out.println("마지막 숫자는 시작 숫자보다 크거나 같아야합니다.");
			}
			return result;
		}
		
		
		// 메소드명 : start
		// 전달인자 : int start, int end // 정답의 범위
		// 리턴타입 : void
		
		void start(int start, int end) {

			Scanner scan = new Scanner(System.in);
			
			int menu = -1;
			do {
				System.out.println("1. 게임시작 || 0. 종료");
				menu = scan.nextInt();
				
				if(menu != 1 && menu != 0) {
					System.out.println("메뉴를 다시 선택하세요");
					continue;
				}
				
				switch(menu) {
					case 1:
						
						// 이번 판의 정답은
						int answer = getNumber(start, end);
						if(this.isDebug) {
							System.out.println("몰래봐:"+ answer);
						}
						
						// 정답여부
						boolean ok = false;
						
						while(!ok) {
//							while(ok != 0) {
//							while(ok == false) {
								
								System.out.printf("%d ~ %d까지 찍어봐: ", start, end);
								int number = scan.nextInt();
								
								if(this.isDebug) {
									System.out.println(answer +", "+ number);
								}
								
								if(answer == number) {
									System.out.println("정답입니다.");
									ok = true;
								} else if (answer > number) {
									System.out.println("UP↑");
								} else {
									System.out.println("DOWN↓");
								}
							}
							break;
					 case 0:
						System.out.println("안녕");
				}
			}while(menu != 0);
	 	}
		
}
