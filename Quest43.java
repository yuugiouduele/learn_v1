package exam;

import java.util.ArrayList;
import java.util.HashMap;

public class Quest43 {
	public static void main(String[] args) {
		HashMap<String, ArrayList<Integer>> r = new HashMap<String, ArrayList<Integer>>();
		ArrayList<Integer>List=new ArrayList<Integer>();
		List.add(15);
		List.add(25);
		ArrayList<Integer>List2=new ArrayList<Integer>();
		List2.add(10);
		List2.add(20);
		
		List.add(1, 40);
		
		r.put("Mura",List);
		r.put("Toyo", List2);
		
		System.out.println(r);
	}
}
