package Other;

import java.util.Scanner;

// 분해합 문제
public class N2231 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 분해합
		int result = 0;

		for (int i = 1; i <= N; i++) {

			int num = i;
			int sum = 0;

			while (num != 0) {
				sum += (num % 10);
				num /= 10;
			}

			if (i + sum == N) {
				result = i;
				break;
			}

		}
		System.out.println(result);

	}

}
