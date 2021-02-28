package Other;
import java.util.Scanner;

public class N5543 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int buger = 2001;
		int drink = 2001;

		for (int i = 0; i < 3; i++) {
			int a = s.nextInt();
			if (buger > a)
				buger = a;
		}

		for (int j = 0; j < 2; j++) {
			int b = s.nextInt();
			if (drink > b)
				drink = b;
		}

		System.out.println(buger + drink - 50);
	}

}
