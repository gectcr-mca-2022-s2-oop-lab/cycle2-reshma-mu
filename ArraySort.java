
import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of your string array : ");
		int n = sc.nextInt();
		String[] stArray = new String[n];
		int i, k;
		System.out.println("Enter " + n + " Strings to String Array");
		for (i = 0; i < n; i++) {
			stArray[i] = sc.next();
		}
		System.out.print("Array is : \n{ ");
		for (i = 0; i < n; i++) {
			System.out.print(stArray[i]);
			if (i != n - 1) {
				System.out.print(", ");
			}

		}
		System.out.print(" }");
		// bubble sort
		String temp;
		for (i = 0; i < n - 1; i++) {
			for (k = 0; k < (n - 1 - i); k++) {
				if (stArray[k].compareTo(stArray[k + 1]) > 0) {
					temp = stArray[k];
					stArray[k] = stArray[k + 1];
					stArray[k + 1] = temp;
				}
			}
		}
		System.out.print("\nSorted Array is : \n{ ");
		for (i = 0; i < n; i++) {
			System.out.print(stArray[i]);
			if (i != n - 1) {
				System.out.print(", ");
			}

		}
		System.out.print(" }\n");

	}

}

