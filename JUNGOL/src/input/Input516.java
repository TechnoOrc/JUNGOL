package input;

/*
 * 문제
 * 실수 2개와 한 개의 문자를 입력 받아 출력하되 실수는 반올림하여 소수 둘째자리까지 출력하는 프로그램을작성하시오.
 * (C, C++, Java 의 경우 실수는 "double"로 선언하세요.)
 * 
 * 입력 예
 * 12.2536
 * 526.129535
 * A
 * 
 * 출력 예
 * 12.2536
 * 526.129535
 * A
 */

import java.util.Scanner;

public class Input516 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double dVar1 = 0;
		double dVar2 = 0;
		String cVar;
		dVar1 = scan.nextDouble();
		dVar2 = scan.nextDouble();
		cVar = scan.next();
		System.out.printf("%.2f\n",dVar1);
		System.out.printf("%.2f\n",dVar2);
		System.out.println(cVar);
		
		
	}//main

}//class
