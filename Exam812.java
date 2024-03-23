package exam;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Exam812 {
	public static void main(String[] args) throws Exception {
		String[] inputdata = { "20140131", "20140132", "aaaa", "", "20150228", "20150229", "2014/7/7" };
		ArrayList<String> normaldata = new ArrayList<String>();
		for (String inpt : inputdata) {
			if (canParseDate(inpt)) {
				normaldata.add(inpt);
			}
		}
		System.out.println(normaldata);
	}

	private static boolean canParseDate(String s) {
		boolean bool = true;
		SimpleDateFormat converter = new SimpleDateFormat("yyyyMMdd");
		converter.setLenient(false);
		try {
			Date d = converter.parse(s);
			converter.format(d);
		} catch (Exception ex) {
			bool = false;
		}
		boolean canParseDate = bool;
		return canParseDate;
	}
}
