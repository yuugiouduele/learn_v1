package exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Quest48 {
	public static void main(String[] args) {
		HashMap<String, ArrayList<Integer>> r = new HashMap<String, ArrayList<Integer>>();
		
		ArrayList<Integer>List=new ArrayList<Integer>();
		Random rnd = new Random();
		for (int i = 0; i < 10; i++) {
			int a = rnd.nextInt(1000);
			List.add(a);
		}
		
		
		r.put("Toyo", List);
		System.out.println(r);
	}
}
