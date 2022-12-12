package level_2;

import java.util.Scanner;

public class Baekjoon_2884_알람시계 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int H = scan.nextInt();
		int M = scan.nextInt();

//		if (H == 0) {
//			H = 24;
//			if (M >= 45) {
//				M -= 45;
//			} else {
//				H --;
//				M = 60 - (45 - M);
//			}
//		} else {
//			if (M >= 45) {
//				M -= 45;
//			} else {
//				H --;
//				M = 60 - (45 - M);
//			}
//		}
		
		if(M < 45) {
			M = 60 -(45-M);
			if(H == 0) {
				H = 24;
			}
			H--;
		} else {
			M -= 45;
		}

		System.out.println(H + " " + M);
	}

}
