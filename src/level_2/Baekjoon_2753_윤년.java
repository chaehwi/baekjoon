package level_2;

// 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Baekjoon_2753_윤년 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		
		if(A % 4 == 0 && A % 100 != 0 || A % 400 ==0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

}
