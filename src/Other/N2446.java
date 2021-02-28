package Other;
import java.util.Scanner;

public class N2446 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int N = s.nextInt();

		for (int i = 0; i < N; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < (2 * N - 1) - (i * 2); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < N - 1; i++) {

			for (int j = 1; j < (N - 1) - i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < 3 + 2 * i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
