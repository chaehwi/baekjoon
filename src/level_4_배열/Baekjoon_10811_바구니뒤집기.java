package level_4_배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon_10811_바구니뒤집기 {

	public static void main(String[] args)throws IOException {
		
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		 int N = Integer.parseInt(st.nextToken());
		 int M = Integer.parseInt(st.nextToken());
		 
		 int[] Narr = new int[N];
		 
		 for(int i = 0; i < N; i++) {
			 
			 Narr[i] = i + 1;
			 
			 /// { 1, 2, 3, 4, 5 }
		 }

		 for(int j = 0; j < M; j++) {
			 st = new StringTokenizer(br.readLine());
			 
			 int I = Integer.parseInt(st.nextToken());
			 int J = Integer.parseInt(st.nextToken());
			 
			 for(int k = I - 1; k < J - I; k++) {
				 
				 Narr[k] = J;
			 }
		 }
		 
		 for(int a = 0; a < Narr.length; a++) {
				System.out.print(Narr[a] + " ");
			}
		 
	        br.close();
	        bw.close();

}
	
}
