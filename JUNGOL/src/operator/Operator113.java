package operator;

import java.util.Scanner;

/*
 * 문제
 * 직사각형의 가로와 세로의 길이를 정수형 값으로 입력받은 후 가로의 길이는 5 증가시키고 세로의 길이는 2배하여 저장한 후 가로의 길이 세로의 길이 넓이를 차례로 출력하는 프로그램을 작성하시오.
 *  
 *  입력 예
 *  20 15
 *  
 *  출력 예
 *  width = 25
 *  length = 30
 *  area = 750
 */

public class Operator113 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int iVar1 = 0;
		int iVar2 = 0;
		
		iVar1 = sc.nextInt();
		iVar2 = sc.nextInt();
		sc.close();
		
		System.out.println("width = " + (iVar1 + 5));
		System.out.println("length = " + iVar2 * 2);
		System.out.println("area = " + (iVar1 + 5) * (iVar2 * 2));
		
		
	}//main

}//class
