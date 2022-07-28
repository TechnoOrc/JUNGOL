package operator;

/*
 * 두 개의 정수를 입력받아서  첫 번째수는 후치 증가 연산자를 사용하고 두 번째 수는 전치 감소 연산자를 사용하여 두 수의 곱을 구한 후 각각의 값을 출력하는 프로그램을 작성하시오.
 * 
 *  입력 예
 *  10 20
 *  
 *  출력 예
 *  11 19 190
 */

import java.util.Scanner;

public class Operator521 {

public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		int inPut1 = scan.nextInt();
		int inPut2 = scan.nextInt();
		//int inPut3 = scan.nextInt();
		
		scan.close();
		
		int b = --inPut2 ;
		int result = inPut1++ * b;
		int a = inPut1;
		System.out.print(a + " ");
		System.out.print(b + " ");
		System.out.println(result);
				
		
	}//main
	
	

}//class