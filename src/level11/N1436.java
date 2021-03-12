package level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 영화감독 숌
public class N1436 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int num = 666;
		int count = 1;
		
		while(count != N) {
			num++;
			if(String.valueOf(num).contains("666")) {
				count++;
			}
			
			// String.valueOf() - 파라미터가 null이면 문자열 "null"을 만들어서 반환한다. (NPE 방지를 위해 사용 권장)
			// toString() - 대상 값이 null이면 NPE를 발생시키고 Object에 담긴 값이 String이 아니여도 출력한다.
			
			// contains() - 함수는 대상 문자열에 특정 문자열이 포함되어 있는지 확인하는 함수
			
		}
		
		System.out.println(num);
		
	}

}
