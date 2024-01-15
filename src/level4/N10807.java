package level4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class N10807 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = sc.nextInt();
		
		int [] arr = new int[num];
				
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		int chkNum = sc.nextInt();

		int cnt = 0;
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == chkNum){
				cnt += 1;
			}
		}
		
		System.out.println(cnt);
		
	}

}
