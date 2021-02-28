package Other;
import java.util.Scanner;

public class N11047 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int k = s.nextInt();

		int worth[] = new int[N];
		
		int cnt = 0;
		
		for(int i = 0; i < N; i++) 
			worth[i] = s.nextInt();
 
		for(int j = N -1; j >= 0; j--) {
			if(k >= worth[j]) {
				cnt += k / worth[j];
				k = k % worth[j];
			}
		}
		System.out.println(cnt);
					
	}

}
