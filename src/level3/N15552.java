package level3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N15552 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//BufferedReader 객체 생성(콘솔에서 입력 받음)
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	//BufferedWriter 객체 생성
		
		int n = Integer.parseInt(br.readLine().trim());		// parseInt(구문 구분), 라인 단위로 입력 받음
		
		for(int i = 0; i < n; i++) {
			String text = br.readLine();
			String[] word = text.split(" ");	
			int a = Integer.parseInt(word[0]);
			int b = Integer.parseInt(word[1]);
			bw.write((a+b) + "\n");
		}
		
		bw.flush();
		bw.close();
	}

}
