package exam;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Extra112 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = null;
		try {
		InputStreamReader isr = new InputStreamReader(new FileInputStream(
		"../files/data.dat"), "UTF-8");
		br = new BufferedReader(isr);
		String line;
		while ((line = br.readLine()) != null) {
		System.out.println(line);
		}
		} catch (Exception ex) {
		throw ex;
		} finally {
		if (br != null)
		br.close();
		}
		}
}
