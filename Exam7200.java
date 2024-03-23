package exam;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Exam7200 {
	public static void main(String[] args) throws Exception {
		 //↑の throws Exception を忘れずに
		 //①
		 SimpleDateFormat converter = new SimpleDateFormat("yyyyMMdd");
		 converter.setLenient(false); 
		try {
			Date d = converter.parse("19741254");
		 SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		 String frmt = formatter.format(d);
		 System.out.println(frmt);
		}catch(ParseException ex) {
			System.out.println("エラー発生");
		}
	}	
}
