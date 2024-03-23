package exam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam821 {
	public static void main(String[] args) throws Exception {
	 String[] inputdata = { "021345670-325","1475923-002", "222555999-1092",
	"63742572a-559", "123570579-0a0","356214824002",
	"22965841-8-022"};
	 for(String input : inputdata){
	 if( matchArticleId(input) ){
	 System.out.println(String.format("%s は商品番号です",input));
	 } else {
	 System.out.println(String.format("%s はエラーです",input));
	 }
	 }
	}
	private static boolean matchArticleId (String s){
			Pattern p=Pattern.compile("^[0-9]{9}-[0-9]{3}$");
			Matcher m=p.matcher(s);
			return m.find();
	}

}
