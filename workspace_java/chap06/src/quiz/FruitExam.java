package quiz;

public class FruitExam {

	public static void main(String[] args) {

		Fruit fruit1 = new Fruit();
		fruit1.setInfo("사과", 10000, 100);
		System.out.println(fruit1.getInfo());
		
		Fruit fruit2 = new Fruit();
		fruit2.setInfo("바나나", 5000, 15);
		System.out.println(fruit2.getInfo());
		
		Fruit fruit3 = new Fruit();
		fruit3.setInfo("수박", 55000, 3);
		System.out.println(fruit3.getInfo());
		
		Fruit fruit4 = new Fruit();
		fruit4.setInfo("복숭아", 3000, 11);
		System.out.println(fruit4.getInfo());
		
		Fruit fruit5 = new Fruit();
		fruit5.setInfo("키위", 7000, 30);
		System.out.println(fruit5.getInfo());
		
		System.out.println("-------가격문의-----------------------------------");
		
		Fruit fruit = new Fruit();
		String result = fruit.ask("수박", 3);
		System.out.println(result);
		
		System.out.println("-------목록출력-----------------------------------");
		String result1 = fruit.list("수박");
		System.out.println(result1);
		
		System.out.println("-------거스름돈-----------------------------------");
		String result2 = fruit.pay("수박",2,500000);
		System.out.println(result2);
		
	}

}
