package level3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class N25304 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int totalCost = sc.nextInt(); 
		int count = sc.nextInt(); 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		
		for (int i = 0; i < count; i++){
			int a = sc.nextInt();
			int b= sc.nextInt();
			
			sum += a*b;
		}
		
		if(totalCost == sum){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
