package output;

/*
 * 문제
 * 다음 출력 예와 같이 출력되는 프로그램을 작성하시오.
 * 합계는 수식을 이용하세요. 
 * 
 * 출력 예
 * kor 90
 * mat 80
 * eng 100
 * sum 270
 */

public class Output104 {

	public static void main(String [] args) {
		System.out.println("kor 90");
		System.out.println("mat 80");
		System.out.println("eng 100");
		System.out.printf("sum" + " " +"%d", 90 + 80 + 100);
		
	}//main
}//class