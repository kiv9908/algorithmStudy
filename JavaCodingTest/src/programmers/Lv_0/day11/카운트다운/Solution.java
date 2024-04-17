package programmers.Lv_0.day11.카운트다운;

class Solution {
	public int solution(int[] arr, int idx) {
		int answer = 0;

		for (int i = idx; i < arr.length; i++) {
			if (arr[i] == 1) {
				answer = i;
				break;
			}
		}

		if (answer == 0) {
			answer = -1;
		}

		return answer;

	}
}