package B_Array_Programs;

import java.util.Arrays;

public class J_Array_SecondLargest_Element {

	public static void main(String[] args) {

		int arr []= new int [] {1,3,5,7,9,11};
		 int temp=0;
		 
		 for(int i=0; i<arr.length;i++) 
		 {
			 for(int j=i+1; j<arr.length; j++)
			 {
				if( arr[i]> arr[j]) 
				{
					temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			 }
		 }
		
		System.out.println("Ascending Order" + Arrays.toString(arr));
		
		System.out.println();
		System.out.println("Second highest no :" +arr[arr.length-2]);
	}

}
