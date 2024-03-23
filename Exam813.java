package exam;

import java.util.ArrayList;

public class Exam813 {
	public static void main(String[] args) throws Exception {
		 String[] inputdata = { "-5","1.8", "aaaa","15", "2009","1.567","0003"};
		 ArrayList<String> normaldata = new ArrayList<String>();
		 for(String inpt : inputdata){
		 if( canParseInt(inpt) ){
		 normaldata.add(inpt);
		 }
		 }
		 System.out.println(normaldata);
		}
		private static boolean canParseInt(String s){
		 boolean bool=true;
		try{
			int result=Integer.parseInt(s);
			if(result>0) {
				bool=true;
			}else {
				bool=false;
			}
		}catch(Exception ex) {
			bool=false;
		}
	
		 
		 
		 boolean canParseInt=bool;
		 return canParseInt;
		}

}
