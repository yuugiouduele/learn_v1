package exam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam822 {
	public static void main(String[] args) throws Exception {
		String[] inputdata = { "A92", "C01", "D63", "69A", "A09", "Z06", "A5" , "A500" };
		for (String input : inputdata) {
			if (matchArticleId(input)) {
				System.out.println(String.format("%s は商品番号です", input));
			} else {
				System.out.println(String.format("%s はエラーです", input));
			}
		}
	}

	private static boolean matchArticleId(String s) {
		Pattern p = Pattern.compile("^[A-Z]{1}[0-9]{2}$");
		Matcher m = p.matcher(s);
		return m.find();
	}

}
