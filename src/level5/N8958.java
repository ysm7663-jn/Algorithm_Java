package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N8958 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String[] arr = new String[num];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine();
			System.out.println(arr[i]);
		}
		

	}

}
