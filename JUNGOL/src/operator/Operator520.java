package operator;

import java.util.Scanner;

public class Operator520 {

	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		int inPut1 = scan.nextInt();
		//int inPut2 = scan.nextInt();
		//int inPut3 = scan.nextInt();
		int a = inPut1++ ;
		int b = ++inPut1 ;
		System.out.println(a);
		System.out.print(b);
				
		
	}//main
	
	

}//class