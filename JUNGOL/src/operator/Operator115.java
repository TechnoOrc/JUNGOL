package operator;

import java.util.Scanner;

/*
 * 문제
 * 민수와 기영이의 키와 몸무게를 입력받아 민수가 키도 크고 몸무게도 크면 1 그렇지 않으면 0을 출력하는 프로그램을 작성하시오.
 * (JAVA는 1 이면 true, 0 이면 false를 출력한다.)
 * 
 * 입력 예
 * 150 35
 * 145 35
 * 
 * 출력 예
 * 0
 */

public class Operator115 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int iVar11, iVar12, iVar21, iVar22;
		
		iVar11 = sc.nextInt();
		iVar12 = sc.nextInt();
		iVar21 = sc.nextInt();
		iVar22 = sc.nextInt();
		
		sc.close();
		
		System.out.print((iVar11 > iVar21) && (iVar12 > iVar22) ? true : false);
		
		
	}//main

}//class
