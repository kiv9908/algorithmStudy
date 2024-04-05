package Lv0.day7.수열과구간커리4;

class Solution {
	public static int[] solution(int[] arr, int[][] queries) {

		for (int i = 0; i < queries.length; i++) {
			int s = queries[i][0];
			int e = queries[i][1];
			int k = queries[i][2];

			for (int j = s; j < e + 1; j++) {
				if (j % k == 0) {
					arr[j] += 1;

				}
			}

		}
		return arr;
	}
}