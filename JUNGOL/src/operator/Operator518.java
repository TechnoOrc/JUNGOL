package operator;

/*
 * 문제 
 * 세 개의 정수를 입력 받아서 합계와 평균을 출력하시오. (단 평균은 소수 이하를 버리고 정수부분만 출력한다.)
 * 
 * 입력 예
 * 10 25 33
 * 
 * 출력 예
 * sum : 68
 * avg : 22
 */

import java.util.Scanner;

public class Operator518 {

	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		int inPut1 = scan.nextInt();
		int inPut2 = scan.nextInt();
		int inPut3 = scan.nextInt();
		
		scan.close();
		
		
		System.out.println("sum : " + (inPut1 + inPut2 + inPut3));
		System.out.println("avg : " + (inPut1 + inPut2 + inPut3)/3);

				
		
	}//main
	
	

}//class