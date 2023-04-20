package level_4_배열;

import java.util.Scanner;

public class Baekjoon_10810_공넣기 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		
		int N = scan.nextInt(); // 바구니 갯수
		int M = scan.nextInt(); // 공 넣는 횟수 
		
		int [] Narr = new int[N];
		
		int[] n1 = new int[M];
		int[] n2 = new int[M];
		int[] k = new int[M];

		
		for(int j = 0; j < Narr.length; j++) {
			
			Narr[j] = j + 1; // 바구니 번호 지정 
			
		}
		
		
		
		for (int i = 0; i < M; i++) {

			n1[i] = scan.nextInt();
			n2[i] = scan.nextInt();
			k[i] = scan.nextInt();
			
			

		}
		

	}

}
