package B_Array_Programs;

public class F_Print_LargestElement_Only {

	public static void main(String[] args) {
int arr []= {84,25,33,405,51};
int max= arr[0];
for (int i=0; i<arr.length; i++) {
	if (arr[i]>max) {
		max= arr[i];
	}
}
System.out.println("Largest element in Array :" +max);
	}

}
