package exam;

import java.util.ArrayList;

public class Quest32 {
	public static void main(String[] args) {
		String d = "20140808";
		int a=Integer.parseInt(d);
		ArrayList<Integer>i=new ArrayList<Integer>();
		i.add(a/10000);
		i.add((a%10000)/100);
		i.add(a%100);
		System.out.println(i);
	}
}
