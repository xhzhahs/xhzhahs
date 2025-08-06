package sec01.exam01;

// 인터페이스는 여러개 상속 가능하다. 
public class Tv extends Display implements RemoteControl, OTT {
	
	int vol;
	
	@Override
	public void turnOn() {
		System.out.println("tv를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("tv를 끕니다.");
	}

	@Override
	public void setVolume(int vol) {
//		if(vol > RemoteControl.MAX_VOLUME) {
//			System.out.println(RemoteControl.MAX_VOLUME+"이하만 가능");
//		} else if (vol < RemoteControl.MIN_VOLUME) {
//			System.out.println(RemoteControl.MIN_VOLUME+"이상만 가능");
//		} else {
//			this.vol = vol;
//		}
		
		// 최대치 이상일 경우 최대치로
		// 최소치 이하인 경우 최소치로
		if(vol > RemoteControl.MAX_VOLUME) vol = RemoteControl.MAX_VOLUME;
		else if(vol < RemoteControl.MIN_VOLUME) vol = RemoteControl.MIN_VOLUME;
		
		this.vol = vol;
	}

	@Override
	public void netflix() {
		System.out.println("넷플릭스 시청");
	}
}

