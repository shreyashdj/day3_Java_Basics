import java.util.Scanner;

public class Duplicate_Array_Elements {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array");
		int arraySize = sc.nextInt();
		int array[] = new int[arraySize];

		System.out.println("Enter array elements");		
		for (int i=0; i<arraySize; i++) {
			array[i] =sc.nextInt();
		}
		for(int i=0; i<arraySize-1; i++) {
			for(int j=i+1; j<arraySize; j++) {
			if(array[i] == array[j]){
					System.out.println("The Duplicate elements is " +array[j]);
				}
			} 
		}
		// TODO Auto-generated method stub
sc.close();
	}
}
