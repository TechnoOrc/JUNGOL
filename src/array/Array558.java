package array;

import java.util.Scanner;

public class Array558 {

public static void main(String[] args) {
		
		int jungArr[] = new int [100];
		int stopCnt = 0;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < jungArr.length ; i++) {
			jungArr[i] = scan.nextInt();
			if (jungArr[i] == 0) {
				stopCnt = i;
				break; 
			}
		}
			scan.close();
		for (int i = stopCnt-1 ; i >= 0; i--) {
			System.out.print(jungArr[i] + " ");
		}
		
	}//main

}//class