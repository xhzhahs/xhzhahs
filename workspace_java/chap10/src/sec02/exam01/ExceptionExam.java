package sec02.exam01;

public class ExceptionExam {

	public static void main(String[] args) {

		System.out.println("아무거나 출력");

		for (int i = 0; i < args.length; i++) {
			System.out.println(i + " : " + args[i]);
		}
		int a = -1;
		try {
			String name = "민수";
			a = Integer.parseInt(name);
			
			
			System.out.println(args[100]);
			System.out.println("1번 자리");

		// if문 처럼 동작함. 
//		} catch (Exception e) {
//			
//			System.out.println("4번 자리");
//			e.printStackTrace();
			
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("2번 자리");
			
			// e.printStackTrace를 적지 않으면 에러가 나지 않아 수정하기 힘들다.
			// 그러므로 적어주기
			e.printStackTrace();
			
		} catch (NumberFormatException e) {
			System.out.println("3번 자리");
			e.printStackTrace();
			System.out.println("------------------");
			System.out.println(e);
			System.out.println(":-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally 무조건 실행");
		}
		System.out.println("출력");
		System.out.println(a);

	}

	// try catch 습관화 하기!!!
	void test() {
		try {
			// 여기다 코딩하기
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
