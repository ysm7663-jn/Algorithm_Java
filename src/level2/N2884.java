package level2;
import java.util.Scanner;

public class N2884 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		int h = s.nextInt();
		int m = s.nextInt();
		
		int chm = m - 45;
		
		if(chm < 0) {
			chm += 60;
			h--;
			if(h < 0)
				h += 24;
		}
		
		System.out.println(h + " " + chm);
			
		
	}

}
