package quiz;

import java.util.Scanner;

public class GameExam {

	public static void main(String[] args) {


		/*
		 	UpDown 게임
			0-9까지 중에서
			찍어보자 : 4
			>> up - 시도1
			찍어보자 : 8
			>> down - 시도2
			찍어보자 : 6
			>> 정답 - 시도3

		 */

		/* 내가 푼 풀이
		Scanner scan = new Scanner(System.in);
		
		int answer = 8;
		
		boolean run = true;
		
		
		System.out.println("0부터 9까지 중에 숫자를 고르세요");
		
		while(run) {
			for(int re=1; re<10; re++) {
				int guess = scan.nextInt();
				
				System.out.println(re+"번째 시도");	
				
				if(guess < 0 || guess > 9) {
					System.out.println("잘못 입력하셨습니다.");
				} else {
					
					if(guess < answer) {
						System.out.println(">> up");
					} else if (guess > answer){
						System.out.println(">> down");
					} else {
						System.out.println("정답입니다.");
						run = false;
						break;
					}
				}
			}
		}
		*/
			
		Game game = new Game(true);
		game.start(10, 20);
		
		
		
		
		
		
		
	}

}
