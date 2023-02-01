package B_Array_Programs;

public class L_Print_Missing_Number {

	public static void main(String[] args) {

int arr []= new int [] {1,2,4,5};
int sum=0;
int n=arr.length;
System.out.println("length of the array is : "+ n);
int totalSum= (n+1)*(n+2)/2;
System.out.println("Sum of all number is "+ totalSum);
for (int i=0; i<n; i++) {
	sum=sum+arr[i];
}
int missingNumber= totalSum-sum;
System.out.println("Missing Number is :"+ missingNumber);
	}

}
