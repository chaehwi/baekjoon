package level_1;

import java.util.Scanner;

//		(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
//		(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
//		세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.

public class Baekjoon_10430 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		System.out.println((A+B)%C + " " + ((A%C) + (B%C))%C + " " + (A*B)%C + " " +  ((A%C) * (B%C))%C);
		
	}

}
