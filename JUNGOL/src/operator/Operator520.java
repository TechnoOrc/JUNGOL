package operator;

/*
 * 문제 한 개의 정수를 입력 받아서 후치증가 연산자를 사용하여 출력한 후 전치 증가 연산자를 사용하여 출력하는프로그램을 작성하시오.
 * 
 * 입력 예 
 * 5
 * 
 * 출력 예
 * 5
 * 7
 */

import java.util.Scanner;

public class Operator520 {

	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		int inPut1 = scan.nextInt();
		//int inPut2 = scan.nextInt();
		//int inPut3 = scan.nextInt();
		int a = inPut1++ ;
		int b = ++inPut1 ;
		
		scan.close();
		
		System.out.println(a);
		System.out.print(b);
				
		
	}//main
	
	

}//class