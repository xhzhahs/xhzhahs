package sec02.exam01;

public class Cat extends Animal {

	private int age = 3;
	
	@Override
	void eat() {
		System.out.println("와구와구");
	}
	
	@Override
	void think() {
		System.out.println("모르겠다.");
	}
	
	void clean() {
		System.out.println("배변 정리");
	}
	
	void grooming() {
		System.out.println("고양이 세수 합니다.");
	}
	
}
