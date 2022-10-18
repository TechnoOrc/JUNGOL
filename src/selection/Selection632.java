package selection;

import java.util.Scanner;

/*
 * 문제
 * 3개의 정수를 입력받아 조건연산자를 이용하여 입력받은 수들 중 최소값을 출력하는 프로그램을 작성하시오.
 * 
 * 입력 예
 * 18 -5 10
 * 
 * 출력 예
 * -5
 */

public class Selection632 {

	public static void main(String[] args) {

		int iVar1, iVar2, iVar3;
		int min;
		
		Scanner sc = new Scanner(System.in);
		iVar1 = sc.nextInt();
		iVar2 = sc.nextInt();
		iVar3 = sc.nextInt();
		sc.close();
		
		
		int tmp = (iVar1 > iVar2 ? iVar2 : iVar1);
		min = tmp > iVar3 ? iVar3 : tmp;
		System.out.println(min);
		
	}//main

}//class
