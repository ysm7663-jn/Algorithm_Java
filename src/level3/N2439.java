package level3;
import java.util.Scanner;

public class N2439 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				System.out.print(" ");
			}

			for (int k = n - i; k <= n; k++)
				System.out.print("*");

			System.out.println();
		}
	}

}
