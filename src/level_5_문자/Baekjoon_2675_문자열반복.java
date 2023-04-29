package level_5_문자;

import java.util.Scanner;

public class Baekjoon_2675_문자열반복 {

	// 문자열 S를 입력받은 후에, 
	// 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int i = 0; i < T; i++) {
			
			int R = scan.nextInt();
			String S = scan.next();
			
			
			for(int j = 0; j < S.length(); j++) {
				char s = S.charAt(j);
				
				for(int k = 0; k < R; k++) {
					System.out.print(s);
				}
			}
			
			System.out.println();
		}
		
		
		
		
	}
}
