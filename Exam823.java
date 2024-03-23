package exam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam823 {
	public static void main(String[] args) throws Exception {
		 String[] testdata = { "8.gj-aaaaaaaaaaaaaaa +AZ",".12345-aaaaaaaaaaaaaaa +FF"};
		 for (String test : testdata) {
		 Pattern p = Pattern
		 .compile("^([0-9]{1}||[^0-9]{1})\\.([a-z0-9]{2,5})\\-([a]{15})\\ \\+([A-Z]{2})$");
		 Matcher m = p.matcher(test);
		 if (m.find()) {
			 System.out.println(String.format("[%s]は正しい正規表現",test));
		 }else {
			 System.out.println(String.format("[%s]は不正な正規表現",test));
		 }
		 }
}
}