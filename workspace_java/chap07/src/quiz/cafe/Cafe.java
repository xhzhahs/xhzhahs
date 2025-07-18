package quiz.cafe;

import java.util.ArrayList;

public class Cafe {

	// 필드
	/*
	 	가격+메뉴 : 가격+ (커피, 디저트, MD상품, 디카페인, 티tea)
	 	가게이름
	 	비품: 빨대, 컵홀더
	 */
	
	// 생성자
	/*
		직원 몇명 고용(추후 수정 가능),
		메뉴+가격 설정(추후 수정 가능),
		가게이름
	 */
	
	// 메소드
	/*
	 	주문받기(메뉴, 갯수), 결제하기, 커피만들기, 설거지, 일마감, 서빙하기
	 */
	
	
	String brand;	// 가게 브랜드
	String stock;	// 비품
	ArrayList<String>menuName = new ArrayList();	// 메뉴
	ArrayList<Integer>menuPrice = new ArrayList();		// 가격
	
	Cafe(String brand) {
		this.brand = brand;
	}
	
	// 메뉴 추가하기
	void addMenu(String name, int price) {
		menuName.add(name);
		menuPrice.add(price);
	}

	
	void hello() {
		System.out.println("안녕하세요.");
	}
	
	void menuList() {
		System.out.println(brand+" 메뉴판입니다.");
		for(int i=0; i < menuName.size(); i++ ) {
			System.out.println(menuName.get(i)+" : "+menuPrice.get(i));
		}
	}

	void stockList() {
		System.out.println("재고 확인하겠습니다.");
		
	}
	
	
}
