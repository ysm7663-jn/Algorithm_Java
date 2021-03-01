package Other;

import java.util.Scanner;

public class N1476 {

	static void countUp(int i, int j, int k) {

		i++;
		j++;
		k++;
		
		if (i == 16)
			i = 1;
		
		if (j == 29)
			j = 1;
		
		if (k == 20)
			k = 1;
	}

	public static void main(String[] args) {

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
//		int e = Integer.parseInt(br.readLine()); 
//		int s = Integer.parseInt(br.readLine()); 
//		int m = Integer.parseInt(br.readLine());
		
		Scanner sc = new Scanner(System.in);
		
		int e = sc.nextInt();
		int s = sc.nextInt();
		int m = sc.nextInt();
		
		int year = 1;
		int i = 1, j = 1, k = 1;

		while (true) {

			if (i == e && j == s && k == m) {
				break;
			}
//			
//			countUp(i, j, k);
			
			/*
			 * 메소드 사용시 시간을 더 오래 잡아먹음
			 */
			i++;
			j++;
			k++;
			
			if (i == 16)
				i = 1;
			
			if (j == 29)
				j = 1;
			
			if (k == 20)
				k = 1;
			year++;
		}

		System.out.println(year);
	}
}
