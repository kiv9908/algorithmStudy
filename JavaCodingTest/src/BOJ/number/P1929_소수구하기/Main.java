package BOJ.number.P1929_소수구하기;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();

		// 배열 초기화
		int[] arr = new int[N + 1];
		arr[0] = 1;
		arr[1] = 1;

		// 에라토스테네스의 채 사용
		// N의 제곱근보다 작은 정수들을 대상으로 그 정수들의 배수인 인덱스에 1을 대입
		// 이미 제거했다면 방문하지 않음
		for (int i = 2; i < arr.length; i++) {
			if (i <= (int) Math.sqrt(N) && arr[i] != 1) {
				for (int j = 2; j <= (N / i); j++) {
					arr[i * j] = 1;
				}
//				for (int j = i+i; j <= N ; j+=i) {
//					arr[j] = 1;
//				}
			}
		}

		for (int i = M; i < arr.length; i++) {
			if (arr[i] == 0) {
				System.out.println(i);
			}

		}
	}

}
