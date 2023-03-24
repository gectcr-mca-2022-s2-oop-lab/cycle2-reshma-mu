
import java.util.Scanner;

public class StringManipulation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two strings");
		System.out.print("\ns1: ");
		String s1 = sc.next();
		System.out.print("\ns2: ");
		String s2 = sc.next();
		String s1U, s1L, s1s2Concat;
		s1U = s1.toUpperCase();
		s1L = s1.toLowerCase();
		s1s2Concat = s1.concat(s2);
		int s1s2Comp = s1.compareTo(s2);
		int s1Len = s1.length();
		int s2Len = s2.length();
		System.out.println("First String converted to Uppercase using s1.toUpperCase() is :  " + s1U);
		System.out.println("First String converted to Lowercase using s1.toLowerCase() is :  " + s1L);
		System.out.println("Two strings are concatenated as s1.concat(s2)  :  " + s1s2Concat);
		System.out.println("First String is compared with second sring using s1.compareTo(s2)   : " + s1s2Comp);
		System.out.println("Length of first and second strings using length() are : " + s1Len + " and " + s2Len);

	}

}

