package proj3_dbcp;

import java.sql.Connection;

public class OracleJDBCExam01 {

	public static void main(String[] args) {

		String url ="jdbc:oracle:thin@125.181.132.133:51521:xe";
		String user ="scott4_19";
		String password = "tiger";
		
		Connection conn = null;
		
		try {
			
			// JDBC 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
