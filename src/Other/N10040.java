package Other;
import java.util.Scanner;

public class N10040 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int a[] = new int[5];
		int sum = 0;
		int avg;

		for (int i = 0; i < a.length; i++) {

			a[i] = s.nextInt();

			if (a[i] < 40)
				a[i] = 40;
			sum += a[i];
		}
		
		avg = sum / a.length;
		System.out.println(avg);

	}
}
