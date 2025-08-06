package sec01.exam01;

public class RemoconExam {

	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.setVolume(50);
		System.out.println(tv.vol);
		
		// 추상적 메소드라 new 안됨
//		new RemoteControl();
		RemoteControl rc1 = (RemoteControl)tv;
		RemoteControl rc2 = tv;
		powerOn(tv);
	}
	// main이 static이기 때문에 static이어야 사용가능
	 static void powerOn(RemoteControl rc) {
		rc.turnOn();
	}

}
