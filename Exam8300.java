package exam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam8300 {
	public static void main(String[] args) throws Exception {
		 String[] testdata = { "10.1.243.15", "10.7.256.0", ".12.5.0.17" };
		 for (String test : testdata) {
		 Pattern p = Pattern
		 .compile("^([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})$");
		 Matcher m = p.matcher(test);
		 if (!m.find()) {
		 System.out.println(String.format("[%s]は不正な IP アドレスです", test));
		 continue;
		 }
		 int first = Integer.parseInt(m.group(1));
		 int second = Integer.parseInt(m.group(2));
		 int third = Integer.parseInt(m.group(3));
		 int fourth = Integer.parseInt(m.group(4));
		 if (255 < first || 255 < second || 255 < third || 255 < fourth) {
		 System.out.println(String.format("[%s]は不正な IP アドレスです", test));
		 continue;
		 }
		 System.out.println(String.format("[%s]は正常な IP アドレスです", test));
		 }
		 }

}
