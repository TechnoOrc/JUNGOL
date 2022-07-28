package selection;

import java.util.Scanner;

/*
 * 문제 
 * 두 개의 정수를 입력받아 큰 수에서 작은 수를 뺀 차를 출력하는 프로그램을 작성하시오.
 * 
 * 입력 예
 * 50 85
 * 
 * 출력 예
 * 35
 */

public class Selection120 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int iVar1, iVar2;
		
		iVar1 = sc.nextInt();
		iVar2 = sc.nextInt();
		
		sc.close();
		int result = iVar1 - iVar2;
		
		if(result < 0)
		{
			result = result * -1;
		}
		System.out.println(result);
		
	}//main

}//class
