package or.ExArrays;

import java.util.HashMap;

public class Ex1 {
	public static void main(String[] args) {
		String str = "d e e p";

		HashMap  <Character,Integer> mp = new HashMap<>();
		char [] cha=str.toCharArray();
		
		for (char ch :cha) {
			
			if (!mp.containsKey(ch)) {
				mp.put(ch, 1);
				
			}else{
				int val=mp.get(ch);
				mp.put(ch, val+1);
				
			}			
			
		}
         mp.remove(' ', 3); // it doesnot count the spaces 
		System.out.println(mp);
		
	}
}



