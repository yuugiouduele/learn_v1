package exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Quest410 {
	public static void main(String[] args) {
		HashMap<String, ArrayList<Integer>> r = new HashMap<String, ArrayList<Integer>>();
		Random rnd = new Random();
		int sum2=0;
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
			
			sum2+=List2.get(i);
		}
		List2.add(sum2);
		
		r.put("Toyo", List);
		r.put("Mura", List2);
		r.put("Kuwa", List3);
		System.out.println(r.get("Mura"));
	}
}
