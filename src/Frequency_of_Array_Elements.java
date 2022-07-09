import java.util.Scanner;

public class Frequency_of_Array_Elements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size of Array");
		int arraySize = sc.nextInt();
		
		int array[] = new int [arraySize];
		int frequency[] = new int [arraySize];
		
		System.out.println("Enter elements for array");
		for (int i = 0; i < arraySize; i++) {
			array[i] = sc.nextInt();
		}
		
		int visited = -1;
		for (int i = 0; i < arraySize-1; i++) {
			int count = 1;
			for (int j = i + 1; j < arraySize; j++) {
				if (array[i] == array[j]) {
					count++;
					frequency[j] = visited;
				}
			}
			if (frequency[i] != visited)
				frequency[i] = count;
		}
		for (int i = 0; i < arraySize; i++) {
			if (frequency[i] != visited)
				System.out.println("Frequency of element  " + array[i] + "  is  " + frequency[i]);
		}
		// TODO Auto-generated method stub
sc.close();
	}
}
