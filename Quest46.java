package exam;
import java.util.ArrayList;
import java.util.HashMap;

public class Quest46 {
	public static void main(String[] args) {
		HashMap<String, ArrayList<Integer>> r = new HashMap<String, ArrayList<Integer>>();
		ArrayList<Integer>List=new ArrayList<Integer>();
		List.add(15);
		List.add(25);
		ArrayList<Integer>List2=new ArrayList<Integer>();
		List2.add(10);
		List2.add(20);
		
		r.put("Mura",List);
		r.put("Toyo", List2);
		r.remove("Toyo");
		
		System.out.println(r);
	}
}
