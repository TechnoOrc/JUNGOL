package repetitive1;

import java.util.Scanner;

public class Rep538 {

public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("number? ");
			int inPut = scan.nextInt();
			if(inPut > 0){
			System.out.println("positive integer");
			} else if(inPut < 0) {
			System.out.println("negative number");
			} else {
			System.exit(0);
			}
		
		}//while
		
		
	}// main
}// class