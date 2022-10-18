package input;

/*
 * 문제
 * 키를 입력받아 출력하는 프로그램을 작성하라.
 * (입력할때 "height = " 문장을 먼저 출력하고 키를 입력 받아야 합니다.)
 * 
 * 입력 예
 * height = 170
 * 
 * 출력 예
 * Your height is 170cm.
 */

import java.util.Scanner;

public class Input514 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("height = ");
		int key = scan.nextInt();
		scan.close();
		System.out.print("Your height is " + key + "cm.");
		
	}

}