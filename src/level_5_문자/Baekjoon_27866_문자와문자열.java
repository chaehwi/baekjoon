package level_5_문자;

import java.util.Scanner;

public class Baekjoon_27866_문자와문자열 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String S = scan.nextLine();
		int i = scan.nextInt();
		
		char a = S.charAt(i + 1);
		
		System.out.println(a);
		
	}
}
