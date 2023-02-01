package B_Array_Programs;

public class C_Bubble_Sorting_In_Array {

	public static void main(String[] args) {

              // in Array bubble sorting is used to set array in Ascending or descending order
		
		int arr[]= {3,40,35,2,45,23};
		int n= arr.length;      // n is length of array 
		int temp=0;
		
		for (int i=0; i<n; i++) 
		{
			for(int j=1;j<(n-i); j++) 
			{
				
		       if(arr[j-1]>arr[j])      // for bubble sorting in if statement <-----for Descending order
		       {                                                     //       >----- for 	Ascending order
		    	 temp=arr[j-1];
		    	 arr[j-1]= arr[j];
		    	 arr[j] = temp;
		       }
			     		
			}
		}
       System.out.println("Array after Bubble sort");
       for (int i=0; i<n; i++) 
       {
    	   System.out.print(arr[i] + " ");
       }
	}

}
