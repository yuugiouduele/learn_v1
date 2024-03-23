package exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Quest413 {
	public static void main(String[] args) {
		HashMap<String, ArrayList<Integer>> r = new HashMap<String, ArrayList<Integer>>();
		StringBuilder sb=new StringBuilder();
		sb.append("Toyo,");
		ArrayList<Integer>List=new ArrayList<Integer>();
		Random rnd = new Random();
		for (int i = 0; i < 10; i++) {
			int a = rnd.nextInt(1000);
			List.add(a);
			if(i<9) {
			sb.append(List.get(i)+",");
			}else {
				sb.append(List.get(i));
			}
		}
		r.put("Toyo", List);
		System.out.println(r);
		String A=sb.toString();
		System.out.println(A);
		
	}
}
