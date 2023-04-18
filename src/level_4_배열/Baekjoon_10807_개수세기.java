package level_4_배열;

import java.util.Scanner;

public class Baekjoon_10807_개수세기 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int[] num = new int[N];
		
		for(int i = 0; i < N; i++) {
			
			num[i] = scan.nextInt();
			
		}
		
		int v = scan.nextInt();
		int count = 0;
		
		for(int j = 0; j < num.length; j++) {
			
			if(num[j] == v) {
				count++;
			}
			
		}
		
		System.out.println(count);
		
	}

}
