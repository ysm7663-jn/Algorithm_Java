package Other;
import java.util.Scanner;

public class N10817 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		int max, mid, min;
		
		mid = a;
		 
		if(a >= b && b >= c)
			mid = b;
		
		else if(c >= b && b >= a)
			mid = b;
		
		else if(a >= c && c >= b)
			mid = c;
		
		else if(b >= c && c >= a)
			mid = c;
		
		else 
			mid = a;
		
		System.out.println(mid);

	}

}
