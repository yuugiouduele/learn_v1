package exam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam820 {
	public static void main(String[] args) {
		 String input = "kkkkkkkkkkkkkkkkkabc";
		 Pattern p = Pattern.compile("abc");
		 Matcher m = p.matcher(input);
		 if (m.find()) {
		 System.out.print("OK MATCH");
		 } else {
		 System.out.println("NOT MATCH");
		 }
		 }

}
