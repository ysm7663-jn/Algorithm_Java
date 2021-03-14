package level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 정수 N개의 합
public class N15596 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int [] a = new int [N];
		
		for (int i = 0; i < N; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println(sum(a));
	}
	
	static int sum(int a[]) {
		
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum;
		
	}

}
