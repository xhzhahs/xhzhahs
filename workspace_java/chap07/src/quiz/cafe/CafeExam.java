package quiz.cafe;

public class CafeExam {

	public static void main(String[] args) {
		Paiks paiks = new Paiks();
		Mega mega = new Mega();
		
		Alba alba = new Alba();
		
		alba.work(paiks);
		alba.order("아메리카노", 2);
		System.out.println("------------");
		alba.work(mega);
		
		
		
		
	}

}
