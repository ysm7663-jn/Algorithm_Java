package level3;
import java.util.Scanner;

public class N10871 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int x[] = new int[n];

		int k = s.nextInt();

		for (int i = 0; i < n; i++) {
			x[i] = s.nextInt();
			if (x[i] < k)
				System.out.print(x[i] + " ");
		}

	}

}
