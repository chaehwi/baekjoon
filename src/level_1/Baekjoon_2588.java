package level_1;

import java.util.Scanner;

public class Baekjoon_2588 {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		System.out.println(A * (B%10));
		System.out.println(A * ((B - (B/100*100))/10));
		System.out.println(A * (B/100));
		
		System.out.println(A * B);
	}

}
