package sec01.exam01;

public class ForExam {

	public static void main(String[] args) {

		int sum = 0;
		for (int i=1; i<=100; i++) { 
			// for (int i=1; 
			//      i<=100; 
			//      i++) ()�쓽 臾몄옣�� �궗�떎�긽 媛곴컖 �븳 臾몄옣�씠�떎.
			sum = sum +i;
		}
		System.out.println("1~100�쓽 �빀: "+ sum);
		
//		int sum = 0;
//		int i = 1;
//		for (    ; i<=100; i++) { 
//			sum = sum +i;
//		}
//		System.out.println("1~100�쓽 �빀: "+ sum);
//		
//		int sum = 0;
//		int i;
//		for ( i = 1; i<=100; i++) { 
//			sum = sum +i;
//		}
//		System.out.println("1~100�쓽 �빀: "+ sum); 
//		�쐞 肄붾뱶�뱾�� 媛숈� 肄붾뱶
		
		int sum0 = 0;
		for (int i = 1; i<=100; i = i + 2) { 
			sum0 = sum0 +i;
		}
		System.out.println(sum0);
		
		// 1�뵫 利앷��븯�뒗 寃껋쓣 10踰� �븯�젮怨� �븷 �븣 
		int sum1 = 0;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;   
		System.out.println(sum1);
		
		// for臾몄쑝濡� 蹂�寃�
		sum1 = 0;
		for(int i=1; i<=10; i++) {
			sum1 = sum1 + 1;
		}
		System.out.println("sum1: "+ sum1);	
		
		int limit = 10;
		for(int i = 1; i <= limit; i = i + 1) {
			sum1 = sum1 + 1;
		}
		
		// 1~5源뚯� �빀 援ы븯湲� 
		/*
		for (int i = 1; i<=5; i = i + 1) { 
			sum = sum +i;
		}
		遺꾪빐�빐 蹂댁옄.
		 */
		
		int i = 1;
		sum = 0;
		
		sum = sum + i; // i:1
		i++;
		
		sum = sum + i; // i:2
		i++;

		sum = sum + i; // i:3
		i++;
		
		/*
		 * 諛섎났臾� 留뚮뱶�뒗 �썝由�
		 1. 諛섎났�릺�뒗 寃� 李얘린
		  	ctrl + c, v �뻽�쓣 �븣 諛붾�뚯� �븡�뒗 寃�
		 2. 諛섎났�릺吏� �븡�뒗 寃껋뿉�꽌 洹쒖튃(�뙣�꽩) 李얘린
		  	蹂��닔瑜� �솢�슜�빐�꽌 �뜑 �씠�긽 諛붾�뚯� �븡寃� 留뚮뱾湲�
		 3. �떆�옉 議곌굔 �뙆�븙
		 4. 醫낅즺 議곌굔 �뙆�븙	
		 
		 for : 諛섎났 �슏�닔瑜� �븘�뒗 寃쎌슦
		 while : 諛섎났 �슏�닔瑜� 紐⑤Ⅴ�뒗 寃쎌슦
		 */
		
		// 援ш뎄�떒 2�떒�쓣 異쒕젰�븯�떆�삤

		int x2 = 0;
		for(int i2 =1; i2<=9; i2++) {
			x2 = 2 * i2;
			System.out.println("2 x "+ i2 +" = "+ x2);
		}
		
		// 2~10源뚯� 以� 吏앹닔留� 異쒕젰
		/* 
		 * int i3 = 2;
		 
		System.out.println(i3);
		i3 = i3 + 2;
		
		System.out.println(i3);
		i3 = i3 + 2;
		
		System.out.println(i3);
		i3 = i3 + 2;
		
		System.out.println(i3);
		i3 = i3 + 2;
		
		System.out.println(i3);
		*/
		
		for(int i3 = 2; i3<=10; i3 = i3 + 2) {
			System.out.println(i3);
		}
	
		// 10~1源뚯� 異쒕젰
		/* 
		 * int i4 = 10;
		 
		System.out.println(i4);
		i4 = i4 - 1;
		
		System.out.println(i4);
		i4 = i4 - 1;
		
		System.out.println(i4);
		i4 = i4 - 1;
		
		System.out.println(i4);
		i4 = i4 - 1;
		
		System.out.println(i4);
		*/		
		for(int i4 = 10; i4 >=1; i4 = i4 - 1) {
			System.out.println(i4);
		}
				
		// 1~10源뚯� �떎�쓬怨� 媛숈씠 異쒕젰
		// 1: ���닔
		// 2: 吏앹닔
		for(int i5 = 1; i5<=10; i5++) {
			if(i5 % 2 == 0) {
				System.out.println(i5 +": 吏앹닔");
			} else {
				System.out.println(i5 +": ���닔");
			}
		}
		
		// 1~10源뚯� 3媛쒖뵫 �쁿�쑝濡� 李띻린
		for(int i6 = 1; i6 <= 10; i6++) {
			if(i6 % 3 == 0) {
				System.out.println(i6);
			} else {
				System.out.print(i6+ " ");
			}
		}
		
		/* 
		 * �떎瑜� 諛⑸쾿1
		 * for(int i6 = 1; int6 <= 10; int6 += 3) {
		 * 		if(int6 != 10) {
		 * 			System.out.println(i6+ " "+(i6+1) +" "+ (i6+2));
		 * 		} else {
		 * 			System.out.println(i6);
		 * 		}
		 * }
		 */
		/*
		 * �떎瑜� 諛⑸쾿2
		 * int i6 =1;
		 * for(int i6 =1; i6 <= 10; i6++) {
		 * 		System.out.print(i6+ " ");
		 * 		if(i6 % 3 == 0) {
		 * 			System.out.println();
		 * 		}
		 * }
		 */
		
		System.out.println();
		
		// 1遺��꽣 100源뚯� ���닔�쓽 媛쒖닔
	
		int count = 0;
		for(int i7 = 1; i7 <= 100; i7++) {
			if(i7 % 2 != 0) {
			count = count +1;	// count++;濡� �벐湲� 媛��뒫
			}
		}
		System.out.println("���닔�뒗 "+ count+ "媛� �엯�땲�떎");
		
		
		// 援ш뎄�떒 �쟾泥� 異쒕젰 (2�떒遺��꽣 9�떒源뚯�)
		for(int d = 2; d <=9; d++) {
			System.out.println(d + "�떒");
			for(int i8 = 1; i8<=9; i8++) {
				System.out.println(d+ " x "+ i8+ " = "+ (d * i8));
			}
			System.out.println();
		}
		
		// 援ш뎄�떒 �떒蹂꾨줈 �븳以꾨줈 異쒕젰
		for(int d = 2; d <=9; d++) {
			for(int i8 = 1; i8<=9; i8++) {
				System.out.print(d+ " x "+ i8+ " = "+ (d * i8)+ " ");
			}
			System.out.println();
		}
		
		// �몢~�꽭�떒�뵫 �쁿�쑝濡� 異쒕젰
		System.out.println("臾몄젣-------------------------");
		for(int k = 2; k <=9; k+=2) {
			for(int i8 = 1; i8<=9; i8++) {
				System.out.println(k+ " x "+ i8+ " = "+ (k * i8)+ " "+k+ " x "+ i8+ " = "+ (k * i8)+ " ");
			}
		}
		// ���씠
		System.out.println("臾몄젣���씠-------------------------");
		for(int k=2; k<=9; k+=2) {
			for(int j = 2; j<=9; j++) {
				System.out.print(k+ " x "+ j+ " = "+ (k * j)+ " ");
				if((k+1)<=9) {
				System.out.println((k+1)+ " x "+ j+ " = "+ ((k+1) * j)+ " ");
				}
			}	
			System.out.println();
			
		}

		// �뵾�씪誘몃뱶 李띻린
		/*
		....+....
		...+++...
		..+++++..
		.+++++++.  
		+++++++++ 
		 */
		
		// 0�떒怨�: + 5踰� 李띻린
		/*
			 +
			 +
			 +
			 +
			 +
		 */
//		System.out.println("+");
//		System.out.println("+");
//		System.out.println("+");
//		System.out.println("+");
//		System.out.println("+");

		for(int j=1; j<=5; j++) {
			System.out.println("+");
		}
		
		String mark = "+";
		// 1�떒怨�
		// +++++ 異쒕젰
		System.out.print(mark);
		System.out.print(mark);
		System.out.print(mark);
		System.out.print(mark);
		System.out.println(mark);
		
		for(int j=1; j<=5; j++) {
			System.out.print(mark);
		}
		System.out.println();
		
		// 2�떒怨�
		// +.+.+.+.+. 異쒕젰
		String space = ".";
		for(int j=1; j<=5; j++) {
			System.out.print(mark + space);
		}
		System.out.println();
		// �떎瑜몃갑踰�
		for(int j=1; j<=5; j++) {
			System.out.print(mark);
			System.out.print(space);
		}
		System.out.println();
		
		// 3�떒怨�
		/*
			 +++++
			 +++++
			 +++++
		 */
		for(int q=1; q<=3; q++) {
			for(int j=1; j<=5; j++) {
				System.out.print(mark);
			}
			System.out.println();
		}
		
		// 4�떒怨�
		/*
			11111
			22222
			33333
			44444
			55555
		 */
		for(int q=1; q<=5; q++) {
			for(int j=1; j<=5; j++) {
				System.out.print(q);
			}
			System.out.println();
		}
		// 5�떒怨�
		/*
			 1
			 22
			 333
			 4444
			 55555
		 */
		
		for(int q=1; q<=5; q++) {
			for(int j=1; j<=q; j++) {
				System.out.print(q);
			}
			System.out.println();
		}
		
		// 6�떒怨�
		/*
			+
			++
			+++
			++++
			+++++ 
		 */
		for(int q=1; q<=5; q++) {
			for(int j=1; j<=q; j++) {
				System.out.print(mark);
			}
			System.out.println();
		}
		
		// 7�떒怨�
		/*
			11111
			2222
			333
			44
			5
		 */
		for(int q=1; q<=5; q++) {
			for(int j=5; j>=q; j--) {
				System.out.print(q);
			}
			System.out.println();
		}
		
		// 8�떒怨�
			/*
				+....
			    ++...
			    +++..
			    ++++.
			    +++++
			 */
		for(int q=1; q<=5; q++) {
			for(int j=1; j<=q; j++) {
				System.out.print(mark);
			}
			for(int t=4; t>=q; t--) {
				System.out.print(space);
			}
			System.out.println();
		}
		
		// 9�떒怨�
		/*
			....+
		    ...++
		    ..+++
		    .++++
		    +++++
		 */
		for(int q=1; q<=5; q++) {
			for(int t=4; t>=q; t--) {
				System.out.print(space);
			}
			for(int j=1; j<=q; j++) {
				System.out.print(mark);
			}
			System.out.println();
		}
		
		
		// 10�떒怨�
		/*
			....+
		    ...+++
		    ..+++++
		    .+++++++
		    +++++++++
		 */
		for(int q=1; q<=5; q++) {
			for(int t=4; t>=q; t--) {
				System.out.print(space);
			}
			for(int j=1; j<=q; j++) {
				System.out.print(mark);
			}
			for(int j=2; j<=q; j++) {
				System.out.print(mark);
			}
			System.out.println();
		}
		
		
		// 11�떒怨�
		/*
			....+....
		    ...+++...
		    ..+++++..
		    .+++++++.
		    +++++++++
		 */
		for(int q=1; q<=5; q++) {
			for(int t=4; t>=q; t--) {
				System.out.print(space);
			}
			for(int j=1; j<=q; j++) {
				System.out.print(mark);
			}
			for(int j=2; j<=q; j++) {
				System.out.print(mark);
			}
			for(int t=4; t>=q; t--) {
				System.out.print(space);
			}
			System.out.println();
		}
		
		
		// 12�떒怨�
		// �엯�젰諛쏆� 以� �닔��濡� 異쒕젰
		// �삁瑜� �뱾�뼱 3�씠硫�
		/*
			..+..
		    .+++.
		    +++++ 
		 */
		int h = 10;
		for(int q=1; q<=h; q++) {
			for(int s=h-1; s>=q; s--) {
				System.out.print(space);
			}
			for(int j=1; j<=q; j++) {
				System.out.print(mark);
			}
			for(int j=2; j<=q; j++) {
				System.out.print(mark);
			}
			for(int s=h-1; s>=q; s--) {
				System.out.print(space);
			}
			System.out.println();
		}
		
		
		
		
	}

}
