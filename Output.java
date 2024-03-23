package exam;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Output {
	public static void main(String[] args) throws Exception {
		BufferedWriter bw = null;
		
		try {
			
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
				"../files/.txt"), "Shift_JIS");
		bw = new BufferedWriter(osw);
		bw.write("日本語出力");
		} catch (Exception ex) {
		throw ex;
		} finally {
		if (bw != null)
		bw.close();
		}
		}
}
