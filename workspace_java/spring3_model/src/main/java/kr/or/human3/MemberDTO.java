package kr.or.human3;

import lombok.Data;

//@Getter
//@Setter
//@ToString
//@RequiredArgsConstructor
//@EqualsAndHashCode

// 위 모든 것을 자동으로 해줌
@Data
public class MemberDTO {

	private String id;
	private String pw;
	private String name;
	private int age;
	private String tel;
	
	
	
	
}
