package level_4_배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon_10813_공바꾸기 {

	public static void main(String[] args)throws IOException {
		
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // 도현이가 가지고 있는 바구니 갯수
		int M = Integer.parseInt(st.nextToken()); // 공을 바꿀 횟수
		int spa;
		
		int[] Narr = new int[N];
		
		
		for(int i = 0; i < N; i++) { // 바구니에 번호 부여
			
			Narr[i] = i + 1;
			
		}
		
		for(int j = 0; j < M; j++) {
			
			st = new StringTokenizer(br.readLine());
			
			int I = Integer.parseInt(st.nextToken());
			int J = Integer.parseInt(st.nextToken());
			
			spa = Narr[I-1];
			Narr[I-1] = Narr[J-1];
			Narr[J-1] = spa;
		}
		
		for(int a = 0; a < Narr.length; a++) {
			bw.write(Narr[a] + " ");
		}
		
		br.close();
		bw.close();
		
	}

}
