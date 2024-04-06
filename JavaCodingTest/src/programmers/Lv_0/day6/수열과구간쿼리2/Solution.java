package programmers.Lv_0.day6.수열과구간쿼리2;

/*
 * 
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        return IntStream.range(0, queries.length)
                .map(q -> IntStream.rangeClosed(queries[q][0], queries[q][1])
                        .map(i -> arr[i])
                        .filter(i -> i > queries[q][2])
                        .min().orElse(-1)
                ).toArray();
    }
}

 */

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
