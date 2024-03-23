package exam;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Quest52 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = null;
		try {
		InputStreamReader isr = new InputStreamReader(new FileInputStream(
		"../files/csvmondai.csv"), "Shift_JIS");
		br = new BufferedReader(isr);
		String line;
		int i=0;
		while ((line = br.readLine()) != null) {
		String[] s=line.split(",");
		i+=s.length;
		}
		System.out.println(i+"件");
		} catch (Exception ex) {
		throw ex;
		} finally {
		if (br != null)
		br.close();
		}
	}
}
