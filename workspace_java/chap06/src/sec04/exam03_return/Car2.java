package sec04.exam03_return;

public class Car2 {
	
	int gas; 
	int speed;
	
	void setSpeed(int s) {
		speed = s;
		System.out.println("속도를 " + speed+ "로 바꿉니다");
	}
	
	void setGas(int g) {
		gas = g;
	}
	
	// gas가 0이면 false, 그렇지 않으면 true를 돌려주는 메소드
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다");
			return false; // gas가 0이면 리턴하면서 메소드 종료시킴
			
		} else { // else가 있다는건 무조건 하나는 실행되는 것을 보장
			System.out.println("gas가 있습니다");
			return true;
		}// else를 쓰지 않고 바로 아래 출력문을 써도 된다.
		
//		System.out.println("gas가 있습니다");
//		return true;
	}
	
	// return을 한번만 하는 방식
	boolean isLeftGas2() {
		boolean result = false;
		if(gas == 0) {
			System.out.println("gas가 없습니다");
			result = false;
		} else {
			System.out.println("gas가 있습니다");
			result = true;
		}
		
		return result; // return이 하나면 따라가기 편하다
		
	}
	
	// 바로 return으로 받는 코드
	boolean isLeftGas3() {
//		boolean result = (gas != 0);
//		result return;
		return gas != 0;
	} 
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다! 잔량: "+ gas);
				setSpeed(gas*10); // 메소드 안에서 메소드 사용가능
				gas--;
			} else {
				System.out.println("멈춰! 잔량: "+ gas);
				return; // break를 쓸수도 있지만 더 강력한 return을 사용하면 return을 만날 때 뒤에 오는 코드는 실행되지 않는다.
			}
		}
	} 
	
	
	
	
	
}
