package or.ExArrays;

import java.util.Arrays;

public class H_ArraySorting_Ascending_Order {
	
	
	public static void main(String[] args) {
		
		int ar[] = { 6, 8, 4, 2, 5 };
		int temp=0;
		for (int i=0;i<ar.length;i++) {
			
			for (int j=i+1;j<ar.length;j++) {
				if (ar[i]>ar[j]) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
				
			}
		}

		for (int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	  System.out.println("Elements "
	  		+ "of sorted Array  in Ascending "
	  		+ "Array :"+ Arrays.toString(ar));
	                                                              

		}
	}
