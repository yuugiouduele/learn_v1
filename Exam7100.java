package exam;

public class Exam7100 {
	public static void main(String[] args) {
		 String str = "00001,吉田,一郎,19770205,0,i_yoshida@cview.co.jp";
		 String[] list = str.split(",");
		 for (String s : list) {
		 System.out.println(s);
		 }
		 }
}
