package operator;

import java.util.Scanner;

/*
 * 문제
 * 국어 영어 수학 컴퓨터 과목의 점수를 정수로 입력받아서 총점과 평균을 구하는 프로그램을 작성하시오. (단 평균의 소수점 이하는 버림 한다.)
 * 
 * 입력 예
 * 70 95 63 100
 * 
 * 출력 예
 * sum 328
 * avg 82
 */

public class Operator111 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int iVar1 = 0;
		int iVar2 = 0;
		int iVar3 = 0;
		int iVar4 = 0;
		int sum = 0;
		int avg = 0;
		
		iVar1 = sc.nextInt();
		iVar2 = sc.nextInt();
		iVar3 = sc.nextInt();
		iVar4 = sc.nextInt();
		
		sum = iVar1 + iVar2 + iVar3 + iVar4;
		avg = sum / 4;
		
		System.out.println("sum " + sum);
		System.out.println("avg " + avg);
		
	}//main

}//class
