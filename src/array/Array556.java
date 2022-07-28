package array;

public class Array556 {

	public static void main(String[] args) {

		int jungArr [] = new int [10];
		
		for (int i = 0, j = 1 ; i < jungArr.length && j <= 10; i++, j++) {
			jungArr[i] = j;
		}
		
		for (int i = 0; i < jungArr.length; i++) {
			System.out.print(jungArr[i] + " ");
		}
	
	
	}//main

}//class