package exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Quest414 {
	public static void main(String[] args) {
		HashMap<String, ArrayList<Integer>> r = new HashMap<String, ArrayList<Integer>>();
		Random rnd = new Random();
		StringBuilder sb=new StringBuilder();
		sb.append("Toyo,");
		StringBuilder sb2=new StringBuilder();
		sb2.append("Mura,");
		StringBuilder sb3=new StringBuilder();
		sb3.append("Kuwa,");
		ArrayList<Integer>List=new ArrayList<Integer>();
		ArrayList<Integer>List2=new ArrayList<Integer>();
		ArrayList<Integer>List3=new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			int a = rnd.nextInt(1000);
			int b = rnd.nextInt(1000);
			int c = rnd.nextInt(1000);
			List.add(a);
			List2.add(b);
			List3.add(c);
			if(i<9) {
				sb.append(List.get(i)+",");
				sb2.append(List2.get(i)+",");
				sb3.append(List3.get(i)+",");
				}else {
					sb.append(List.get(i));
					sb2.append(List2.get(i));
					sb3.append(List3.get(i));
				}
		}
		String n=System.getProperty("line.separator");
		r.put("Toyo", List);
		r.put("Mura", List2);
		r.put("Kuwa", List3);
		String A=sb.toString();
		String B=sb2.toString();
		String C=sb3.toString();
		System.out.println(r);
		System.out.println(A+n+B+n+C);
	}
}
