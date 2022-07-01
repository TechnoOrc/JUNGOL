package operator;

/*
 * 두 개의 정수를 입력받아서,
 * 첫 번째 줄에는 두 정수의 값이 같으면 1 아니면 0을 출력하고,
 * 두 번째 줄에는 같지 않으면 1 같으면 0을 출력하는 프로그램을 작성하시오.
 * (JAVA는 1이면 true, 0이면 false를 출력한다.)
 * 
 *  입력 예
 *  5 5
 *  
 *  출력 예
 *  1
 *  0
 */


import java.util.Scanner;

public class Operator522 {

	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		int inPut1 = scan.nextInt();
		int inPut2 = scan.nextInt();
		System.out.println(inPut1==inPut2? 1 : 0);
		System.out.println(inPut1==inPut2? 0 : 1);
		
		scan.close();
				
		
	}//main
	
	

}//class