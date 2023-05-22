package level_6_심화1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon_10988_팰린드롬인지확인하기 {

	
	// 알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
	// level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.
	
	
	public static void main(String[] args)throws IOException {
		
	
		Scanner sc = new Scanner(System.in);
		String S = sc.next(); // 주어진 단어
		
		int result = 1;
		
		// [0] 와 [S.length - 1], [1] 와 [S.length - 2] 의 값이 같으면 됨
		
		for(int i = 0; i < S.length() / 2; i++) {
			
			if(S.charAt(i) != S.charAt(S.length() - i -1)) {
				result = 0;
			}
		}
		
		System.out.println(result);
		
	}

}
