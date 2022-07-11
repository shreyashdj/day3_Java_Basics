import java.util.Arrays;
import java.util.Scanner;

public class Array_Elements_in_Ascending_order {

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
		
		System.out.println("Elements of array in asscending oder are ");
		System.out.println(Arrays.toString(array));
		
		// TODO Auto-generated method stub
sc.close();
	}

}