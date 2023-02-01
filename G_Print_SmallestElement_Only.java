package B_Array_Programs;

public class G_Print_SmallestElement_Only {

	public static void main(String[] args) {
int arr []= new int [] {84,25,33,405,51};
int min=arr[0];
for (int i=0; i<arr.length; i++) {
	if (arr[i]<min) {
		min= arr[i];
	}
}
	System.out.println("Smallest element in Array : "+ min);
	

	}

}
