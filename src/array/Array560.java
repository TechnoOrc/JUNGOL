package array;

import java.util.Scanner;

public class Array560 {

	public static void main(String[] args) {
		
		int jungArr [] = new int [10];
		int min = 1000;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < jungArr.length; i++) {
			jungArr [i] = scan.nextInt();
			
		}//for
		
		for (int i = 0; i < jungArr.length; i++) {
			if (jungArr [i] < min) {
				min = jungArr[i];
			} else if (jungArr [i] > min) continue;
		}		
			scan.close();
		System.out.print(min);
	}//main

}//class