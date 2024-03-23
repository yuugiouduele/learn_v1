package exam;

import java.util.ArrayList;
import java.util.HashMap;

import orbeq.data.MySqlClient;

public class TryMember {
	public static void main(String[] args) throws Exception {
		MySqlClient client = null;
		try {
		// MYSQLに接続
		client = new MySqlClient();
		client.open("localhost", 3306, "learn", "mysqluser", "mysqluser");
		// SELECT文実行
		ArrayList<HashMap<String, Object>> result = client.select("select * from member");
		// データ取得
		for (HashMap<String, Object> record : result) {
		String sei = (String) record.get("sei");
		String mei = (String) record.get("mei");
		System.out.println(String.format("%s %s", sei, mei));
		}
		} catch (Exception ex) {
		throw ex;
		} finally {
			client.close();
		}
		}
}
