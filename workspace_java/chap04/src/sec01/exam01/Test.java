package sec01.exam01;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		int menu = -1;
		do {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println();
			System.out.println("1:아메리카노(5000원), 2:라떼(5500원), 0:종료");
			
			menu = scan.nextInt();
			int price = 0;
			switch(menu) {
				case 1:
					System.out.println("1: ICE, 2: HOT, 3:이전화면");
					int sub1 = scan.nextInt();
					if(sub1 == 1) {
						price += 5000; 
						System.out.println("아이스 아메리카노 드릴게요. "+price+"원입니다");
					} else if(sub1 == 2) {
						price += 5000;
						System.out.println("따뜻한 아메리카노 드릴게요. "+price+"원입니다");
					} else if(sub1 == 3) {
						System.out.println("1:아메리카노, 2:라떼, 0:종료");
					} else {
						System.out.println("다시확인해주세요");
					}
					break;
				case 2:
					System.out.println("1: ICE, 2: HOT, 3:이전화면");
					int sub2 = scan.nextInt();
					if(sub2 == 1) {
						price += 5500;
						System.out.println("아이스 라떼 드릴게요. "+price+"원입니다");
					} else if(sub2 == 2) {
						price += 5500;
						System.out.println("따뜻한 라떼 드릴게요. "+price+"원입니다");
					} else if(sub2 == 3) {
						System.out.println("1:아메리카노, 2:라떼, 0:종료");
					} else {
						System.out.println("다시확인해주세요");
					}
					break;
				case 0:
					System.out.println("이용해 주셔서 감사합니다.");
					break;
			}
		}while(menu !=0);
		
		
		
		
		
	}

}
