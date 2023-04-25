package level_5_문자;

import java.util.Scanner;

public class Baekjoon_11654_아스키코드 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int i = 0; i < T; i++) {
			
			String S = scan.next();
			
			char f = S.charAt(0);
			char l = S.charAt(S.length()-1);
			
			System.out.println(f +""+ l);
		}
		
		
		
		
	}
}
