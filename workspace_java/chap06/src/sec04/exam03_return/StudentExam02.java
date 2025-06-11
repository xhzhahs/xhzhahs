package sec04.exam03_return;

public class StudentExam02 {

	public static void main(String[] args) {

		/**
		필드
		1. 학생 클래스를 만들고
		2. 이름과 나이 필드를 만든다
		3. 학생Exam 클래스를 만들고
		4. 학생 2명을 각각 등록하고
		5. 두 학생의 정보를 각각 출력해보세요

		메소드
		1. 메소드를 통해서 
		2. 이름과 나이를 전달해서 저장하기
		3. 이름과 나이를 돌려받아서 출력하기
	**/

	// 필드 문제 풀이
	Student student1 = new Student();
	student1.name = "철수";
	student1.age = 20;
	System.out.println("이름: "+ student1.name+ ", 나이: "+ student1.age);
	
	Student student2 = new Student();
	student2.name = "영희";
	student2.age = 23;
	System.out.println("이름: "+ student2.name+ ", 나이: "+ student2.age);
	
	// 메소드 문제 풀이
	
	student1.setName("철수");
//	System.out.println(student1.name);
	
	// 방법 1
	String name = student1.getName();
	System.out.println("name: "+ name);
	
	int age = student1.getAge();
	System.out.println("age: "+ age);
	
	String name1 = student2.getName();
	System.out.println("name: "+ name1);
	
	int age1 = student2.getAge();
	System.out.println("age: "+ age1);
	
	// 방법 1-1
	student1.setInfo("철수", 20);
	System.out.println("이름은 "+ student1.getName()+ ", 나이는 "+ student1.getAge()+"세 입니다");
	
	student2.setInfo("영희", 25);
	System.out.println("이름은 "+ student2.getName()+ ", 나이는 "+ student2.getAge()+"세 입니다");
	
	// 방법 2
	String info = student1.getInfo();
	System.out.println(student1.getInfo());
	
	String info1 = student2.getInfo();
	System.out.println(student2.getInfo());
	
	

		
		
		
		
		
		
	}

}
