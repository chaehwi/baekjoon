package level_3_반복문;

import java.util.Scanner;

public class Baekjoon_10952_AB4 {

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		
		while(scan.hasNextInt()) {
			
			int A = scan.nextInt();
			int B = scan.nextInt();
			
			System.out.println(A + B);
			
		}
	
		scan.close();
	}

}
