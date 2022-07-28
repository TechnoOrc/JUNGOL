package operator;

import java.util.Scanner;

/*
 * 문제  두 정수를 입력받아서 나눈 몫과 나머지를 다음과 같은 형식으로 출력하는 프로그램을 작성하시오.
 *
 * 입력 예
 * 35 10
 * 
 * 출력 예
 * 35 / 10 = 3...5
 */

public class Operator112 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int iVar1  = 0;
		int iVar2  = 0;
		iVar1 = sc.nextInt();
		iVar2 = sc.nextInt();
				
		sc.close();
		
		System.out.println(iVar1 + " / " + iVar2 + " = " + (iVar1 / iVar2) + "..." +  (iVar1 % iVar2));
	}//main

}//class
