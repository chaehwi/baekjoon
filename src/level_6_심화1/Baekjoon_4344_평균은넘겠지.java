package level_6_심화1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon_4344_평균은넘겠지 {

	
	// 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
	
	
	public static void main(String[] args)throws IOException {
		
	
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt(); // 테스트 케이스의 개수
		int[] stArr;
		
		for(int i = 0; i < C; i++) {
			
			int st = sc.nextInt(); // 학생 수
			stArr = new int[st];
			double sum = 0;
			
			// 학생들 성적
			for(int j = 0; j < st; j++) {
				
				int score = sc.nextInt();
				stArr[j] = score;
				sum += score; // 성적 합
				
			}
			
			double avg = (sum / st);
			double count = 0; // 평균 넘는 학생들 변수
			
			for(int j = 0; j < st; j++) {
				
				if(stArr[j] > avg) {
					count++;
				}
				
			}
			
			System.out.printf("%.3f%%\n",(count/st)*100);
		}
		
		
	}
}
