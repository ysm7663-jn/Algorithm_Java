package level5;
import java.util.Scanner;

public class N2562 {

	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
		int a[] = new int [9];
        
        for(int i = 0; i < a.length; i++)
            a[i] = s.nextInt();
		
		int max = 0;
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				count = i + 1;
			}

		}
		System.out.printf("%d\n%d", max, count);

	}
}
