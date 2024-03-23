package exam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class Quest58 {
	public static void main(String[] args) throws Exception {
		BufferedWriter bw = null;
		
		try {
			
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
				"../files/GOOL.txt"), "UTF-8");
		bw = new BufferedWriter(osw);
		for(int i=0;i<3;i++) {
			String[] b=new String[5];
		b[0]=(String) loadPersonCsvData().get(i).get("sei");
		b[1]=(String) loadPersonCsvData().get(i).get("mei");
		b[2]=(String) loadPersonCsvData().get(i).get("birth");
		b[3]=(String) loadPersonCsvData().get(i).get("gender");
		b[4]=(String) loadPersonCsvData().get(i).get("blood");
		
		if (b[3] .equals("F")) {
			b[3]="女性";
		}
		if (b[3] .equals("M")) {
			b[3]="男性";
		}
		
		if (b[4] .equals("0")) {
			b[4]="A型";
		}
		if (b[4] .equals("1")) {
			b[4]="B型";
		}
		if (b[4] .equals("2")) {
			b[4]="AB型";
		}
		if (b[4] .equals("3")) {
			b[4]="O型";
		}
		bw.write(i+1+"\t"+b[0]+"\t"+b[1]+"\t"+b[2]+"\t"+b[3]+"\t"+b[4]);
		}
		} catch (Exception ex) {
		throw ex;
		} finally {
		if (bw != null)
		bw.close();
		}
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
