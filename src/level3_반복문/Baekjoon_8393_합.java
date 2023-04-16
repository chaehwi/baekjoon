package level3_반복문;

import java.util.Scanner;

public class Baekjoon_8393_합 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int i = 1;
		int sum = 0;
		
//		while(i <= N) {
//			sum += i;
//			i++;
//		}
//		
//		System.out.println(sum);
		
		for(int b = 1; b <= N; b++) {
			sum += b;
		}
		
		System.out.println(sum);
		
		
	}

}
