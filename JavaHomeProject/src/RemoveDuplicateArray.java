import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 12,12,9,8,4,4 */
		int size;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array you want");
		size = scan.nextInt();
		int array[] = new int[size];
		// Enter the Value in array

		System.out.println("Enter Your element");
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}

		// Print the array you have created
		System.out.println("Print the array you have created");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + ",");
		int j = 0;
		Arrays.sort(array);
		int temp[] = new int[size];
		
		System.out.println("array.length"+array.length);

		for (int i = 0; i < array.length - 1; i++) { // 12,12,13,13,14,15
			if (array[i] != array[i + 1]) {
				temp[j++] = array[i];
			}
		}
		   temp[j]=array[array.length-1];
		
		System.out.println();
		System.out.println("Print the new array you have created after removal of dulpicate");
		for (int i = 0; i< temp.length; i++) {
			System.out.print(temp[i] + ",");
		}
		scan.close();

	}

}
