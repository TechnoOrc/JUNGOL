package repetitive1;

import java.util.Scanner;

public class Rep537 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int iPut = scan.nextInt();
		int sum = 0;
		scan.close();
		
		if(iPut <= 100) {
			int i = 0;
			while(i <= iPut) {
				sum = sum + i;
				i++;
			}//while
		}//if
		
		System.out.println(sum);
	}//main

}//class