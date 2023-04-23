package level_4_배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon_1546_평균 {

	public static void main(String[] args)throws IOException {
		
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		 int N = Integer.parseInt(st.nextToken()); // 시험 본 과목의 개수
		 
		 int[] Narr = new int[N];
		 
		 int max = 0;
		 
		 for(int i = 0; i < N; i++) {
			 st = new StringTokenizer(br.readLine(), " ");
			 Narr[i] = Integer.parseInt(st.nextToken());
			 
			 // 최댓값 구하기
			 
			 if(max < Narr[i]) {
				 max = Narr[i];
			 }
			 
//			 max = Math.max(max, Narr[i]);
			 
		 }
		 
//		 for(int j = 0; j < Narr.length; j++) {
//			 
//			 sum += Narr[j]/max*100;
//			 
//		 }
		 
//		 for(int j = 0; j < scores.length; j++) {
//			    scores[j] = scores[j]/max*100;
//			    sum += scores[j];
//			}
		 
//		 첫 번째 코드에서 Narr 배열의 값을 수정하고 sum 변수에 더하는 것으로 계산합니다. 즉, Narr 배열의 값이 계산에서 실제 사용되는 값과 다르게 됩니다.

//		 두 번째 코드에서는 새로운 배열 scores를 만들어서 최댓값을 이용해 계산한 값을 저장하고 sum 변수에 더합니다. 이렇게 하면 Narr 배열의 값은 변경되지 않기 때문에 계산에 실제 사용되는 값과 일치합니다.
		 
		  double sum = 0.0;
	        for (int score : Narr) {
	            sum += (double) score / max * 100;
	        }
	        
		 System.out.println( sum / N);
		 
	        br.close();
	        bw.close();

}

}
