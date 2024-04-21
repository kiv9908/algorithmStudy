package programmers.Lv_0.day13.n번째원소부터;

import java.util.Arrays;

class Solution {
	public int[] solution(int[] num_list, int n) {
		int[] answer = {};

		answer = Arrays.copyOfRange(num_list, n - 1, num_list.length);
		return answer;
	}
}