import java.util.Scanner;

public class Smallest_Element_in_Array {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array");
		int arraySize = sc.nextInt();
		int array[] = new int[arraySize];
		
		System.out.println("Enter elements for array");
		for (int i = 0; i < arraySize; i++) {
			array[i] = sc.nextInt();
		}
		
		int min = array[0];
		for (int i = 0; i < arraySize; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("Smallest Element is " + min);
		
		// TODO Auto-generated method stub
sc.close();
	}

}
