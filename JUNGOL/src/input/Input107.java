package input;

/*
 * 문
 * 실수형 변수를 2개 선언한 후 각각에 80.5 22.34를 대입한 후 두 수의 합을 구하여 각각의 숫자를 10칸씩 오른쪽에 맞추어 소수 둘째자리까지 출력하는 프로그램을 작성하시오.
 * 
 * hint - 공백을 넣을 경우 1칸을 차지한다.
 * 
 * 출력 예
 *      80.50     22.34    102.84
 */

public class Input107 {

	public static void main(String[] args) {
		
		double dVar1 = 80.5;
		double dVar2 = 22.34;
		
		System.out.printf("%5s%.2f %4s%.2f %3s%.2f", "",dVar1, "",dVar2, "",dVar1 + dVar2);
		
	}//main

}//class
