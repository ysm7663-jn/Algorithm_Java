package level5;
import java.util.Scanner;

public class N10818 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int [] array =  new int [n];
		
		for(int i = 0; i < array.length; ++i) {
			array[i] = s.nextInt();
		}
		
		int max = array[0], min = array[0];
		
		for(int i = 0; i < array.length; ++i) {
			if(array[i] > max)
				max = array[i];
		}
		
		for(int i = 0; i < array.length; ++i) {
			if(array[i] < min)
				min = array[i];
		}
			
		System.out.printf(max + " " + min);

	}

}
