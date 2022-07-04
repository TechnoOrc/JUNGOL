package selection;

import java.util.Scanner;

/*
 * 문제
 * 영문 대문자를 입력받아
 * 'A'이면 “Excellent”,
 * 'B'이면 “Good”,
 * 'C'이면 “Usually”,
 * 'D'이면 “Effort”,
 * 'F'이면 “Failure”,그 외 문자이면 “error” 라고 출력하는 프로그램을 작성하시오.
 * 
 * 입력 예
 * B
 * 
 * 출력 예
 * Good
 */

public class Selection534 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char cVar;
		
		cVar = sc.next().charAt(0);
		sc.close();
		
		if(cVar == 'A') {
			System.out.println("Excellent");
		} else if(cVar == 'B') {
			System.out.println("Good");
		} else if (cVar == 'C') {
			System.out.println("Usually");
		} else if (cVar == 'D') {
			System.out.println("Effort");
		} else if (cVar == 'F') {
			System.out.println("Failure");
		} else {
			System.out.println("error");
		}//if
		
	}//main

}//class
