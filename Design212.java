package exam;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import orbeq.text.Charaset;
public class Design212 {
	public static void main(String[] arg) throws Exception {
		String a = read("../sample.txt ", Charaset.Shift_JIS);
		System.out.println(a);
}
	public static String read(String filepath, Charaset charaset) throws IOException{
		BufferedReader br = null;
		try{
		FileInputStream fis = new FileInputStream(filepath);
		InputStreamReader isr = new InputStreamReader(fis, charaset.toString());
		br = new BufferedReader(isr);
		String line;
		StringBuilder sb = new StringBuilder();
		while((line=br.readLine()) != null){
		sb.append(line);
		}
		return sb.toString();
		}catch(IOException ex){
		throw ex;
		}finally{
		if(br != null) br.close();
		}
		}
	}

