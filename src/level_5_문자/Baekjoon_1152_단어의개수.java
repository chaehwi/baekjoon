package level_5_문자;

import java.util.Scanner;

public class Baekjoon_1152_단어의개수 {

	// 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 
	// 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String S = scan.nextLine();
		
		String[] s = S.split(" ");
		
//		System.out.println(s[0]);
//		System.out.println(s[1]);
//		System.out.println(s[s.length - 1]);
		if(s[0] == "" && s[s.length - 1] == "") {
			
			System.out.println(s.length - 2);
			
		} else if(s[0] == "") {
			
			System.out.println(s.length - 1);
			
		} else if(s[s.length - 1] == "") {
			
			System.out.println(s.length - 1);
			
		} else {
			
			System.out.println(s.length);
		}
		
		
		}
		
	}
