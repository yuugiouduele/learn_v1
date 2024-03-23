package exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Extra1120{
	public static void main(String[] args) throws Exception {
		ArrayList<HashMap<String, String>> data = new ArrayList<HashMap<String, String>>();
		BufferedReader br = null;
		try {
		br = new BufferedReader(new FileReader("../files/data.dat"));
		String line;
		while ((line = br.readLine()) != null) {
		String[] dtOfLine = line.split(",");
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("ID", dtOfLine[0]);
		map.put("NAME", dtOfLine[1]);
		data.add(map);
		}
		} catch (Exception ex) {
		throw ex;
		} finally {
		if (br != null)
		br.close();
		}
		System.out.println(data);
		}
}