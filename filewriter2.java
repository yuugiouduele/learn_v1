package exam;

import java.io.FileWriter;

public class filewriter2 {
	public static void main(String[] args) throws Exception {
		FileWriter fw = null;
		String ls = System.getProperty("line.separator");
		try {
		fw = new FileWriter("../files/myfile.txt",true);
		for(int i=0;i<10;i++) {
			fw.write(String.format("%s回目の書き込み",i+1));
			fw.write(ls);
			fw.flush();
			Thread.sleep(1000);
			}
		} catch (Exception ex) {
		throw ex;
		} finally {
		if (fw != null)
		fw.close();
		}
		}
}
