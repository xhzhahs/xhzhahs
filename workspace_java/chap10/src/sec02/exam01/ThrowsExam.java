package sec02.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsExam {

	public static void main(String[] args) {

		try {
			test();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			test2(50);
			
			
			
		} catch (HumanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			// getMessage는 String으로 돌려줌
			System.out.println(e.getMessage());
		
			String errorCode = e.getMessage();
			if(errorCode.equals("EV10")) {
				System.out.println("볼륨은 10이하만");
			}
		}
		FileInputStream fis = null;
		try {
			// 파일 열었음 / 열었으면 닫아줘야함.
			fis = new FileInputStream("c:\\tmp\\text.txt");
			// 뭔가했다치고
			// 예외가 발생할 수 있음
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fis != null) {
				// 파일 닫아줌
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		// try-with-resources
		// close() 자동실행 해줌
		// 닫아주는 것을 자동으로 해주는 역할
		// try 다음 ()가 들어감
		// Closeable 인터페이스가 있는 클래스만 ()에 넣을 수 있다.
		try(
//			String a = ""; // Closeable 인터페이스 없어서 사용불가
			FileInputStream fis2 = new FileInputStream("c:\\tmp\\text.txt");
		) {
			System.out.println("무엇인가 함");
			System.out.println(fis2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	
	
	}
	// throws는 예외처리를 떠넘긴다.
	static void test() throws ClassNotFoundException, IOException {
		Class.forName("aadklfjdljkldfsajl");
	}
	
	static void test2(int vol) throws HumanException {
		if(vol > 10) {
			throw new HumanException("EV10");
		} else if (vol < 0) {
			throw new HumanException("EV0");
		}
		System.out.println("vol :" + vol);
	}
	
	static void test3() {
		try {
			// 코딩
			"ㅁ".equals(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
