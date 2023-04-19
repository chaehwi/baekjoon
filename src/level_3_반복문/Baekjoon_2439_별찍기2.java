package level_3_반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon_2439_별찍기2 {

	public static void main(String[] args)throws IOException {
		
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			
			int mi = N - i;
			
			for(int j = 1; j <= mi; j++) {
				bw.write(" ");
			}
			
			for(int j = 1; j <= i; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		
		bw.close();
		
	}

}
