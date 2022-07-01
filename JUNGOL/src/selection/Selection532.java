package selection;

import java.util.Scanner;

/*
 * 문제
 * 두 개의 실수를 입력받아 모두 4.0 이상이면 "A", 모두 3.0 이상이면 "B", 아니면 "C" 라고 출력하는 프로그램을 작성하시오.
 * 
 * 입력 예
 * 4.3 3.5
 * 4.0 2.9
 * 출력 예
 * B
 * C
 */

public class Selection532 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double dVar1 = 0;
		double dVar2 = 0;
		
		dVar1 = sc.nextFloat();
		dVar2 = sc.nextFloat();
		sc.close();
		if (dVar1 >= 4.0 && dVar2 >= 4.0) {
			System.out.println("A");
		} else if (dVar1 >= 3.0 && dVar2 >= 3.0) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}//if
		
	}//main

}//class
