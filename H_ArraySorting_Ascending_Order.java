package B_Array_Programs;

import java.util.Arrays;

public class H_ArraySorting_Ascending_Order {

	public static void main(String[] args) {

		int arr[] = new int[] { 6, 8, 4, 2, 5 };
		int temp = 0;                                   // this code to show only elements of original array
	                                                	//System.out.println("Elements of Original Array :");
	                                                     //	for ( int i = 0; i < arr.length; i++) {
		                                                 //	System.out.print(arr[i] + "");
	                                                      //	}
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[i] > arr[j]) 
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
    
	  System.out.println("Elements of sorted Array  in Ascending Array :"+ Arrays.toString(arr));
	  
	                                                               //	for (int i = 0; i < arr.length; i++) {
                                                                    //  System.out.print(arr[i] + " ");
	                                                                // Abhove both statment to print Array we can 
	                                                                // write Below  way as well
	                                                                  //   System.out.println(Arrays.toString(arr));

		}
	}

