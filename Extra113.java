package exam;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Extra113 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = null;
		try {
			InputStreamReader isr = new InputStreamReader(new FileInputStream(
					"../files/practice.dat"), "UTF-8");
			br = new BufferedReader(isr);
			String line;
			while ((line = br.readLine()) != null) {
				String[]line2=line.split(",");
				HashMap<String, Object> list = new HashMap<String, Object>();
				HashMap<String, Object> data = new HashMap<String, Object>();
				data.put("NAME",line2[1] );
				data.put("MEMBERS",line2[2] );
				data.put("MASTER", line2[3]);
				
				list.put(line2[0],data);
				System.out.println(list);
			}
		} catch (Exception ex) {
			throw ex;
		} finally {
			if (br != null)
				br.close();
		}
	}
}
