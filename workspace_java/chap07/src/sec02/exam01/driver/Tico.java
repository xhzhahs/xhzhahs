package sec02.exam01.driver;

public class Tico extends Car{

	@Override
	void run() {
		System.out.println("티코 출발!!");
	}
	
	void autoRun() {
		System.out.println("자율 주행을 시작합니다.");
	}
	
	
}
