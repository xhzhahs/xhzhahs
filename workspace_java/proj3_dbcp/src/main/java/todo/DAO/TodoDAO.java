package todo.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import todo.DTO.TodoDTO;

// DAO : Data Access Object
public class TodoDAO {

	// tbl_todo 의 모든 항목을 돌려주는 메소드
	// 메소드명 : selectAll
	// 전달인자 : 없음
	// 리턴타입 : List<TodoDTO>
	
	public List<TodoDTO> selectAll(){
		
		List<TodoDTO> list = new ArrayList<>();
		
		try {
			// JNDI 방식으로 -> 글씨로 가져오는 것
			// context.xml에 있는 DB정보를 가져온다.
			// new부터 java:/comp/env/까지가 JNDI 방식으로 가져오는 방식
			// jdbc/oracle은 context.xml에 있는 name 작성
			Context ctx = new InitialContext();
			
			// DataSource : 커넥션 풀 관리자
			DataSource dataFactory = (DataSource)ctx.lookup("java:/comp/env/jdbc/oracle"); 
			
			// DB 접속
			Connection conn = dataFactory.getConnection();
			
			// SQL 준비
			String query = "select * from tbl_todo";
			PreparedStatement ps = conn.prepareStatement(query);
			
			// SQL 실행 및 결과 확보
			ResultSet rs = ps.executeQuery();
			
			// 결과 활용						
			while(rs.next()) {
				// 전달인자로 컬럼명(대소문자 구분없음)
				int tno = rs.getInt("tno");
				// 꿀팁! 하나는 꼭 출력해보기
				System.out.println("tno : "+ tno);
				String title = rs.getString("title");
				Date duedate = rs.getDate("duedate");
				int finished = rs.getInt("finished");
				
				// map도 가능하지만
				// map보다는 dto가 유리하다.
//				Map map = new HashMap();
//				map.put("tno", tno);
//				map.put("title", title);
//				map.put("duedate", duedate);
//				map.put("finished", finished);
//				list.add(map); // 안되는 이유는 제네릭으로 TodoDTO만 들어가게 해놨기 때문
				
				TodoDTO todoDTO = new TodoDTO();
				todoDTO.setTno(tno);
				todoDTO.setTitle(title);
				todoDTO.setDuedate(duedate);
				todoDTO.setFinished(finished);
				
				list.add(todoDTO);
				
				
				
			}
			
			rs.close();
			ps.close();
			conn.close(); // 커넥션 풀로 반환 -> 반환은 대기상태로 유지
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return list;
	}
}
