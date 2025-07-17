package sec01.exam01;

public class Parent {

	String name = "Parent의 name";
	
	String getName() {
		System.out.println("Parent의 getName실행");
		return this.name;
	}
	
	Parent(int a){
		System.out.println("Parent 생성자");
	}
}
