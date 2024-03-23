package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class Quest128 {
	public static void main(String[] args) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz ";
		Random r = new Random();
		ArrayList<Character> c = new ArrayList<Character>();
		HashMap<Character, Integer> A = new HashMap<Character, Integer>();
		for (int i = 0; i < 1000; i++) {
			c.add(alphabet.charAt(r.nextInt(27)));
		}
		for (int I = 0; I < 27; I++) {
			char a = alphabet.charAt(I);
			int z = Collections.frequency(c, a);
			A.put(a, z);
			System.out.println(a + "は" + A.get(a) + "個");

		}
	}
}
