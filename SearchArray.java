
import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of your array");
		Scanner sc = new Scanner(System.in);
		int siz = sc.nextInt();
		int arr[] = new int[siz];
		System.out.println("Enter " + siz + " Elements to the array");
		int i;
		for (i = 0; i < siz; i++) {
			arr[i] = sc.nextInt();
		}

		while (1 == 1) {
			System.out.println("Enter 1.to search   or   enter any other value to exit");
			int ch = sc.nextInt();
			if (ch != 1) {
				break;
			}
			System.out.println("Enter an element to search");
			int key = sc.nextInt();
			int flag = 0;
			for (i = 0; i < siz; i++) {
				if (key == arr[i]) {
					flag = 1;
					System.out.println("Element found at index " + i);
					break;
				}

			}
			if (flag == 0) {
				System.out.println("Element not found ");
			}

		}
	}

}

