package operator;

import java.util.Scanner;

/*
 * 문제 
 * 3개의 정수를 입력 받아 첫 번째 수가 가장 크면 1 아니면 0을 출력하고 세 개의 수가 모두 같으면 1 아니면 0을 출력하는 프로그램을 작성하시오.
 * (JAVA는 1이면 true, 0이면 false를 출력한다.)
 * 
 * 입력 예
 * 10 9 9
 * 
 * 출력 예
 * 1 0
 */

public class Operator525 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int iVar1 = 0;
		int iVar2 = 0;
		int iVar3 = 0;
		
		iVar1 = sc.nextInt();
		iVar2 = sc.nextInt();
		iVar3 = sc.nextInt();
		
		System.out.print(iVar1 > iVar2 && iVar1 > iVar3 ? true : false);
		System.out.print(" ");
		System.out.print(iVar1 == iVar2 && iVar1 == iVar3 ? true : false);
		
	}//main

}//class
