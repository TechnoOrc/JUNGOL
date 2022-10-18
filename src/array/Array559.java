package array;

import java.util.Scanner;

public class Array559 {

	public static void main(String[] args) {
		
		double jungArr[] = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		Scanner scan = new Scanner(System.in);
		
		int inPut1, inPut2;
		inPut1 = scan.nextInt();
		inPut2 = scan.nextInt();
			scan.close();
		double avgVar = jungArr[inPut1 - 1] + jungArr[inPut2 - 1];
		System.out.printf("%.1f", avgVar);

		
	}//main

}//class