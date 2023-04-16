package level3_반복문;

import java.util.Scanner;

public class Baekjoon_25304_영수증 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int X = scan.nextInt(); // 영수증에 적힌 총 금액
		int N = scan.nextInt(); // 영수증에 적힌 구매한 물건의 종류의 수
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
//			input = scan.nextLine(); // nextInt 도 공백 옆에 쓸 수 있었음..
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			sum += (a * b);
		}
		
		if(sum != X) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
		
	}

}
