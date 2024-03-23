package exam;

import java.io.FileReader;

public class ファイル読み込み2 {
	public static void main(String[] args) throws Exception {
		 StringBuilder builder = new StringBuilder();
		 int data;
		 FileReader reader = new FileReader("sample.txt");
		 while( (data = reader.read()) != -1){
		 builder.append((char)data);
		 }
		 reader.close();
		 System.out.println(builder);
		}

}
