package level_2;

import java.util.Scanner;

public class Baekjoon_2525_오븐시계 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt(); // 시
		int B = scan.nextInt(); // 분
		int C = scan.nextInt(); // 더할 분
		
		int min = A * 60 + B; // A,B (현재 시, 분을 분으로 변환)
		min = min + C; // 분으로 변환한 값에 분 더하기

		int hour = (min / 60) % 24;
		int minute = min % 60;
		
		System.out.println(hour + " " + minute);

	}

}
