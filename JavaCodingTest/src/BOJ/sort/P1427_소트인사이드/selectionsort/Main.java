package BOJ.sort.P1427_소트인사이드.selectionsort;

import java.util.Scanner;

/*
 * str(정렬하려는 숫자집합)
 * A(숫자 배열)
 * for (i=0~n의 길이){
 * 	for (j=i+1~n의 길이){
 * 	최대값을 찾고 A[i]보다 A[j]가 크면 swap
 * }
 * }
 * A출력
 */

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] A = new int[str.length()];

		// 문자열 하나씩 떼서 배열에 넣기
		for (int i = 0; i < str.length(); i++) {
			A[i] = Integer.parseInt(str.substring(i, i + 1));
		}

		for (int i = 0; i < str.length(); i++) {
			int max = i;
			for (int j = i + 1; j < str.length(); j++) {

				// 가장 큰 값 찾기
				if (A[max] < A[j]) {
					max = j;
				}

			}
			if (A[i] < A[max]) {
				int temp = A[i];
				A[i] = A[max];
				A[max] = temp;
			}

		}
		for (int i : A) {
			System.out.print(i);
		}
	}

}
