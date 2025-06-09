package sec01.exam01;

public class StudentExam01 {

	public static void main(String[] args) {

		Student s1 = new Student();
		
		Student s2 = new Student();
		
		System.out.println(s1 == s2); // false
		
		Student s3 = null; // Student가 참조타입이기 때문에 null이 들어갈 수 있다.
		s3 = s1; // 얕은 복사
		
		System.out.println(s1 == s3); // true
		
		s1 = null;
		s3 = null;
		
		System.out.println(s1 == s3); // true
		
		System.out.println(s2);
		
		
		
		
		
		
	}

}
