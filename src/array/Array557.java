package array;

import java.util.Scanner;

public class Array557 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String jungArr [] = new String[10];
		
		for (int i = 0; i < jungArr.length; i++) {
			jungArr[i] = scan.next();
		}
			scan.close();
		for (int i = 0;  i <= 7; i++) {
			if (i % 3 == 0) {
				System.out.print(jungArr[i] + " ");
			}
		}
	}//main

}//class