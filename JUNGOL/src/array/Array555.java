package array;

import java.util.Scanner;

public class Array555 {

	public static void main(String[] args) {

		String jungArr [] = new String [10];
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < jungArr.length; i++) {
			jungArr[i] = scan.next();
		}
		
		for (int i = 0; i < jungArr.length; i++) {
			System.out.print(jungArr[i]);
		}
	
	
	}//main

}//class