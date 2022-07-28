package output;

/*
 * 문제
 * 다음과 같이 출력되는 프로그램을 작성하라.
 * (각 요소들은 10칸씩 공간을 확보하여 오른쪽으로 정렬하여 출력한다.)
 * 
 * 출력 예
 *       item     count     price
 *        pen        20       100
 *       note         5        95
 *     eraser       110        97
 */

public class Output508 {

	public static void main(String [] args) {
		System.out.printf("%10s %9s %9s","item","count","price");
		System.out.println("");
		System.out.printf("%10s %9d %9d","pen",20,100);
		System.out.println("");
		System.out.printf("%10s %9d %9d","note",5,95);
		System.out.println("");
		System.out.printf("%10s %9d %9d","eraser",110,97);
	}//main
}//class