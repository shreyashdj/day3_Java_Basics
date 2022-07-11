import java.util.Scanner;

public class Array_Elements_on_Even_Position {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array");
		int arraySize = sc.nextInt();
		int array[] = new int[arraySize];
		
		System.out.println("Enter array elements");		
		for (int i=0; i<arraySize; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Elements present on even position are");
		for (int i=0; i<arraySize; i=i+2) {		
			System.out.print(array[i] +"  ");			
		}	
		
		// TODO Auto-generated method stub
sc.close();
	}
}
