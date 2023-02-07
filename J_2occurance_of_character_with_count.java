package or.ExArrays;

import java.util.Arrays;

public class J_2occurance_of_character_with_count {


	public static void main(String[] args) {
		String str= "Learn java learn pythan Learn C#";
		//String str= "Learn java 0 pythan 0 C#";
		String [] word =str.split(" ");

		int count;
		for(int i=0; i<word.length; i++){
		//i=0  //leran
	    //i=1  //java
		//i=0  //0	
			count=1; //learn-3  // java -1
			//0=2
			for(int j=i+1;j<word.length;j++){
				//j=0+1 //java-    1 st raound 
				//j=0+2 //learn
				//j=0+3 //pythan
				//j=0+4  //learn
				//j=0+5  //c#
				
				if(word[i].equalsIgnoreCase(word[j])){
					count=count+1;  //3
				     word[j]="0";
				}
			}
			if(word[i]!="0") {
				System.out.println(word[i]+"="+count);
			}
		}

	}
}



