package exam;

import java.io.FileWriter;

public class filewriter {
	public static void main(String[] args) throws Exception {
		FileWriter fw = null;
		try {
		fw = new FileWriter("../files/myfile.txt",true);
		fw.write("Hello Write File");
		} catch (Exception ex) {
		throw ex;
		} finally {
		if (fw != null)
		fw.close();
		}
		}
}
