package level_4_배열;

import java.util.Scanner;

public class Baekjoon_10810_공넣기 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		
		int N = scan.nextInt(); // 바구니 갯수
		int M = scan.nextInt(); // 공 넣는 횟수 
		
		int [] Narr = new int[N];
		
		
		for (int i = 0; i < M; i++) {

			int n1 = scan.nextInt(); // n1부터 n2까지 k번의 공을 넣겠다
			int n2 = scan.nextInt();
			int k = scan.nextInt();
			
			for(int j = n1 -1; j < n2; j++) {
				Narr[j] = k;
			}
		}
		
		for(int a = 0; a < Narr.length; a++) {
			System.out.print(Narr[a] + " ");
		}
		
		

	}

}
