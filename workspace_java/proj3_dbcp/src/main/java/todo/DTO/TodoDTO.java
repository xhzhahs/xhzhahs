package todo.DTO;

import java.sql.Date;

// DTO : Data Transfer Object
public class TodoDTO {

	// DB 컬럼에서 한 줄에 있던 것들을 뽑을 예정
	
	private int tno;		// 할일 고유 번호
	private String title;	// 할일
	private Date duedate;	// 마감일		// java.sql로 import
	private int finished;	// 완료 여부	// boolean으로도 가능하지만 복잡해지므로 일단 int로
	
		
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDuedate() {
		return duedate;
	}
	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}
	public int getFinished() {
		return finished;
	}
	public void setFinished(int finished) {
		this.finished = finished;
	}
	
	@Override
	public String toString() {
		return "TodoDTO [tno=" + tno + ", title=" + title + ", duedate=" + duedate + ", finished=" + finished + "]";
	}
	
	
	
}
