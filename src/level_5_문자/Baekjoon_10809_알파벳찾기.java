package level_5_문자;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon_10809_알파벳찾기 {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		String S = scan.nextLine();
		
		int[] apb = new int[26];
		
		
		for(int i = 0; i < apb.length; i++ ) {
			
			apb[i] = -1;
			
		}
		
		for(int i =0; i < S.length(); i++) {
			
			char s = S.charAt(i);
			
			if(apb[s - 'a'] == -1) {
				apb[s - 'a'] = i;
			}
		}
		
		for(int val : apb) {
			System.out.print(val + " ");
		}
		
		
	}
}
