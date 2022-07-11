import java.util.Arrays;
import java.util.Scanner;

public class Second_Largest_Number_in_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array");
		int arraySize = sc.nextInt();
		int array[] = new int[arraySize];
		
		System.out.println("Enter elements for array");
		for (int i = 0; i < arraySize; i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);	
		System.out.println("Second Largest element is "+array[arraySize-2]);
		
		// TODO Auto-generated method stub
sc.close();
	}

}
