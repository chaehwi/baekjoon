package level3_반복문;

import java.util.Scanner;

public class Baekjoon_25314_코딩은체육과목입니다 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt(); 
		
		int div = N / 4;
		
		for(int i = 0; i < div; i++) {
			
			System.out.print("long ");
		}
		
		System.out.print("int");
	}

}
