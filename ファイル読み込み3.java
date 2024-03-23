package exam;

import java.io.BufferedReader;
import java.io.FileReader;

public class ファイル読み込み3 {
	public static void main(String[] args) throws Exception {
		 FileReader reader = new FileReader("../sample.txt");
		 BufferedReader br = new BufferedReader(reader);
		 StringBuilder sb = new StringBuilder();
		 String line;
		 while ((line = br.readLine()) != null) {
		 sb.append(line);
		 }
		 br.close();
		 System.out.println(sb);
		 }

}
