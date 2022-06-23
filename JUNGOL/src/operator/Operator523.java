package operator;

import java.util.Scanner;

public class Operator523 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int intVar1 = scan.nextInt();
		int intVar2 = scan.nextInt();
		System.out.println(intVar1 + " > " + intVar2 + " --- " + ((intVar1 > intVar2)?1:0));
		System.out.println(intVar1 + " < " + intVar2 + " --- " + ((intVar1 < intVar2)?1:0));
		System.out.println(intVar1 + " >= " + intVar2 + " --- " + ((intVar1 >= intVar2)?1:0));
		System.out.println(intVar1 + " <= " + intVar2 + " --- " + ((intVar1 <= intVar2)?1:0));
		
	}

}