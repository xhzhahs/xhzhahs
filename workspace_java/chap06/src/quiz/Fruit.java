package quiz;

public class Fruit {

	String store;
	String name;
	int price;
	int stock;
	int pay;

	Fruit(){
		store = "과일가게";
	}
	
	
	// 과일이름과 가격, 재고를 필드에 저장하는 메소드
	// 메소드명 : setInfo
	// 전달인자 : String 과일이름, int 가격, int 재고
	// 리턴타입 : void
	
	void setInfo(String n, int p, int s) {
		name = n;
		price = p;
		stock = s;
		pay = s * p;
	}
	
	// 과일이름과 가격이 저장된 필드의 값을 돌려주는 메소드
	// 메소드명 : getInfo
	// 전달인자 : 없음
	// 리턴타입 : String
	
	String getInfo() {
		return name + " 개당 가격은 "+ price + "원이고 "+ stock+" 개 있습니다.";
	}
	
	
	////////////////////////////////////////////////////////////////
	
	String fn[] = {"사과", "바나나", "수박", "복숭아", "키위"};
	int fp[] = {10000, 5000, 55000, 3000, 7000};
	int fs[] = {100, 15, 3, 11, 30};
	// 가격문의 메소드
	// 메소드명 : ask
	// 전달인자 : String 이름
	// 리턴타입 : String 이름, int 가격, int 재고
	String ask(String name, int a) {
		for(int i = 0; i < fn.length; i++) {
			if(fn[i].equals(name)) { 
				return fn[i] + a+ " 개 가격은 "+ fp[i]*a + "원입니다.";
			} 
		}	
		return null;
	}	
		
	
	// 전체목록 메소드
	// 메소드명 : list
	// 전달인자 : String 이름
	// 리턴타입 : String 이름, int 갯수
	String list(String name) {
		for(int i = 0; i < fn.length; i++) {
			if(fn[i].equals(name)) { 
				return fn[i] + " 개당 가격은 "+ fp[i] + "원이고 "+ fs[i]+" 개 있습니다.";
			} 
		}	
		return null;
	}	
		
	
	// 클래스 배열	
	// 한가지 과일의 이름, 가격, 재고가 한뭉탱이. 하나의 틀 같은 존재	
	Fruit[] fruitsArray() { 
		Fruit[] fruits = new Fruit[5]; 	
		fruits[0].name = "사과"; 
		fruits[0].price = 10000; 
		fruits[1].name = "바나나";
		fruits[1].price = 5000;
		fruits[2].name = "수박";
		fruits[2].price = 55000;
		fruits[3].name = "복숭아";
		fruits[3].price = 3000;
		fruits[4].name = "키위";
		fruits[4].price = 7000;
		return fruits;
	}
		
	// 거스름돈 메소드
	// 메소드명 : pay
	// 전달인자 : String 이름, int 갯수, int 받은금액
	// 리턴타입 : String
	
	String pay(String n, int a, int d) {
		for(int i=0; i < fn.length; i++) {
			if(fn[i].equals(name)){
				System.out.println("총" + fp[i]*a+ "원입니다.");
				if(d < a*fp[i]) {
					System.out.println("잔액이 부족합니다.");
				} else
				if(d > a*fp[i]) {
					System.out.println(d+"원 받았고 거스름돈은 "+ (d-fp[i]*a)+ "원 입니다.");
			
				}
			}	
		}
		return "감사합니다.";
	}
	
	
	// 택배 성공여부 메소드
		// 메소드명 : delivery
		// 전달인자 : String 주소(이름, 주소, 전화번호), String 이름, int 갯수
		// 리턴타입 : String
	
	String delivery(String an, String n, int a) {
		// 주문 과일 재고 파악
		for(int i=0; i < fn.length; i++) {
			if(fn[i].equals(name)){
				if(fs[i] < 0) {
					System.out.println("품절입니다.");
				} else if(fs[i] < a) {
					System.out.println("재고가 부족합니다.");
				} else {
					System.out.println(fn[i]+ " 재고가" + fs[i]+ "개 있습니다.");
				}
			}
		}
		return "배송완료";
				
	}
		
}

