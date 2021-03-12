package level13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 연산자 끼워넣기 (윤석이 방법)
public class N14888 {

	static int Min = 1000000001;
	static int Max = -1000000001; 
	static int[] num = new int[11];
	static int[] oper = new int[4];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		// 수 입력
		for (int i = 0; i < N; i++) 
			num[i] = Integer.parseInt(br.readLine());
		
		// 연산자 갯수 입력
		for (int i = 0; i < oper.length; i++) 
			oper[i] = Integer.parseInt(br.readLine());
			
		Calculator(1, oper[0], oper[1], oper[2], oper[3], num[0]);
		
		System.out.println(Max);
		System.out.println(Min);
		
	}
	
	static void Calculator(int index, int plus, int minus, int mul, int div, int sum) {
		
		 if (plus == 0 && minus == 0 && mul == 0 && div == 0) {
			 Max = Math.max(Max, sum);
			 Min = Math.min(Min, sum);
		 } else if (plus < 0 || minus < 0 || mul < 0 || div < 0) { 
			 return;
		 } else {
			 Calculator(index+1, plus-1, minus, mul, div, sum+num[index]);
			 Calculator(index+1, plus, minus-1, mul, div, sum-num[index]);
			 Calculator(index+1, plus, minus, mul-1, div, sum*num[index]);
			 Calculator(index+1, plus, minus, mul, div-1, sum/num[index]);
		 }
	}

}
