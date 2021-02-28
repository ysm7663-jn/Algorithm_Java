package level3;
import java.util.Scanner;

public class N10950 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int x, y;
		
		for(int i = 0; i < n; i++) {
			x = s.nextInt();
			y = s.nextInt();
			System.out.println(x + y);
		}
		
	}
	

}
