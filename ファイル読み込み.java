package exam;

import java.io.FileReader;

public class ファイル読み込み {
	
	public static void main(String[] args) throws Exception {
		 FileReader reader = new FileReader("sample.txt");
		 char c1 = (char)reader.read();
		 char c2 = (char)reader.read();
		 char c3 = (char)reader.read();
		 char c4 = (char)reader.read();
		 char c5 = (char)reader.read();
		 System.out.print(c1);
		 System.out.print(c2);
		 System.out.print(c3);
		 System.out.print(c4);
		 System.out.print(c5);
		 reader.close(); 
		}

}
