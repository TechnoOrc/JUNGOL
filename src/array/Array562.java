package array;

import java.util.Scanner;

public class Array562 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int iArr [] = new int [10];
		int sum1 = 0;
		int sum2 = 0;
		int count = 0;
		
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = scan.nextInt();
			if ( i % 2 == 1) {
				sum1 = sum1 + iArr[i];
			} else {
				sum2 = sum2 + iArr[i];
				count++;
			}//if
		}//for
		double avg = (double) sum2 / count;
		System.out.println("sum : " + sum1);
		System.out.printf("avg : " + "%.1f", avg);
		scan.close();
	}//main

}//class
