package exam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Quest34 {
	public static void main(String[] args) {
		Date date=new Date();
		SimpleDateFormat s=new SimpleDateFormat("yyyyMMdd");
		System.out.println(s.format(date));
	}
}
