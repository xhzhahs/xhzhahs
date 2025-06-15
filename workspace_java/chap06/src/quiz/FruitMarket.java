package quiz;

public class FruitMarket {
	
	// 필드
	// 필드는 변수이고, 변수에는 값을 저장할 수 있다.
	String name; 	// 업체명
	String address; // 업체주소
	
	
	
	/**  새로운 클래스를 만들어 호출하는 이유
		: 새로운 과일이 생길때마다 if를 사용해야하니
		  if 사용을 줄이고 반복문으로 바꾸기 위해서
		  
		단순히 새로운 클래스 호출만하면 
		if 사용을 줄이는데 도움이 되지 않으니
		배열로 만들어준다.
	**/
	
// 새로운 클래스(Fruitt)를 만들어 이력서 양식처럼 이름, 가격, 재고의 틀을 클래스에 넣어둠
//	Fruitt apple1 = new Fruitt(); 
//	Fruitt tomato1 = new Fruitt();
//	apple1.name = "사과"; 필드영역이므로 값을 넣는 행위를 할 수 없다. 생성자나 메소드 영역에서 가능

	// 클래스를 배열로 만들기
//	int[] arr = new int[10]; // 참고
	Fruitt[] fruits = new Fruitt[3];
	
	
	
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
		init(); // 생성자 내용이 너무 길어져서 메소드로 따로 뺀 후 호출함
		System.out.println(fruits[0]);
	}
	
	void init() { // 생성자가 지저분해져서 따로 뺐다. init는 초기화라는 뜻
		
// 아래 주석 과정은 Fruitt 클래스에 저장되어있는 틀을 가져와서 값을 넣는 것이다.
//		apple1.name = "사과";
//		apple1.price = 1000;
//		apple1.stock = 5;
//		
//		tomato1.name = "토마토";
//		tomato1.price = 2000;
//		tomato1.stock = 10;
		
		// 배열도 변수이기 때문에 그냥 변수와 똑같이 해준다.
		fruits[0] = new Fruitt(); // 변수 선언하자마자 초기화해주기
		fruits[0].name = "사과";
		fruits[0].price = 1000;
		fruits[0].stock = 5;

		fruits[1] = new Fruitt();
		fruits[1].name = "토마토";
		fruits[1].price = 2000;
		fruits[1].stock = 10;
		
		fruits[2] = new Fruitt();
		fruits[2].name = "망고";
		fruits[2].price = 10000;
		fruits[2].stock = 18;

	}
	/*
	 	// 생성자
	    // new 하자마자 실행되는 메소드의 일종
	    FruitMarket(String name, String address) {
		
		this.name = name; // this.는 필드의 name 활용
		this.address = address; // this.는 필드의 address 활용
	 
	 */
	
	// 주소만 받고 싶을 때 오버로딩 가능
	FruitMarket(String address) {

//		this.name = "오픈예정";
//		this.address = address;
		// 이렇게 사용하면 수정할때 위에서 부터 하나하나 다 수정해야하므로
		// FruitMarket을 호출하는 것이 편리하다.
		// 하지만 FruitMarket을 직접 쓸 수 없으므로 아래처럼 this를 사용
		// 위 생성자(FruitMarket(String name, String address))로 가서 거기서 실행됨
		
		this("오픈예정", address); // 다른 생성자를 호출할 때는 항상 첫번째줄에 써야함
	}
	
	
	// 메소드
	// 동작, 작동
	
	String _tomato = "토마토";
	int _tomatoPrice = 2000;
	
	String _apple = "사과";
	int _applePrice = 1000;
	
	String _mango = "망고";
	int _mangoPrice = 10000;
	
	// 과일 목록 전체 출력
	// 메소드명 : print
	// 전달인자 : 없음
	// 리턴타입 : void
	
	void print() {
//		System.out.println("사과"+", 1000원"); // 아래처럼 필드를 사용하면 관리가 편하다.
//		System.out.println("수박");
//		System.out.println("자두");
		
		System.out.println(this._apple +", "+ _applePrice +"원");
		System.out.println(this._tomato+", "+ _tomatoPrice+"원");
		System.out.println(this._mango+", "+ _mangoPrice+"원");
		
	}
	
	
	// 과일 가격 문의
		// 메소드명 : ask
		// 전달인자 : 과일명
		// 리턴타입 : 가격
	
	// 배열, 반복문 사용하지 않는 버전
	// 새로운 과일 추가할 때마다 else if 사용해야 함.
		int ask(String fruitName) {
			if(this._apple.equals(fruitName)) {
				return _applePrice;

			} else if(this._tomato.equals(fruitName)) {
//				return 2000;
				return _tomatoPrice;
			} else if(this._mango.equals(fruitName)) {
//				return 2000;
				return _mangoPrice;
			} else {
				System.out.println("그런 과일 없습니다");
				return -1;
			}
		}
		
		
	// 배열과 반복문 사용하는 버전	
		int ask2(String fruitName) {
			// 전체 과일 중에서
			for(int i=0; i<fruits.length; i++) {
				
				// 전달받은 이름과 같은게 있다면
				if(this.fruits[i].name.equals(fruitName)) {
					
					// 그 과일의 가격을 돌려줘라
					return this.fruits[i].price;
				}
			}
			
			System.out.println("그런 과일 없습니다");
			return -1;
		}
		
		// 과일 추가 기능
		// 기존 배열에 새로운 과일클래스를 추가
		// 메소드 이름 	: addFruit
		// 전달인자   	: Fruitt
		// 리턴타입 	: void
		
		void addFruit(Fruitt fruit) {
//			System.out.println("addFruit >> fruit:" + fruit);
			// 기존 것의 마지막에 하나 추가
			
			// 기존 것 보다 하나 큰 배열 만들기
			Fruitt[] newFruits = new Fruitt[this.fruits.length + 1];
			
			// 기존 것 복사
			for(int i=0; i<this.fruits.length; i++) {
				newFruits[i] = this.fruits[i]; // 깊은 복사
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
