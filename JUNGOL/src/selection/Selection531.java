package selection;

import java.util.Scanner;

/*
 * 문제 
 * 복싱체급은 몸무게가 
 * 50.80kg 이하를 Flyweight,
 * 61.23kg 이하를 Lightweight,
 * 72.57kg 이하를 Middleweight,
 * 88.45kg 이하를 Cruiserweight,
 * 88.45kg 초과를 Heavyweight 라고 하자.
 * 몸무게를 입력받아 체급을 출력하는 프로그램을 작성하시오. 
 * 
 * 입력 예
 * 87.3
 * 
 * 출력 예
 * Cruiserweight
 */

public class Selection531 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double dVar = 0;
		
		dVar = sc.nextFloat();
		sc.close();
		
		if(dVar <= 50.80) {
			System.out.println("Flyweight");
		} else if(dVar <= 61.23) {
			System.out.println("Lightweight");
		}else if(dVar <= 72.57) {
			System.out.println("Middleweight");
		}else if(dVar <= 88.45) {
			System.out.println("Cruiserweight");
		}else {
			System.out.println("Heavyweight");
		}//if
		
		
	}//main

}//class
