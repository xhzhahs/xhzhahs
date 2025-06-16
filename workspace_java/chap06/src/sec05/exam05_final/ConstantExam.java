package sec05.exam05_final;

public class ConstantExam {

	public static void main(String[] args) {

		int result = loginCheck("admin", "1234");
		if(result == Constant.LOGIN_SUCCESS) {
			System.out.println("로그인 성공 >> 메인페이지로 이동");
		}
		
	}

	static int loginCheck(String id, String pw) {
		if("admin".equals(id) && "1234".equals(pw)){
			return Constant.LOGIN_SUCCESS;
		} else {
			return Constant.LOGIN_FAIL;
		}
	}
	
}
