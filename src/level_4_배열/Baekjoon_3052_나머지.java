package level_4_배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon_3052_나머지 {

	public static void main(String[] args)throws IOException {
		
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
//		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		 int[] Narr = new int[10];
	        int num = 0;

	        for (int j = 0; j < 10; j++) {
	            int I = Integer.parseInt(br.readLine());
	            Narr[j] = I;
	        }

	        for (int j = 0; j < 10; j++) {
	            boolean isUnique = true;
	            for (int k = j + 1; k < 10; k++) {
	                if (Narr[j] % 42 == Narr[k] % 42) {
	                    isUnique = false;
	                    break;
	                }
	            }
	            if (isUnique) {
	                num++;
	            }
	        }

	        System.out.println(num);

	        br.close();
	        bw.close();

}
	
}
