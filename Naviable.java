package exam;


import java.util.NavigableMap;
import java.util.TreeMap;

public class Naviable {
public  void MaP() {	
	
NavigableMap<String,String>map=new TreeMap<String,String>();
map.put("1","s");
map.put("2","sa");
map.put("3","ss");
map.put("4","sd");

String keys=new String("20");

if(map.containsKey(keys)) {
	System.out.println(map.get(keys));
}else {
	System.out.println(map.higherKey(keys));
	System.out.println(map.lowerKey(keys));
}
NavigableMap<String,String>sub=map.subMap(keys, false, keys, false);
System.out.println(sub);
}
}
