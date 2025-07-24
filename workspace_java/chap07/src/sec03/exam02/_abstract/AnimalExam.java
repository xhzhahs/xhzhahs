package sec03.exam02._abstract;

public class AnimalExam {

	public static void main(String[] args) {

		// Dog는 자식으로서 abstract를 구현했으므로 new 가능
		Animal a = new Dog();
		a.sound();
		Dog dog = (Dog)a;
		
		System.out.println(dog.kind);
		System.out.println("----------------");
		testSound(dog);
		System.out.println(dog.kind);
	}

	// 전달인자로 참조타입을 주면 무조건 얕은 복사!
	static void testSound(Animal animal) {
		animal.sound();
		animal.kind = "개";
	}
	
	
}
