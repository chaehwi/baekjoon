package level_5_문자;

import java.io.IOException;
import java.util.Scanner;

public class Baekjoon_11720_숫자의합 {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		String n = scan.next();
		
		
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			
			sum += n.charAt(i)-'0';
			// charAt() 은 해당 문자의 아스키코드 값을 반환하므로 
			// 반드시 -48 또는 -'0' 을 해주어야 함
		}
		
		System.out.println(sum);
		
	}
}
