package selection;

import java.util.Scanner;

/*
 * 문제
 * 정수를 입력받아 첫 줄에 입력 받은 숫자를 출력하고 둘째 줄에 음수이면 “minus” 라고 출력하는 프로그램을 작성하시오.
 *  
 *  입력 예
 *  -5
 *   5
 *  출력 예
 *  -5
 *  minus
 *  5
 */

public class Selection528 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int iVar1 = 0;
		
		iVar1 = sc.nextInt();
		
		sc.close();
		
		if(iVar1 > 0) {
			System.out.println(iVar1);
		} else {
			System.out.println(iVar1);
			System.out.print("minus");
			
		}//if
		
	}//main

}//class
