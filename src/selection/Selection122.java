package selection;

import java.util.Scanner;

/*
 * 문제
 * 년도를 입력받아 윤년(leap year)인지 평년(common year)인지 판단하는 프로그램을 작성하시오.
 * 
 * 입력 예
 * 2008
 * 
 * 출력 예
 * leap year
 */

public class Selection122 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int iYear = 0;
		
		iYear = sc.nextInt();
		sc.close();
		
		if(iYear % 400 == 0 || (iYear % 4 == 0 && iYear % 100 != 0)) {
			System.out.println("leap year");
		} else System.out.println("common year");
		
	}//main

}//class
