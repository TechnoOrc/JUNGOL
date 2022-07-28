package selection;

import java.util.Scanner;

/*
 * 문제
 * 1~12사이의 정수를 입력받아 평년의 경우 입력받은 월을 입력받아 평년의 경우 해당 월의 날수를 출력하는 프로그램을 작성하시오.
 * 
 * 힌트
 * 평년의 경우 1월부터 12월까지 일수는 각각 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31일이다.
 * 
 * 입력 예
 * 2
 * 
 * 출력 예
 * 28
 */

public class Selection124 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int mon = 0;
		
		mon = sc.nextInt();
		sc.close();
		
		if (0 < mon && mon <= 7) {
			if(mon % 2 == 0) {
				if(mon == 2) {
					System.out.println("28");
				} else System.out.println("30");
			} else System.out.println("31");
		} else if(0 < mon && mon <= 12) {
			if(mon % 2 == 0) {
				System.out.println("31");
			} else System.out.println("30");
		} else System.out.println("1~12까지만 입력하세요 ");
		
	}//main

}//class
