package Other;
import java.util.Arrays;
import java.util.Scanner;

public class N11399 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++)
			arr[i] = s.nextInt();

		Arrays.sort(arr);
		
		int sum = 0;
		int min = 0;
		
		for(int i = 0; i < n; i++) {
			min += arr[i];
			sum += min;
		}
		
		System.out.println(sum);
		
	}

}
