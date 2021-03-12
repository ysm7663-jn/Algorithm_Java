package level13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 연산자 끼워넣기 
public class N14888_2java {

	static int Min = 1000000001;
	static int Max = -1000000001; 
	static int[] numer;
	static int[] oper = new int[4];
	static int N;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		numer = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// 수 입력
		for (int i = 0; i < N; i++) 
			numer[i] = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		// 연산자 갯수 입력
		for (int i = 0; i < 4; i++) 
			oper[i] = Integer.parseInt(st.nextToken());
			
		Calculator(numer[0], 1);
		
		System.out.println(Max);
		System.out.println(Min);
		
	}
	
	static void Calculator(int num, int idx) {
		
		 if (idx == N) {
			 Max = Math.max(Max, num);
			 Min = Math.min(Min, num);
			 return;
		 } 
		 
		 for (int i = 0; i < 4; i++) {
			 if(oper[i] > 0) {
				 oper[i]--;
				 
				 switch(i) {
				 case 0: Calculator(num + numer[idx], idx + 1); break;
				 case 1: Calculator(num - numer[idx], idx + 1); break;
				 case 2: Calculator(num * numer[idx], idx + 1); break;
				 case 3: Calculator(num / numer[idx], idx + 1); break;
				 }
				 
				 oper[i]++;
			 }
		 }
	}

}
