package level3_반복문;

import java.util.Scanner;

public class Baekjoon_10950_AB3 {

	public static void main(String[] args) {
		
		// https://www.acmicpc.net/problem/10950
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int i = 0; i < T; i++) {
			
			int A = scan.nextInt();
			int B = scan.nextInt();
			
			System.out.println(A + B);
			
		}
	}

}
