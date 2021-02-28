package Other;
import java.util.Scanner;

public class N2523 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int k = n-1; k > 0; k--) {
			for(int m = k; m > 0; m--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
