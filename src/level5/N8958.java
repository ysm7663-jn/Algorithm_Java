package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// OX퀴즈
public class N8958 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		/*
		 * StringBuilder
		 * 
		 * 	1. 일반적인 StringBuffer로 String을 연결할 시 성능이 떨어진다.
		 * 	2. StringBuilder는 String + 문자열일 때, 새로운 객체를 생성하는 것이 아닌 기존의 데이터 뒤에 더한다
		 * 	3. 따라서 속도가 빠르고 상대적으로 부하가 적다.
		 * 		* 긴 문자열을 더할때 사용하면 유용
		 * - 사용방법-
		 * StringBuilder sb = new StringBuilder;	// 생성
		 * sb.append(t); 							// t라는 문자열을 추가한다. 
		 * sb.append(a);							// a라는 문자열을 추가한다.
		 * System.out.println(sb.toString());		// 쌓여있는 sb를 출력
		 */
		
		int N = Integer.parseInt(br.readLine());
		
		String[] arr = new String[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		
		for (int i = 0; i < N; i++) {
			
			int cnt = 0;
			int sum = 0;
			
			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'O') {
					cnt++;
				} else {
					cnt = 0;
				}
				sum += cnt;
			}
			sb.append(sum).append('\n');
		}
		
		System.out.println(sb);
	}

}
