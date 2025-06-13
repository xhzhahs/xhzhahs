package quiz;

public class FruitMarket {
	
	// 필드
	// 필드는 변수이고, 변수에는 값을 저장할 수 있다.
	String name; 	// 업체명
	String address; // 업체주소
	
//	Fruit apple1 = new Fruit();
//	Fruit tomato1 = new Fruit();
	
//	int[] arr = new int[10]; // 참고
	Fruit[] fruits = new Fruit[2];
	
	// 생성자
	// new 하자마자 실행되는 메소드의 일종
	FruitMarket(String name, String address) {
		
		this.name = name; // this.는 필드의 name 활용
		this.address = address; // this.는 필드의 address 활용
		
//		apple1.name = "사과";
//		apple1.price = 1000;
//		apple1.stock = 5;
//		
//		tomato1.name = "토마토";
//		tomato1.price = 2000;
//		tomato1.stock = 10;
		init();
		System.out.println(fruits[0]);
	}
	
	void init() { // 생성자가 지저분해져서 따로 뺐다. init는 초기화라는 뜻
//		apple1.name = "사과";
//		apple1.price = 1000;
//		apple1.stock = 5;
//		
//		tomato1.name = "토마토";
//		tomato1.price = 2000;
//		tomato1.stock = 10;
		
		fruits[0] = new Fruit();
		fruits[0].name = "사과";
		fruits[0].price = 1000;
		fruits[0].stock = 5;

		fruits[1] = new Fruit();
		fruits[1].name = "토마토";
		fruits[1].price = 2000;
		fruits[1].stock = 10;

	}
	
	// 주소만 받고 싶을 때 오버로딩 가능
	FruitMarket(String address) {
//		this.name = "오픈예정";
//		this.address = address;
		this("오픈예정", address); 
		// 위 생성자(FruitMarket(String name, String address))로 가서 거기서 실행됨
	}
	
	
	// 메소드
	// 동작, 작동
	
	String _tomato = "토마토";
	int _tomatoPrice = 2000;
	
	String _apple = "사과";
	int _applePrice = 1000;
	
	Fruit apple = new Fruit();

	
	// 과일 목록 전체 출력
	// 메소드명 : print
	// 전달인자 : 없음
	// 리턴타입 : void
	
	void print() {
		System.out.println("사과"+", 1000원");
		System.out.println(apple +", "+ _applePrice +"원");
		System.out.println("수박");
		System.out.println("자두");
		
		System.out.println(this._tomato+", "+ _tomatoPrice+"원");
	}
	
	// 과일 가격 문의
		// 메소드명 : ask
		// 전달인자 : 과일명
		// 리턴타입 : 가격
		int ask(String fruitName) {
			if(this.apple.equals(fruitName)) {
				return _applePrice;

			} else if(this._tomato.equals(fruitName)) {
//				return 2000;
				return _tomatoPrice;
			} else if(this._tomato.equals(fruitName)) {
//				return 2000;
				return _tomatoPrice;
				
			} else {
				System.out.println("그런 과일 없습니다");
				return -1;
			}
		}
		
		int ask2(String fruitName) {
			// 전체 과일 중에서
			for(int i=0; i<fruits.length; i++) {
//				System.out.println("널이라고?");
//				System.out.println("i:"+ i);
//				System.out.println("this.fruits[i]:"+ this.fruits[i]);
				
				// 전달받은 이름과 같은게 있다면
				if(this.fruits[i].name.equals(fruitName)) {
					
					// 가격을 돌려줘라
					return this.fruits[i].price;
				}
			}
			
			System.out.println("그런 과일 없습니다");
			return -1;
		}
		
		// 과일 추가 기능
		// 기존 배열에 새로운 과일클래스를 추가
		// 메소드 이름 : addFruit
		// 전달인자    : Fruit
		// 리턴타입    : void
		void addFruit(Fruit fruit) {
//			System.out.println("addFruit >> fruit:" + fruit);
			// 기존 것의 마지막에 하나 추가
			
			// 기존 것 보다 하나 큰 배열 만들기
			Fruit[] newFruits = new Fruit[this.fruits.length + 1];
			
			// 기존 것 복사
			for(int i=0; i<this.fruits.length; i++) {
				newFruits[i] = this.fruits[i];
			}
			
			// 마지막 추가
//			System.out.println("newFruits.length : "+ newFruits.length);
			newFruits[newFruits.length - 1] = fruit;
//			for(int i=0; i<newFruits.length; i++) {
//				System.out.println(newFruits[i]);
//			}
			
			// 새 배열을 기존 배열에 덮어쓰기
			this.fruits = newFruits;
		}
	
	
	
	
	
	
	
	
	
}
