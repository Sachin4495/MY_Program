package B_Array_Programs;

public class K_Print_Odd_Even_Number {

	public static void main(String[] args) {
int arr []= new int [] {5,4,6,7,8,3};

System.out.println("Odd no are : " );
for(int i=0; i<arr.length;i++) {
	if (arr[i]%2!=0) {
		System.out.print(arr[i]+ " ");
	}
}
System.out.println();
System.out.println("Even no are :");
for(int i=0; i<arr.length;i++) {
	if(arr[i]%2==0) {
		System.out.print(arr[i]+ " ");
	}
}
	}

}
