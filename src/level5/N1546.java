package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1546 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int[] score = new int[num]; 
		
		for (int i = 0; i < score.length; i++) {
			score[i] = Integer.parseInt(br.readLine());
			System.out.println(score[i]);
		}
		
		int max = score[0];
		
		for (int i = 0; i < score.length; i++) {
			if (max < score[i]) 
				max = score[i];
		}
		
		System.out.println("max : " + max);
		
		for (int i = 0; i < score.length; i++) {
			if (score[i] != max) {
				System.out.println(score[i]);
				score[i] = score[i] / max * 100;
			}
			System.out.println("i : " + score[i]);
		}
		
		int sum = 0;
		double avg = 0.0;
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		System.out.println(sum);
		avg = sum / score.length;
		
		System.out.println(avg);
		
	}

}
