package level6;

// ¼¿ÇÁ ¼ıÀÚ
public class N4673 {

	public static void main(String[] args) {

		boolean[] arr = new boolean[100001];
		
		for (int i = 1; i <= 10000; i++) {
			int n = d(i);
			
			if (n <= 10000) {
				arr[n] = true;
			}
			
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 10001; i++) {
			if(!arr[i]) {
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}
	
	static int d(int n) {
		int sum = n;
		
		while (n > 0) {
			sum += (n % 10);
			n /= 10;
		}
		
		return sum;
		
	}

}
