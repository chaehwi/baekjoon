package level_4_배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon_5597_과제안내신분 {

	public static void main(String[] args)throws IOException {
		
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
//		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		boolean[] Narr = new boolean[31];
		
		
		
		for(int j = 0; j < 28; j++) {
			
//			st = new StringTokenizer(br.readLine());
			
			int I = Integer.parseInt(br.readLine());
			Narr[I] = true;
			
		}
		
		for(int i = 1; i <= 30; i++) { // 출석 번호 부여
					
			if(!Narr[i]) {
				System.out.println(i);
			}
			
		}
		
		br.close();
		bw.close();
		
	}

}
