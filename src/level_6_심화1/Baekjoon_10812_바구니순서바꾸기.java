package level_6_심화1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon_10812_바구니순서바꾸기 {

	
	// 도현이는 바구니를 총 N개 가지고 있음 (1 ~ N번까지 번호가 순서대로 적힌 바구니)
	// M번 바구니의 순서를 회전시키려고 함
	// 순서를 회전시킬 범위를 정하고, 그 범위 안에서 기준이 될 바구니를 선택 (begin, end, mid)
	// begin, begin + 1, ... , mid-1,mid,mid+1,...,end-1,end => mid,mid+1,...,end-1,end,begin,begin+1,...,mid-1
	
	
	public static void main(String[] args)throws IOException {
		
	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 바구니의 개수
		int M = sc.nextInt(); // 회전 순서
		
		int[] Narr = new int[N];
		
		// 바구니에 번호 부여하기
		for(int i = 0; i < N; i++) {
			Narr[i] = i + 1; 
		}

		// I, K, J 
		for(int i = 0; i < M; i++) {
			int I = sc.nextInt(); // I번째 바구니부터
			int J = sc.nextInt(); // K번째 바구니까지
			int K = sc.nextInt(); // 기준 바구니는 J
		}
		
		
		
		
	}

}
