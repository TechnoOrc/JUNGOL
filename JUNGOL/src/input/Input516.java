package input;

import java.util.Scanner;

public class Input516 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double dVar1 = 0;
		double dVar2 = 0;
		String cVar;
		dVar1 = scan.nextDouble();
		dVar2 = scan.nextDouble();
		cVar = scan.next();
		System.out.printf("%.2f\n",dVar1);
		System.out.printf("%.2f\n",dVar2);
		System.out.println(cVar);
		
		
	}//main

}//class
