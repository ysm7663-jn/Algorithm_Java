package level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 블랙잭
public class N2798_for {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());

		int sum = 0;
		int max = 0;

		int[] arr = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < arr.length-2; i++) {
			for (int j = i + 1; j < arr.length-1; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					sum += arr[i] + arr[j] + arr[k];
					
					if (max < sum && sum <= M) {
						max = sum;
						sum = 0;
					} else {
						sum = 0;
					}
					
					if (sum > M)
						break;

				}
			}
		}
		System.out.println(max);
//		런타임 오류
	}

}
