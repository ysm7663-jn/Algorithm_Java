package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class N3052 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader는 무조건 String 으로 저장된다. 
		
		HashSet<Integer> h = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			h.add(Integer.parseInt(br.readLine()) % 42);
			// readLine의 return 값은 String 이기 때문에 형변환이 필요하다.
		}
		
		System.out.println(h.size());
		
	} 

}
