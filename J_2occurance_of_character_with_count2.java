package or.ExArrays;

import java.util.Arrays;
import java.util.HashMap;

public class J_2occurance_of_character_with_count2 {


	public static void main(String[] args) {
		String str= "Learn java learn pythan Learn C#";
		//String str= "Learn java 0 pythan 0 C#";
		String [] word =str.split(" ");
	
		HashMap <String ,Integer> mp =new HashMap<String, Integer >();
		int count =1;
		for (String wd :word) {
			 wd =wd.toLowerCase();

	      if (!mp.containsKey(wd)) {
	    	mp.put(wd, 1);
	      }else {
	    	  int valu=mp.get(wd);
	    	  mp.put(wd, valu+1);
	      
	      }
	    	  
			}
	      
		System.out.println(mp);

	}
}



