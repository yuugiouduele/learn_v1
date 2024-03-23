package exam;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Quest37 {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat s = new SimpleDateFormat("yyyyMMdd");
		for (int i = 1; i <= 3;i++) {
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			c.add(Calendar.DAY_OF_MONTH, i-1);
			Date A = c.getTime();
			System.out.println(s.format(A));
		}
	}
}
