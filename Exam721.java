package exam;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exam721 {
	public static void main(String[] args) throws Exception {
		SimpleDateFormat converter = new SimpleDateFormat("yyyyMMdd");
		converter.setLenient(false);
		Date d = converter.parse("20200401");
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		int a = 50;
		int c = 100;
		String return1 = addDate(d, a, c);
		System.out.println(return1);
	}

	public static String addDate(Date d, int a, int c) {

		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.DATE, a);
		cal.add(Calendar.DATE, c);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		String addDate = formatter.format(cal.getTime());

		return addDate;

	}
}
