package BOJ.sort.P2750_수정렬하기;

import java.util.Scanner;

/*
 * 수도코드
 * N(정렬할 수 개수)
 * A(정렬할 배열 선언)
 * for (i=0 ~ N-1)
 * {
 * 	for(j=0~N-1	-i)
 * 	{
 * 		j가 j+1보다 크면 swap
 * 
 * 	}
 * }
 * A배열 출력
 */

public class Main {

	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];

		// 입력 받기
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		// 버블 정렬, 오름차순
		for (int j = 0; j < N - 1; j++) {
			for (int k = 0; k < N - 1 - j; k++) {
				if (A[k] > A[k + 1]) {
					int x = A[k];
					A[k] = A[k + 1];
					A[k + 1] = x;

				}
			}
		}

		for (int i : A) {
			System.out.println(i);
		}

	}
}
