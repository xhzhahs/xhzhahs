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
			String query = " select * from tbl_todo";
				   query += " order by tno";
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
	
	// DB접속을 편하게 하기 위해
	// 함수에 담아서 사용
	Connection getConnection() {
		
		Connection conn = null;
		try {
			
			// JNDI 방식으로 -> 글씨로 가져오는 것
			// context.xml에 있는 DB정보를 가져온다.
			// new부터 java:/comp/env/까지가 JNDI 방식으로 가져오는 방식
			// jdbc/oracle은 context.xml에 있는 name 작성
			Context ctx = new InitialContext();
			
			// DataSource : 커넥션 풀 관리자
			DataSource dataFactory = (DataSource)ctx.lookup("java:/comp/env/jdbc/oracle"); 
			
			// DB 접속
			conn = dataFactory.getConnection();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	// 자료 삽입
	// 메소드명 : insert
	// 전달인자 : TodoDTO
	// 리턴타입 : 아직 모르겠다.
	// 리턴타입 : int // insert된 행의 수
	
	public int insert(TodoDTO dto) {
		
		int result = -1;
		
		try {
			// DB 접속
			Connection conn = getConnection();
			
			// SQL 준비
			 // 앞이나 뒤에 한칸 뛰어 놓으면 단어가 붙어서 출력되지 않으므로
			 // 에러 확률 낮아짐
			String query = " insert into";
					query += " tbl_todo(tno, title, duedate, finished)";
			
				// 문자는 반드시 홀따옴표로 감싸주기!!!
				// 감싸지 않으면 컬럼으로 인식
//			query += " values (seq_tbl_todo.nextval, '"+ dto.getTitle() +"', '"+ dto.getDuedate() +"', "+ dto.getFinished()+")";
			
			// 변수방식
			query += " values (seq_tbl_todo.nextval, ?, ?, ?)";
			
				// prepare로 컴파일 해줌
			PreparedStatement ps = conn.prepareStatement(query);
			// 형변환도 자동으로 해준다.
			// 첫번째 전달인자는 몇번째?인지
			ps.setString(1, dto.getTitle());
			ps.setDate(2, dto.getDuedate());
			ps.setInt(3, dto.getFinished());
			
			// SQL 실행 및 결과 확보
			// select 실행 : executeQuery();
			// 그 외 실행 : executeUpdate();
			
			result = ps.executeUpdate();
			
			// 결과 활용
			System.out.println(result + "행 이(가) 삽입되었습니다.");
			
			ps.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int delete(TodoDTO dto) {
		int result = -1;
		try {
			// DB 접속
			Connection conn = getConnection();
			
			// SQL 준비
			String query = " delete tbl_todo";
			query		+= " where tno = ? ";
			PreparedStatement ps = conn.prepareStatement(query);
			// 형변환도 자동으로 해준다.
			// 첫번째 전달인자는 몇번째?인지
			ps.setInt(1, dto.getTno());
			
			result = ps.executeUpdate();
			
			ps.close();
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	
		return result;
	}
	
	public TodoDTO selectTodo(TodoDTO dto) {
		
		TodoDTO resultDTO = null;
		
		try {
		
			// DB 접속
			Connection conn = getConnection();
			
			// SQL 준비
			String sql = " select * from tbl_todo";
			sql		+= " where tno = ? ";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			// 형변환도 자동으로 해준다.
			// 첫번째 전달인자는 몇번째?인지
			ps.setInt(1, dto.getTno());
			
			// 실행 및 결과 확보
			ResultSet rs = ps.executeQuery();
			
			// 결과활용
			while(rs.next()) {
				resultDTO = new TodoDTO();
				
				int tno = rs.getInt("tno");
				resultDTO.setTno(tno);
				resultDTO.setTitle(rs.getString("title"));
				resultDTO.setDuedate(rs.getDate("duedate"));
				resultDTO.setFinished(rs.getInt("finished"));
				
			}
			
			rs.close();
			ps.close();
			conn.close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return resultDTO;
	}
	
	public int updateTodo(TodoDTO todoDTO) {
		
		int result = -1;
		
		try {
			// DB 접속
			Connection conn = getConnection();
			
			// SQL 준비
			String query = "";
			query += " update tbl_todo";
			query += " set title = ?,";
			query += "     duedate = ?,";
			query += "     finished = ?";
			query += " where tno = ?";
			
			PreparedStatement ps = conn.prepareStatement(query);
			// 형변환도 자동으로 해준다.
			// 첫번째 전달인자는 몇번째?인지
			ps.setString(1, todoDTO.getTitle());
			ps.setDate(2, todoDTO.getDuedate());
			ps.setInt(3, todoDTO.getFinished());
			ps.setInt(4, todoDTO.getTno());
			
			result = ps.executeUpdate();
			System.out.println(result + "행 이(가) 업데이트되었습니다.");
			
			ps.close();
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}
	
	
	
	
	
	
	
	
	
}
