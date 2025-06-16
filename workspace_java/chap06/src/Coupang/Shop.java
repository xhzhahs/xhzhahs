package Coupang;

public class Shop {

	/*
 	상품
	쇼핑몰
	사용자
	
	장바구니 구현하기
	상품 담기/담은 상품 목록 보기
	
    */
	
	String name; // 쇼핑몰 이름
	String address; // 쇼핑몰 주소
	String category; // 업종
	
	Shop(String category) {
		this.category = category;
		
		init();
	}
	
	
	// 상품 배열(Product 클래스)
	Product[] products = new Product[3];
	
	void init() {
		products[0] = new Product();
		products[0].name = "선풍기";
		products[0].price = 30000;
		products[0].stock = 10;
		
		products[1] = new Product();
		products[1].name = "에어컨";
		products[1].price = 800000;
		products[1].stock = 1;
	
		products[2] = new Product();
		products[2].name = "부채";
		products[2].price = 3000;
		products[2].stock = 500;
	
	}
	
	// 상품 목록 전체 출력
	// 메소드명 : print
	// 전달인자 : 없음
	// 리턴타입 : void
	
	void print() {
		
		for(int i=0; i<products.length; i++) {
			System.out.println(products[i].name+", "+products[i].price+", "+products[i].stock);
		}
		
	}
	
	
	
}
