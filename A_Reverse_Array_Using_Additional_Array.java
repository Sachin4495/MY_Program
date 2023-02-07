package or.ExArrays;

import java.util.Arrays;

public class A_Reverse_Array_Using_Additional_Array {

	public static void main(String[] args) {
		
		int a []= {1,2,3,4,5,6,7,8,9,10};
	
	
		String b= Arrays.toString(a);
//		System.out.println(b);
//		System.out.println(b.length());
//		
	
		int start=0;
		int end=a.length-1;
		int middle= a.length/2;

		
		for ( int temp=0;  start<middle; start++, end--) {
			temp=a[start];
			System.out.println(temp);
			a[start]=a[end];
			a[end]= temp;
			System.out.println("****");
		}
        System.out.println(Arrays.toString(a));
   

	}

}
