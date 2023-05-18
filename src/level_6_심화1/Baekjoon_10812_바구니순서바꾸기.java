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
		
		int[] Narr = new int[N]; // 바구니 배열
		int[] newNarr = new int[N]; // 결과 바구니 배열
		
		// 바구니에 번호 부여하기
		for(int i = 0; i < N; i++) {
			Narr[i] = i + 1; 
		}

		// I, K, J 
		for(int b = 0; b < M; b++) {
			int i = sc.nextInt()-1; // I번째 바구니부터
			int j = sc.nextInt()-1; // K번째 바구니까지
			int k = sc.nextInt()-1; // 기준 바구니는 J
			
			 // i를 기준으로 반복문을 돌려야 하기에 따로 저장
            int i1 = i;

            // 바구니가 바뀌는 횟수
            for(int c = 0; c < j-i+1; c++){
                // k부터 j까지
                if(c+k <= j){
                	newNarr[c+i] = Narr[c+k];
                }
                // i부터 k까지
                else {
                	newNarr[c+i] = Narr[i1];
                    i1++;
                }
            }

            // 회전 범위에 속하지 않을 경우
            for(int d = 0; d < N; d++){
                if(newNarr[d] != 0){ 
                	Narr[d] = newNarr[d];
                }
            }
		}
		
		// 결과 출력
		for(int e = 0; e<Narr.length; e++){
            System.out.print(Narr[e]+" ");
        }
		
//		 BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
//	     BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//	        String str = bfr.readLine();
//	        StringTokenizer st = new StringTokenizer(str, " ");
//	        int N = Integer.parseInt(st.nextToken());
//	        int M = Integer.parseInt(st.nextToken());
//	        int basket[] = new int[N + 1];
//	        int newBasket[] = new int[N + 1];
//
//	        for (int s = 1; s <= N; s++) {
//	            basket[s] = s;
//	            newBasket[s] = s;
//	        }
//
//	        String method;
//	        StringTokenizer stt;
//	        int i, j, k;
//
//	        for (int s = 0; s < M; s++) {
//	            method = bfr.readLine();
//	            stt = new StringTokenizer(method);
//	            i = Integer.parseInt(stt.nextToken());
//	            j = Integer.parseInt(stt.nextToken());
//	            k = Integer.parseInt(stt.nextToken());
//	            int ii = i;
//
//	            for (int g = 0; g < j - i + 1; g++) {
//	                if (k + g <= j) {
//	                    newBasket[g + i] = basket[k + g];
//	                } else {
//	                    newBasket[g + i] = basket[ii];
//	                    ii++;
//	                }
//	            }
//
//	            for (int g = 1; g <= N; g++) {
//	                basket[g] = newBasket[g];
//	            }
//	        }
//
//	        for (int s = 1; s <= N; s++) {
//	            bfw.write(newBasket[s] + " ");
//	        }
//
//	        bfr.close();
//	        bfw.flush();
//	        bfw.close();
	}

}
