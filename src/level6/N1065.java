package level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1065 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println(hanSu(Integer.parseInt(br.readLine())));

	}

	public static int hanSu(int num) {

		int cnt = 0;

		if (num < 100) {
			return num;
		} else {
			cnt = 99;
			if (num == 1000)
				num = 999;

			for (int i = 100; i <= num; i++) {
				int baek = i / 100;
				int ship = (i / 10) % 10;
				int ill = i % 10;

				if ((baek - ship) == (ship - ill)) {
					cnt++;
				}
			}
		}

		return cnt;

	}

}
