package exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Quest412 {
	public static void main(String[] args) {
		HashMap<String, ArrayList<Integer>> r = new HashMap<String, ArrayList<Integer>>();
		Random rnd = new Random();
		int sum=0;
		int sum2=0;
		int sum3=0;
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
			
			sum+=List.get(i);
			sum2+=List2.get(i);
			sum3+=List3.get(i);
		}
		
		r.put("Toyo", List);
		r.put("Mura", List2);
		r.put("Kuwa", List3);
		ArrayList<Integer>avg=new ArrayList<Integer>();
		avg.add(sum);
		avg.add(sum2);
		avg.add(sum3);
		avg.add(sum/List.size());
		avg.add(sum2/List2.size());
		avg.add(sum3/List3.size());
		System.out.println(r);
		System.out.println(avg);
	}
}
