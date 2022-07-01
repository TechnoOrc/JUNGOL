package operator;

/*
 *	문제
 *	정수 2개를 입력받아서 첫 번째 수에는 100을 증가시켜 저장하고 두 번째 수는 10으로 나눈 나머지를 저장한 후 두 수를 차례로 출력하는 프로그램을 작성하시오.
 *
 *	입력 예
 *	20 35
 *	
 *	출력 예
 *	120 5
 */

import java.util.Scanner;

public class Operator519 {

	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		int inPut1 = scan.nextInt();
		int inPut2 = scan.nextInt();
		//int inPut3 = scan.nextInt();
		
		
		scan.close();
		System.out.print(inPut1 + 100 + " ");
		System.out.print(inPut2 % 10);
				
		
	}//main
	
	

}//clas