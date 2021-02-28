package level4;
import java.util.Scanner;

public class N1110 {

	public static void main(String[] args) {

		int ship, ill;
		int next = 0;
		int hap = 0;
		int count = 0;

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		next = n;
		
		while (true) {

			ship = n / 10;
			ill = n % 10;

			hap = ship + ill;

			n = ill * 10 + hap % 10;
			
			count++;
			
			if(next == n)
				break;
		
		}
		
		System.out.println(count);

	}

}
