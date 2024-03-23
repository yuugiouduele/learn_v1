package exam;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MAP {
public void cons() {
	Map<Integer,String>map1=new ConcurrentHashMap<>();
	map1.put(1, "deku");
	map1.put(2, "deku");
	for(Integer keys:map1.keySet()) {
		map1.remove(keys);
	}
	
}
}
