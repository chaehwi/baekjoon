package level_4_배열;

import java.util.Scanner;

public class Baekjoon_10871_x보다작은수 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int X = scan.nextInt();
		
		int[] num = new int[N];
		
		for(int i = 0; i < N; i++) {
			
			num[i] = scan.nextInt();
			
		}
		
		
		for(int j = 0; j < num.length; j++) {
			
				if(num[j] < X) {
					System.out.print(num[j] + " ");
			}
			
		}
		
	}
	
		

}
