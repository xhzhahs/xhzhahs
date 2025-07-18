package quiz.cafe;

public class Alba {
	
	void work(Cafe cafe) {
		cafe.hello();
		cafe.menuList();
		System.out.println("주문을 도와드릴까요?");
	}
	
	void order(String menu, int c) {
		
		System.out.println(menu + c + "개 주문받았습니다.");
	}
	
	String pay(String menu, int c, int p) {
		System.out.println(menu + c + "개 주문받았습니다.");
		return menu + c + "개는 총 "+ (c*p)+"원 입니다.";
	}
	
	void serving() {
		System.out.println("주문하신 음료 나왔습니다. 안녕히가세요.");
	}
	
	void clean(Cafe cafe) {
		System.out.println("마감을 시작합니다.");
		cafe.stockList();
	}
}
