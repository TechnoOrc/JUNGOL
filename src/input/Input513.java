package input;

/*
 * 문제
 * 1야드(yd)는 91.44cm이고 1인치(in)는 2.54cm이다.

 * 2.1야드와 10.5인치를 각각 cm로 변환하여 다음 형식에 맞추어 소수 첫째자리까지 출력하시오.
 * 
 * 출력 예
 *  2.1yd = 192.0cm
 * 10.5in =  26.7cm​
 */

public class Input513 {

	public static void main(String[] args) {

		double yard = 91.44;
		double inch = 2.54;
		
		System.out.printf(" 2.1yd = " + "%.1f" + "cm", yard * 2.1);
		System.out.println(" ");
		System.out.printf("10.5in =  " + "%.1f" + "cm", inch * 10.5);
		
	}

}