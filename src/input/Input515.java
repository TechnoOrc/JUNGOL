package input;

/*
 * 문제
 * 두 개의 정수를 입력 받아 곱과 몫을 출력하시오.
 * (먼저 입력 받는 수가 항상 크며 입력되는 두 정수는 1이상 500이하이다.)
 * 
 * 입력 예
 * 16 5
 * 
 * 출력 예
 * 16 * 5 = 80
 * 16 / 5 = 3
 */

import java.util.Scanner;

public class Input515 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int intVar1 = scan.nextInt();
		int intVar2 = scan.nextInt();
		scan.close();
		System.out.println(intVar1 + " * " + intVar2 + " = " + intVar1 * intVar2);
		System.out.print(intVar1 + " / " + intVar2 + " = " + intVar1 / intVar2);
		
	}

}