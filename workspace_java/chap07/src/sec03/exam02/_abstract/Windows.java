package sec03.exam02._abstract;

public abstract class Windows {

	void boot() {
		System.out.println("CMOS 실행");
		System.out.println("윈도우 실행");
		start();
		System.out.println("마우스 커서는 로딩중...");
	}
	
	abstract void start();
	
	// abstract에서는 final과 private 사용 불가
//	abstract final void start();
//	private abstract final void start();
	
//	abstract void desktop();
	void desktop() {
		
	}
	
}
