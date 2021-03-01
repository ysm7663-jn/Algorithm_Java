package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1546 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		double[] arr = new double[num];
		double total = 0;
		double max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Double.parseDouble(br.readLine());
			
			if (arr[i] > max) {
				max = arr[i];
			}
			
			total += arr[i];
		}
		
		double avg = total / max * 100 / num;
		System.out.println(avg);
		
		br.close();
	}

}