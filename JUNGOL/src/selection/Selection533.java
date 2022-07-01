package selection;

import java.util.Scanner;

/*
 * 문제 533
 * 남자는 'M' 여자는 'F'로 나타내기로 하고 18세 이상을 성인이라고 하자.
 * 성별('M', 'F')과 나이를 입력받아 "MAN"(성인남자), "WOMAN"(성인여자), "BOY"(미성년남자), "GIRL"(미성년여자)을 구분하여 출력하는 프로그램을 작성하시오.
 * 
 * 입력 예
 * F 15
 * 
 * 출력 예
 * GIRL
 */

public class Selection533 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char cVar1;
		int iVar1 = 0;
		
		cVar1 = sc.next().charAt(0);
		iVar1 = sc.nextInt();
		sc.close();
		
		if (cVar1 =='M') {
			if (iVar1 >= 18) {
				System.out.println("MAN");
			} else {
				System.out.println("BOY");
			}
		} else if (cVar1 == 'F') {
			if (iVar1 >= 18) {
				System.out.println("WOMAN");
			} else {
				System.out.println("GIRL");
			}
		} else {
			System.out.println("데이터를 다시 입력하세요.");
		}
		
		
		
		
	}//main

}//class
