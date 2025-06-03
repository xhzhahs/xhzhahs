package sec01.exam01;

public class BreakExam04 {

	public static void main(String[] args) {

		System.out.println("게임을 시작하지");
		int cnt = 0;
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println("주사위 : "+ num);
			
			if(num == 6) {
				break;
			}
			
			cnt++;
			
		}
		System.out.println("게임 종료 : 총 : "+ cnt);
		
		for(int i=1; i<10; i++) {
			System.out.println(i);
			if(i >= 5) { // 혹시 몰라서 ==이 아니라 >=으로 사용(서버가 불안정한 상황 대비)
				break;
			}
		} 
		
		for(int i=0; i<5; i++) {
			System.out.println("i: "+ i);
			
			for(int j=0; j<20; j++) {
				System.out.println("j: "+ j);
				if(j >=2) {
					System.out.println("break");
					break;
				}
			}
		}
		
		// 총 5명이 순차적으로 게임 시작
		for(int i=1; i<=5; i++) {
	    // 한명 당 주사위 3번씩 던지기
			for(int j=1; j<=3; j++) {
				int num2 = (int)(Math.random()*6)+ 1;
				System.out.println("주사위 0: "+ num2);
				
				// 만약 6이 나오면 전체 게임 종료
				if(num2 == 6) {
					break;
				}
			}
		}
		
		// 한명이라도 6이 나오면 전체 게임 종료
		boolean isStop = false; // 그런 사건이 있었는지?
		// 총 5명이 순차적으로 게임 시작
		for(int i=1; i<=5; i++) {
	    // 한명 당 주사위 3번씩 던지기
			for(int j=1; j<=3; j++) {
				int num2 = (int)(Math.random()*6)+ 1;
				System.out.println("주사위 1"+ ": "+ num2);
				
				// 만약 6이 나오면 전체 게임 종료
				if(num2 == 6) {
					isStop = true;
					break;
				}
			}
				
				if(isStop) {
					break;
				}
		}
		
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) { // 짝수 일 때만 출력한다
				System.out.println(i);
			}
		}
		
		for(int i=1; i<=10; i++) {
			if(i % 2 != 0) { // 홀수 일 때는 건너뛴다
				continue;	
			}
			System.out.println(i);
		}
		

		
		
		
		
		
		
		
		
		
		
	}

}
