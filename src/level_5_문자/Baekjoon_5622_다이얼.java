package level_5_문자;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon_5622_다이얼 {

	// 상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다. 
	// 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String S = scan.nextLine();
		
		StringTokenizer st = new StringTokenizer(S, " ");
		
		String s1 = st.nextToken();
		String s1r = new StringBuilder(s1).reverse().toString();
		
		String s2 = st.nextToken();
		String s2r = new StringBuilder(s2).reverse().toString();
		
		int s1i = Integer.parseInt(s1r);
		int s2i = Integer.parseInt(s2r);
		
		int max = s1i;
		
		if(s1i < s2i) {
			max = s2i;
		} else {
			max = s1i;
		}
		
		System.out.println(max);
		
	}
}
