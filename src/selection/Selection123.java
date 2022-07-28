package selection;

import java.util.Scanner;

/*
 * 문제
 *1번은 개, 2번은 고양이, 3번은 병아리로 정하고 번호를 입력하면 번호에 해당하는 동물을 영어로 출력하는 프로그램을 작성하시오.
 *해당 번호가 없으면 "I don't know."라고 출력한다.
 *개-dog
 *고양이-cat
 *병아리-chick
 *​
 * 입력 예
 * Number? 2
 * 
 * 출력 예
 * cat
 * 
 */

public class Selection123 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		int iAni = 0;
		
		System.out.print("Number? ");
		iAni = sc.nextInt();
		sc.close();
		
		if (iAni == 1) {
			System.out.println("dog");
		} else if ( iAni == 2) {
			System.out.println("cat");
		} else if ( iAni == 3) {
			System.out.println("chick");
		} else System.out.println("I don't know.");
		
	}//main

}//class
