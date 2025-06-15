package quiz;

import java.util.Scanner;

public class FtuitMarketExam {

	public static void main(String[] args) {
		
		
		// FruitMarket 클래스에 생성자가 (가게이름, 주소);로 되어있으므로 넣어서 생성
		FruitMarket market = new FruitMarket("휴먼과일", "천안");

		// 과일 목록 전체 출력 (메뉴판)
		market.print();

		// FruitMarket 클래스에 ask2 메소드 실행됨
		int price = market.ask2("토마토");
		System.out.println("토마토 가격은? " + price);

		// main에서 과일 추가하여 클래스에 저장하기
		Fruitt fruit = new Fruitt();
		fruit.name = "파인애플";
		fruit.price = 3000;
		fruit.stock = 15;

		market.addFruit(fruit);
		price = market.ask2("파인애플");
		System.out.println("파인애플 가격은? " + price);
		
		Fruitt fruits = new Fruitt();
		price = market.ask("망고");
		System.out.println("망고 가격은? " + price);
		
//		// 스캐너 사용법
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("과일 이름은? ");
//		String name = scanner.nextLine();
////		int price = scanner.nextInt();
//		price = market.ask2(name);
//		if(price != -1) {
//			System.out.println(name + " 가격은? " + price);
//		}
//		
//		Scanner close;
		
	}

}
