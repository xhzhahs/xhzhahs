package sec06.exam06.getset;

public class Car {

	// 필드는 private으로 지정해서
	// 직접 읽고 쓰는 걸 방지
	private int speed;
	private boolean stop;

	private String color;
	private double gas;

	// 이렇게 마음대로 만들어도 되는데
	public int thest() {
		return this.speed;
	}
	
	// getter & setter
	// 필드를 직접적으로 노출시키지 않으려고 하는게 목적
	
	// getter
	// 보통 필드 값을 돌려주는 기능
	// 메소드명 : get + 필드명(대문자로 시작)
	// 전달인자 : 없음
	// 리턴타입 : 필드의 타입
	
	public int getSpeed() {
		return this.speed;
	}
	
	// setter
	// 보통 필드 값을 수정하는 기능
	// 메소드명 : set + 필드명(대문자로 시작)
	// 전달인자 : 필드의 타입
	// 리턴타입 : void
	
	void setSpeed(int speed) {
		if(speed <= 0) {
		this.speed = speed;
		}
	}	
	
	
	// getter 중에서 boolean 타입의 경우
	// get 대신 is를 사용하기도 함(둘다 가능)
	// getStop, isStop 둘다 허용인데
	// 일부에서는 get만 사용하는 경우가 있다.

	public boolean isStop() {
		return this.stop;
	}
	
	public boolean getStop() {
		return this.stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	// 자동 완성된 getter/setter
	// 마우스 우클릭 + Source + Generate Getters and Setters
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getGas() {
		return gas;
	}
	
	public void setGas(double gas) {
		this.gas = gas;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
