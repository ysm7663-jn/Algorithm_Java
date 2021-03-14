package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 평균은 넘겠지
public class N4344 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr;
		int N = Integer.parseInt(br.readLine()); // 테스트 케이스 수
		
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int M = Integer.parseInt(st.nextToken());
			arr = new int[M];
			
			double sum = 0.0;
			
			for (int j = 0; j < M; j++) {
				int val = Integer.parseInt(st.nextToken());
				arr[j] = val;
				sum += arr[j];
			}
			
			double avg = (sum / M);
			double cnt = 0;
			
			for (int j = 0; j < M; j++) {
				if (arr[j] > avg) {
					cnt++;
				}
			}
			
			System.out.printf("%.3f%%\n",(cnt / M) * 100.0);
		}
		
		System.out.println();
	}

}
