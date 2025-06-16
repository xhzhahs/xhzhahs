package sec06.exam02.pack3;

import sec06.exam02.pack1.Access1;
import sec06.exam02.pack2.Access2;

public class AccessExam {

	public static void main(String[] args) {

		// 생성자가 public이 아니어서 생성 못함
		Access1 a1 = new Access1(); // 기본생성자로 사용하면 생성 가능
		// 패키지가 달라서 접근이 제한되어 사용 불가
		// 생성자 앞에 아무것도 붙지 않으면 defalt 접근제한
		
		Access2 a2 = new Access2();
//		a2.tes1(); // public 아님
		a2.test2(); // public
		
		
	}

}
