package programmers.Lv_0.day13.n번째원소까지;

import java.util.Arrays;

class Solution {
	public int[] solution(int[] num_list, int n) {
		int[] answer = Arrays.copyOfRange(num_list, 0, n);
		return answer;
	}
}