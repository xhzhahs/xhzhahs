package sec02.exam01;

public class AnimalExam {

	public static void main(String[] args) {

		Animal a1 = new Animal();
		a1.think();
		a1.eat();
		
		Cat cat = new Cat();
		cat.eat();
		cat.grooming();
		
		// 자식이 부모가 될 때 부모타입으로 형변환 가능
		Animal a2 = (Animal)cat;	
		Animal a3 = cat;	// 자동 형변환으로 연산작 생략 가능	
		
		a2.eat();
//		a2.clean();	// 부모타입으로 형변환되었는데 부모에 없어서 오류
		
		Dog dog = new Dog();
		Animal a5 = dog;
		
		Animal a4 = new Dog();	// 부모타입으로도 가능, 형변환 생략되었음
		
		catMom(cat);	// catMom 메소드에 static 붙였을 때 이렇게 사용 가능
//		new AcimalExam().catMom(cat);	// catMom 메소드에 static을 붙이지 않으면 이렇게 new해서 사용
	
		animalCare(a4);
		animalCare(new Cat());
	
	}
	
	static void catMom(Cat cat) {
		System.out.println("캣맘 실행");
		cat.eat();
		cat.grooming();
	}
	
	static void animalCare(Animal a) {
		System.out.println("나이는 : "+ a.age);
		a.eat();
		a.think();
	}
	

}
