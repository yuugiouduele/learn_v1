package exam;

public class Exam7101 {
	public static void main(String[] args) {
		 String html = "<html><body><div></div></body></html>";
		 String replacedString =html.replace("<","&lt").replace(">", "&gt;");
		 System.out.println(replacedString);
		 }
}
