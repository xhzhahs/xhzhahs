package Coupang;

public class CoupangExam {

	public static void main(String[] args) {

		
		/*
	 	상품 		: Product
		쇼핑몰 	: Shop 
		사용자	: User
		
		장바구니 구현하기 : Cart
		상품 담기/담은 상품 목록 보기
		
	    */
	
	Shop shop = new Shop("바람나라", "대구");
	shop.print();
	
	Cart cart = new Cart();
	cart.put("선풍기");
	cart.show();
		
		
		
		
		
		
	}

}
