package sec01.exam01;

public class Child extends Parent {

	void printName() {
		System.out.println("Child의 printName 실행");
		System.out.println("name: "+ name);
		System.out.println("this.name: "+ this.name);

		String pName = getName();
		System.out.println("pName : "+ pName);

		System.out.println("super.name: "+ super.name);
	}
	
	// 전달인자가 필드를 가리는 형상
	// shadow
	void setName(String name) {
		this.name = name;
	}
	
	// 부모의 필드를 가리는 형상
	// overshadow
	String name = "Child의 name";
	
//	생략되어있던 기본생성자
//	Child(){
//		super();
//	}
	
	Child(){
		/** 	super()와 this() 
		  	모두 첫줄에 사용해야해서
			같이 사용할 수 없다.
		 **/
//		this(1);	// 내가 나를 호출
//		super();	// 부모의 생성자 호출 (생략 가능)
//					// 첫줄에 적어야 한다.
		super(1);	// 부모의 전달인자를 맞춰줘야 한다.
		System.out.println("Child 생성자");
	}
	
	Child(int a){
		super(1);
	}
	
	String getName() {
		System.out.println("Child의 getName실행");
		return this.name;
	}
}
