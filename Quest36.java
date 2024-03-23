package exam;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Quest36 {
	public static void main(String[] args) {
		SimpleDateFormat s = new SimpleDateFormat("yyyyMMdd");
		String[] dates = new String[7];
		dates[0] = "20140429";
		dates[1] = "20140430";
		dates[2] = "20140431";
		dates[3] = "20140501";
		dates[4] = "20141230";
		dates[5] = "20141231";
		dates[6] = "20141301";
		for (int i = 0; i < 7; i++) {
			 
			try {
				
				if(dates[i]==(s.format((s.parse(dates[i]))))) {
				System.out.println(dates[i] + "は日付です");
				}else {
					System.out.println(dates[i] + "は日付ではありません");
				}
			} catch (ParseException ex) {
				
			}
		}
	}
}
