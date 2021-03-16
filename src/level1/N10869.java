package level1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class N10869 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); 
		int b = sc.nextInt(); 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
	}
}
