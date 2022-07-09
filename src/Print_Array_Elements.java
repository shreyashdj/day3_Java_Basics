import java.util.Scanner;

public class Print_Array_Elements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size of Array");
		int arraySize = sc.nextInt();		
		int array[] = new int [arraySize];
		
		System.out.println("Enter elements for array");
		for (int i = 0; i < arraySize; i++) {
			array[i] = sc.nextInt();
		}		
		System.out.println("Elements of Array are");		
		for (int i = 0; i < arraySize; i++) {
			System.out.print(array[i] + "  ");
		}
		// TODO Auto-generated method stub
sc.close();
	}
}
