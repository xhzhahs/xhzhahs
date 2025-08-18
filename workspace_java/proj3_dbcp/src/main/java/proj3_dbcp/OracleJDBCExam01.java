package proj3_dbcp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleJDBCExam01 {

	public static void main(String[] args) {

		String url ="jdbc:oracle:thin:@125.181.132.133:51521:xe";
		String user ="scott4_19";
		String password = "tiger";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		// 닫는 순서는 rs -> ps -> conn
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			// Class.forName : String을 이용해서 class 생성
			// Oracle 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// DB 접속
			conn = DriverManager.getConnection(url, user, password);
			
			// SQL 준비
			String query = "select * from emp";
			ps = conn.prepareStatement(query);
			
			// SQL 실행 및 결과 확보
			// set타입은 순서를 보장하지 않음
			// rs에는 데이터베이스 목록이 전부 들어있음
			rs = ps.executeQuery();
			
			// 결과 활용
//			rs.next(); // 다음줄이 있는가?
			// next가 실행된 이후 rs 변수는 한줄로 변경 됨
			// 커서가 다음 줄로 이동 된다.
//			if( rs.next() ) {
//				int empno = rs.getInt("empno");
//				System.out.println("첫번째 empno : "+ empno);
//				
//				String ename = rs.getString("ename");
//				System.out.println("첫번째 ename : "+ ename);
//			}
//			if( rs.next() ) {
//				int empno = rs.getInt("empno");
//				System.out.println("두번째 empno : "+ empno);
//				
//				String ename = rs.getString("ename");
//				System.out.println("두번째 ename : "+ ename);
//			}
			
			while(rs.next()) {
				// 전달인자로 컬럼명(대소문자 구분없음)
				int empno = rs.getInt("empno");
				System.out.print(empno + ",");
				String ename = rs.getString("ename");
				System.out.println(ename);
			}
			
//			conn.close();	// final에서 해주는게 좋음
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// 같은 exception이므로 같이써도 됨
			if(rs == null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(ps !=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
