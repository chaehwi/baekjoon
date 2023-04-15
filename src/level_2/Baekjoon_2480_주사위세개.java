package level_2;

import java.util.Scanner;

public class Baekjoon_2480_주사위세개 {
	
	// https://www.acmicpc.net/problem/2480

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		// 3 개가 모두 같을 경우
		if(a == b && a == c) {
			System.out.println(10000 + (a * 1000));
			
		// 2 개만 같을 경우	
		} else if(a == b || a == c ) {
			System.out.println(1000 + (a * 100));
		} else if(b == c) {
			System.out.println(1000 + (b * 100));
		}
		
		// 다 같지 않을 경우
		else {
			System.out.println(Math.max(a, Math.max(b, c)) * 100);
		}
		
		
	}

}
