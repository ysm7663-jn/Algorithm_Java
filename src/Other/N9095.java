package Other;
import java.util.Scanner;

// 재귀함수 문제
public class N9095 {

	static int nCount = 0;
	
	static void n_sum(int num) {
		if (num == 0) {
			nCount++;
			return;
		} else if (num < 0) {
			return;
		} else {
			n_sum(num-1);
			n_sum(num-2);
			n_sum(num-3);
		}
	}
	
	public static void main(String[] args) {
		
		/*
		 * 브루트 포스
		 *  조건 
		 * 	1) 모든 경우의 수를 시도했을 때 주어진 시간안에 가능할 때(1초 => 2억번 연산)
		 *  2) 수학적/알고리즘적 공식이 없을 경우
		 *  푸는 방법  
		 * 	1. 반복문 (선형적인 증가가 존재   ex) ESM(선형적증가), 난쟁이(n차 for문)
		 * 	2. 재귀함수 (반복문으로 못 풀거 같은 경우 사용)
		 * 		조건
		 *   	1) 종료부가 상단에 존재 > 종료부가 없을 경우 무한재귀호출 runTime error, 코드를 판단하기 좋음
		 *   	2) 호출부가 하단에 존재 > 
		 */
		
		Scanner sc = new Scanner(System.in);
		int n, temp;
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			nCount = 0; // 초기화를 안 할시 다음 i에 nCount가 누적된다.
			temp = sc.nextInt();
			n_sum(temp);
			System.out.println(nCount);
			
		}
		
		
	}

}
