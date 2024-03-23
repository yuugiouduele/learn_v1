package exam;

import java.util.ArrayList;

public class Quest33 {
	public static void main(String[] args) {
		String d = "20140808";
		ArrayList<String>a=new ArrayList<String>();
		a.add(d.substring(0,4));
		a.add(d.substring(4,6));
		a.add(d.substring(6,8));
		String s = "";
		s=String.join("/", a);
		System.out.println(s);
	}
}
