package level5;
import java.util.Scanner;

public class N2577 {
	
	public static void main(String[] args) {
		
		int r [] = new int [10];
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		int result = a * b * c;
		
		System.out.println(result);
		
		while(result > 0) {
			r[result % 10]++;
			result /= 10;
		}
		
		for (int i = 0; i < r.length; i++) {
			System.out.println(i + " : " + r[i]);
		}
		
	}

}
