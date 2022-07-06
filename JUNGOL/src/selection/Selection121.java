package selection;

import java.util.Scanner;

/*
 * 문제
 * 정수를 입력받아 0 이면 "zero" 양수이면 "plus" 음수이면 "minus" 라고 출력하는 프로그램을 작성하시오.
 * 
 * 입력 예
 * 0
 * 
 * 출력 예
 * zero
 */
public class Selection121 {

	public static void main(String[] args) {

		int iVar = 0;
		Scanner sc = new Scanner(System.in);
		
		iVar = sc.nextInt();
		if(iVar > 0 ) {
			System.out.println("plus");
		} else if(iVar < 0 ) {
			System.out.println("minus");
		} else System.out.println("zero");
		
		
	}//main

}//class
