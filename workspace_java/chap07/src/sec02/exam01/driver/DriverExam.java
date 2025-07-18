package sec02.exam01.driver;

import java.util.ArrayList;
import java.util.HashMap;

public class DriverExam {

	public static void main(String[] args) {

		Tico tico = new Tico();
		
		Driver driver = new Driver();
		
		driver.driveTico(tico);
		System.out.println("------------");
		
		Porsche911 p = new Porsche911();
		Car c1 = (Car) p;
		driver.drive(c1);
		System.out.println("------------");
		
		BmwM4 b = new BmwM4();
		driver.drive( (Car) b );
		System.out.println("------------");
		
		driver.drive( (Car) new Tico() );
		System.out.println("------------");
		
		ArrayList list = new ArrayList();
		list.add(driver);
		Driver d = (Driver)list.get(0);
		
		HashMap map = new HashMap();
		map.put("key", "value");			// HashMap 넣는 법
		String k = (String)map.get("key");	// HashMap 꺼내는 법
//		int j = (int)map.get("key");		// HashMap 꺼내는 법
		
	}

}
