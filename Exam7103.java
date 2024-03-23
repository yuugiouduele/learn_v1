package exam;

public class Exam7103 {
	public static void main(String[] args) {
		 StringBuilder sb = new StringBuilder();
		 // ①
		 sb.append("abcdefghij");
		 System.out.println(sb.toString());
		 // ②
		 for (int i = 0; i < 10; i++) {
		 sb.insert(2 * i + 1, ",");
		 }
		 System.out.println(sb.toString());
		 // ③
		 sb.delete(sb.length() - 1, sb.length());
		 System.out.println(sb.toString());
		 }

}
