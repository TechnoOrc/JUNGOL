package selection;

import java.util.Scanner;

/*
 * 문제
 * 4.5 이하의 평점을 입력받아 그 값에 따라 다음과 같이 출력하는 프로그램을 작성하시오.
 * (C, C++, Java는 switch ~ case문 사용) (Python은 if ~ else사용)
 * 단 입력는 0이상 4.5 이하이다.
 * 4.0 이상 : "scholarship"
 * 3.0 이상 : "next semester"
 * 2.0 이상 : "seasonal semester"
 * 2.0 미만 : "retake"​
 * >> 실수를 정수형(int)으로 변환하여 분기한다. (예 - switch( (int)score ))
 * 
 * 입력 예
 * 3.5
 * 
 * 출력 예
 * next semester
 */

public class Selection535 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float fVar = sc.nextFloat();
		int iVar = (int) fVar;
		
		if (iVar >= 0 && iVar <= 4.5) {
			
			switch (iVar) {
			
			case 4 : System.out.println("scholarship"); break;
			case 3 : System.out.println("next semester");break;
			case 2 : System.out.println("seasonal semester");break;
			case 1 : System.out.println("retake");break;
			}//switch
			
		}//if
		
		
		
		
			
	}//main

}//class
