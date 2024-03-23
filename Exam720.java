package exam;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exam720 {
	public static void main(String[] args) {
			 
			 Calendar cldr = Calendar.getInstance();
			 
			 Date dt = cldr.getTime();
			 
			 SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd/E HH:mm:ss");
			 
			 String frmt = format.format(dt);
			 System.out.println(frmt);

		
	}
}
