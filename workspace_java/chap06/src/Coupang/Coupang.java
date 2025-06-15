package Coupang;

public class Coupang {

	/*
	 	상품 		: Product
		쇼핑몰 	: Shop 
		사용자	: User
		
		장바구니 구현하기 : Cart
		상품 담기/담은 상품 목록 보기
		
	 */
	
	String name;
	
	Shop[][] shops = new Shop[2][3];
	
	Coupang(String name) {
		this.name = name;
		init();
	}
	
	
	void init() {
		shops[0] = new Shop();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
