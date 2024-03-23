package exam;

import java.util.ArrayList;

public class Exam811 {
	public static void main(String[] args) {
		String[] inputdata = { "abc", "def", "", "123", " 5 ", "12 ", " ", " ", "end" };
		ArrayList<String> normaldata = new ArrayList<String>();
		for (String inpt : inputdata) {
			if (hasValue(inpt)) {
				normaldata.add(inpt);
			}
		}
		System.out.println(normaldata);
	}

	private static boolean hasValue(String s) {
		boolean bool;
		if (s == "" || s == " ") {
			bool = false;
		} else {
			bool = true;
		}
		boolean hasValue = bool;
		return hasValue;
	}

}
