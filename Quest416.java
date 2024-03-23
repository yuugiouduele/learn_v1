package exam;

import java.util.ArrayList;
import java.util.HashMap;

public class Quest416 {
	public static void main(String[] args) {
		String[] source = new String[3];
		source[0] = "Taka,55,13,79,87,9";
		source[1] = "Mura,56,23,99,7,33";
		source[2] = "Yama,11,25,7,98,64";
		String[] s=source[0].split(",");
		String[] s1=source[1].split(",");
		String[] s2=source[2].split(",");
		HashMap<String, ArrayList<String>> r = new HashMap<String, ArrayList<String>>();
		ArrayList<String>List=new ArrayList<String>();
		ArrayList<String>List2=new ArrayList<String>();
		ArrayList<String>List3=new ArrayList<String>();
		
		for(int i=1;i<s.length;i++) {
			
			List.add(s[i]);
			List2.add(s1[i]);
			List3.add(s2[i]);
			
		}
		r.put(s[0], List);
		r.put(s1[0], List2);
		r.put(s2[0], List3);
		System.out.println(r);
	}
}
