package input;

/*
 * 문제
 * 세 개의 실수를 입력 받아 반올림하여 소수 셋째 자리까지 출력하는 프로그램을 작성하시오.
 * 
 * 입력 예
 * 1.2568
 * 95.21438
 * 526.851364
 * 
 * 출력 예
 * 1.257
 * 95.214
 * 526.851
 */

import java.util.Scanner;

public class Input517 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double dVar1 = 0;
		double dVar2 = 0;
		double dVar3 = 0;
		
		dVar1 = scan.nextDouble();
		dVar2 = scan.nextDouble();
		dVar3 = scan.nextDouble();
		
		System.out.printf("%.3f\n",dVar1);
		System.out.printf("%.3f\n",dVar2);
		System.out.printf("%.3f\n",dVar3);
		
	}//main

}//class
