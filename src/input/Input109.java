package input;

import java.util.Scanner;

/*
 * 문제
 * 세 개의 정수를 입력받아 합을 출력하는 프로그램을 작성하시오.
 * (자기주도 C언어 10판에 맞게 수정하였습니다.)
 * 
 * 입력 예
 * 20 50 100
 * 
 * 출력 예
 * sum = 170
 */

public class Input109 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int iVar1, iVar2, iVar3, sum;
		
		iVar1 = sc.nextInt();
		iVar2 = sc.nextInt();
		iVar3 = sc.nextInt();
		sum = iVar1 + iVar2 + iVar3;
		sc.close();
		System.out.println("sum = " + sum);
		
	}//main

}//class
