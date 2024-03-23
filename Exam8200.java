package exam;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam8200 {
	public static void main(String[] args) throws Exception {
		 String[] inputdata = { "1591", "aAzZ", "798", "a 1 2", "12", "abc",
		 "987.1", "59", "012", "", "ABC" };
		 ArrayList<String> normal = new ArrayList<String>();
		 for (String input : inputdata) {
		 if (hasAnyValue(input))
		 normal.add(input);
		 }
		 System.out.println(normal);
		 }
		 private static boolean hasAnyValue(String input) {
		 Pattern p = Pattern.compile("^.+$");
		 Matcher m = p.matcher(input);
		 return m.find();
		 }

}
