package level_4_배열;

import java.util.Scanner;

public class Baekjoon_2562_최댓값 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);


		int[] num = new int[9];

		for (int i = 0; i < 9; i++) {

			num[i] = scan.nextInt();

		}

		int max = num[0];
		int seq = 0;

		for (int j = 1; j < num.length; j++) {

			if (num[j] > max) {
				max = num[j];
				seq = j;
			}

		}

		System.out.println(max);
		System.out.println(seq + 1);

	}

}
