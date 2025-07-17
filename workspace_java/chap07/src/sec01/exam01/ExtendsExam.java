package sec01.exam01;

public class ExtendsExam {

	public static void main(String[] args) {
		// Child를 생성해서
		Child child = new Child();
		System.out.println("----------------------");
		// printName 실행
		child.printName(); 

		System.out.println("child.name : " + child.name);
		 
		
		System.out.println( "child.getName() : " + child.getName() );
		child.setName("바뀐 이름");
		System.out.println( child.getName() );
	
	
	
	}

}
