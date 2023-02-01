package B_Array_Programs;

import java.util.Arrays;

public class B_Reverse_Array_Without_Using_Additional_Array {

	public static void main(String[] args) {
		int a []= { 1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(a));
		int start=0;
		int end=a.length-1;
		int middle= a.length/2;
		int temp=0;
		for (  ; start<middle; start++, end--) {
			temp=a[start];
			a[start]=a[end];
			a[end]= temp;
		}
		
		System.out.println(Arrays.toString(a));
		

	}

}
