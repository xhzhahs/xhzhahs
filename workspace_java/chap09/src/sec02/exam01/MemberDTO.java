package sec02.exam01;

public class MemberDTO {

	// DTO = Data Transfer Object
	String name;
	int age;
	
	// 자동완성하는법
	// 마우스오른쪽 클릭 -> source -> Generate toString
	@Override
	public String toString() {
		return "MemberDTO [name=" + name + ", age=" + age + "]";
	}
	
//	@Override
//	public String toString() {
//		return "name: " + name +", age"+ age;
//	}
	
	
	
	
}
