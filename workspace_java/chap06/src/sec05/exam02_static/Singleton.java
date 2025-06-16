package sec05.exam02_static;

public class Singleton {

//	Singleton singleton = null;
	private static Singleton singleton = null;
	
	private Singleton() { // private 다른 클래스에서 new 사용 못함
		
	}
	
	
//	Singleton getInstance() {
	static Singleton getInstance() { 
	// 생성자를 private로 만들었기때문에 static으로 만들어줌
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
	
	
	
	
	
	
}
