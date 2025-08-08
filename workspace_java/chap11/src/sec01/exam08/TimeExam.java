package sec01.exam08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeExam {

	public static void main(String[] args) {
		
		// currentTimeMillis
		long before = System.currentTimeMillis();
		
		for(int i=0; i<1000000; i++) {
//			System.out.println(i);
		}
		
		long after = System.currentTimeMillis();
		System.out.println("걸린시간 :" + (after-before)+"[ms]");
		System.out.println(after);
		System.out.println(Long.MAX_VALUE);
		
						
		// import 단축키 crtl + shift + o(영어)
		// Date
		Date date = new Date();	
		System.out.println(date);
		
		// HH는 24시간 hh시는 12시간
		String format = "yyyy년 MM월 dd일 HH:mm:ss.SSS";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String strDate = sdf.format(date);
		System.out.println(strDate);
		
		
		
		
	}

}
