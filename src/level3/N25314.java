package level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class N25314 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = "";
		
		for(int i = 0; i < num/4; i++){
			str += "long ";
		}
		System.out.println(str + "int");
		
	}

}
