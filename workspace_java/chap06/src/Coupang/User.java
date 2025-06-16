package Coupang;

public class User {

	/*
	 	상품 	: Product
		쇼핑몰 	: Shop 
		사용자	: User
		
		장바구니 구현하기 : Cart
		상품 담기/담은 상품 목록 보기
		
	 */
	
	String name; 		// 주문자 이름
	String address;		// 주소
	int phoneNumber;	// 핸드폰 번호
	
	// 이름, 주소, 전화번호를 받아서 저장
	// 메소드명: setInfo
	// 전달인자: String n, String a, int p
	// 리턴타입: void
	
	void setInfo(String n, String a, int pn) {
		name = n;
		address = a;
		phoneNumber = pn;
	}
	
	
	// 이름, 주소, 전화번호를 받아서 저장
	// 메소드명: getInfo
	// 전달인자: 없음
	// 리턴타입: String
	
	String getInfo() {
		return "이름: "+ name+ "/n주소: "+address +"/n전화번호: "+ phoneNumber;
	}
	
	
	
	
}
