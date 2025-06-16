package Coupang;

public class Cart {

	
	
	Cart[] carts;
	Shop[][] shops;
	
		
	// 장바구니에 상품 넣기
	// 메소드명 : put
	// 전달인자 : 상품명
	// 리턴타입 : String
	
	String put(String n) {
		for(int i = 0; i<shops.length; i++) {
			for(int j=0; j<shops.length+1; j++) {
				if(shops[i][j].name.equals(n)) {
					carts[i] = shops[i][j];
					return "장바구니에 담았습니다.";
				}
			}	
		}
		
		return "다시 확인해주세요";
	}
	
	// 장바구니 목록 보기
	
	// 메소드명 : show
	// 전달인자 : 없음
	// 리턴타입 : void
	
	void show() {
		for(int i = 0; i<carts.length; i++) {
			System.out.println(carts[i]);
		}
	}
	
	
	
	
}
