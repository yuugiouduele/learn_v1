package exam;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Quest56 {
	public static void main(String[] args) throws Exception {
		int[] a=new int[2];
		for (int i = 0; i < loadPersonCsvData().size(); i++) {
			String b = (String) loadPersonCsvData().get(i).get("gender");
			if (b .equals("F")) {
				a[0]+=1;
			}
			if (b .equals("M")) {
				a[1]+=1;
			}
			
		}
		System.out.println("女性は"+a[0]+"\n男性は"+a[1]);
	}

	private static ArrayList<HashMap<String, Object>> loadPersonCsvData() throws Exception {
		BufferedReader br = null;
		try {
			InputStreamReader isr = new InputStreamReader(new FileInputStream(
					"../files/csvmondai.csv"), "Shift_JIS");
			br = new BufferedReader(isr);
			String line;
			ArrayList<HashMap<String, Object>> csv = new ArrayList<HashMap<String, Object>>();
			while ((line = br.readLine()) != null) {

				HashMap<String, Object> g = new HashMap<String, Object>();
				String[] a = line.split(",");
				g.put("sei", a[0]);
				g.put("mei", a[1]);
				g.put("birth", a[2]);
				g.put("gender", a[3]);
				g.put("blood", a[4]);
				csv.add(g);

			}
			return csv;
		} catch (Exception ex) {
			throw ex;
		} finally {
			if (br != null)
				br.close();
		}

	}
}
