package level3;

import java.util.Scanner;

public class N11022 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		for (int i = 1; i <= n; i++) {
			int a = s.nextInt();
			int b = s.nextInt();

			System.out.println("Case #" + i + ": "  + a + " + " + b + " = " + (a+b));
		}

	}

}
