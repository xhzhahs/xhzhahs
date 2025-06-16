package Coupang;

public class Coupang {
	
	
	String name; // 온라인 플랫폼 이름
	
	Coupang(){
		init();
	}
	
	// 쇼핑 클래스 배열
	Shop[][] shops = new Shop[2][3];
	
	void init() {
		
		shops[0][3] = new Shop("가전");
		shops[0][3].name = "바람나라";
		shops[0][3].address = "서울";

		shops[1][3] = new Shop("가전");
		shops[1][3].name = "에어컨나라";
		shops[1][3].address = "대구";
		
	}
	
	
	
	
	
	// 가게 목록 전체 출력
	// 메소드명 : print
	// 전달인자 : 없음
	// 리턴타입 : void
		
		void print() {
			
			for(int i=0; i<shops.length; i++) {
				for(int j=0; j<shops.length+1; j++) {
				System.out.println(shops[i][j].name+", "+shops[i][j].address);
				}
			}	
			
		}
	
	
	
	
	

}
