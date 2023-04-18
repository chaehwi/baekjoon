package level_4_배열;

import java.util.Scanner;

public class Baekjoon_10818_최소최대 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		int[] num = new int[N];

		for (int i = 0; i < N; i++) {

			num[i] = scan.nextInt();

		}

		int max = num[0];
		int min = num[0];

		for (int j = 0; j < num.length; j++) {

			if (num[j] > max) {
				max = num[j];
			}
			if (num[j] < min) {
				min = num[j];
			}

		}

		System.out.println(min + " " + max);

	}

}
