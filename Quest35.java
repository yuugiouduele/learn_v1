package exam;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Quest35 {
	public static void main(String[] args) {
		Date date=new Date();
		SimpleDateFormat s=new SimpleDateFormat("yyyyMMdd");
		String d=s.format(date);
		ArrayList<String>a=new ArrayList<String>();
		a.add(d.substring(0,4));
		a.add(d.substring(4,6));
		a.add(d.substring(6,8));
		String s2 = "";
		s2=String.join("/", a);
		System.out.println(s2);
	}
}
