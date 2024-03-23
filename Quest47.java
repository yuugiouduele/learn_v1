package exam;

import java.util.ArrayList;
import java.util.Random;

public class Quest47 {
	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Integer> List = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			int a = r.nextInt(100);
			List.add(a);
		}
		System.out.println(List);
	}
}