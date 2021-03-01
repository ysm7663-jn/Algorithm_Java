package Other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N2309 {

	static void printResult(int[] arr, int fake_i, int fake_j) {
		for (int i = 0; i < 9; i++) {
			if (i != fake_i && i != fake_j)
			System.out.println(arr[i]);
		}
	}
	
	static void findReal(int[] arr, int sum) {
		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (sum - arr[i] - arr[j] == 100) {
					printResult(arr, i, j);
				} 
			}
		}
	}
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int [9];
		int sum = 0;
		
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		
		findReal(arr, sum);
		
		br.close();
	}

}
