package Lv0.day6.수열과구간쿼리2;

class Solution {
	public static int[] solution(int[] arr, int[][] queries) {
		int[] answer = new int[queries.length];

		for (int i = 0; i < queries.length; i++) {
			int s = queries[i][0];
			int e = queries[i][1];
			int k = queries[i][2];
			boolean flag = false;

			for (int j = s; j < e + 1; j++) {
				if (arr[j] > k) {
					flag = true;
					if (answer[i] == 0) {
						answer[i] = arr[j];
					} else {
						if (answer[i] > arr[j]) {
							answer[i] = arr[j];
						}
					}

				}
			}
			if (!flag) {
				answer[i] = -1;
			}
		}
		return answer;
	}
}
