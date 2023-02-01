package B_Array_Programs;

public class D_CopyingArray_One_To_Another {

	public static void main(String[] args) {
// initialising Array 
	int arr1 []= new int [] {1,2,3};
// creating new Array 
	int arr2 []= new int [arr1.length];
	// copying elemnts from Aeeay1 to Array2
	for (int i= 0; i<arr1.length; i++) {
		
		arr2[i]= arr1[i];
		
	}
	System.out.println(" Display elemnts of second Array");
	
	for (int i =0; i<arr2.length; i++) {
		
		System.out.print (arr2[i]+ " ");
	}
		
		
		
		
		
		
	}

}
