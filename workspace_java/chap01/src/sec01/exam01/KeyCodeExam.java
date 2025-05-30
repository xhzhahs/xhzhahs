package sec01.exam01;

import java.io.IOException;
import java.util.Scanner;

public class KeyCodeExam {

	public static void main(String[] args) {

		
		///// 출력에 관련된 내용
		System.out.println(1);
		System.out.println(2);
		
		System.out.print(3); // println이 아닌 print만 입력하면 엔터없이 출력됨
		System.out.print(4); // 출력 후 엔터를 안쳤기 때문에 다음 println은 엔터없이 옆에 출력 
		
		System.out.println();
		System.out.println(5);
		System.out.println(6);
		
		System.out.printf("이름: %s", "김자바");
		System.out.println();
		
		System.out.printf("이름: %s, 나이: %d", "김자바", 25); // printf는 엔터를 자동으로 쳐주지 않음
//		System.out.printf("이름: "+ "name" +", 나이: "+ 25); // 위 코드와 같은 코드이다. 
		System.out.println();
		
		System.out.printf("이름: %6s, 나이: %04d", "김자바", 25);
		// 6s, 4d는 길이를 6, 4로 왼쪽 빈자리 공백 (lpad), -6s,-4d는 오른쪽 빈 자리 공백(rpad) 
		// 04d는 4자리로 맞추면서 빈자리에는 0으로 lpad
		// %d에 소수를 넣으려면 f를 넣으면 된다.
		System.out.println();
		
		
		///// 입력에 관련된 내용
		int keyCode;
		
//		String a = "abc";
//		try { // 예외 처리, 무중단 기법, 에러가 나더라도 에러를 포함하여 출력이 됨
//			Integer.parseInt(a);
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		
		/*
		 * Scanner 연습하기 위해 주석처리함
		try { 
			keyCode = System.in.read();
			System.out.println("keyCode: "+ keyCode);
			
			keyCode = System.in.read();
			System.out.println("keyCode: "+ keyCode);
			
			keyCode = System.in.read();
			System.out.println("keyCode: "+ keyCode);
			
			keyCode = System.in.read();
			System.out.println("keyCode: "+ keyCode);
			
			keyCode = System.in.read();
			System.out.println("keyCode: "+ keyCode);
			
			keyCode = System.in.read();
			System.out.println("keyCode: "+ keyCode);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
			
		Scanner scan = new Scanner(System.in); // 스캐너에서 ctrl + shift + o를 누르면 빨간줄이 사라짐
//		String inputData = scan.nextLine(); // nextLine은엔터까지의 모든 글씨
		String inputData = "a"; // 위 문장에서 콘솔창에 a를 쓰는 것과 같은 결과 출력됨
		System.out.println("inputData : "+ inputData);
		
		String inputData2 = scan.next(); // next는 엔터쳤을 때 띄어쓰기까지의 모든 글씨
		System.out.println("inputData2 : "+ inputData2);
				
		int input = scan.nextInt(); // nextInt는 엔터쳤을 때의 숫자
		System.out.println("input : "+ (input*10));
		
		System.out.println("x값을 입력하시오 :");
		int input2 = scan.nextInt();
		System.out.println("입력한 x 값: "+ input2);
	}

}
