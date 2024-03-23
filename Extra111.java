package exam;
import java.io.BufferedReader;
import java.io.FileReader;
public class Extra111 {
	public static void main(String[] args) throws Exception {
		 FileReader reader = new FileReader("../files/data.dat");
		 BufferedReader br = new BufferedReader(reader);
		 StringBuilder sb = new StringBuilder();
		 String line;
		 while ((line = br.readLine()) != null) {
		 sb.append(line);
		 }
		 br.close();
		 System.out.println(sb);
		 }

}
