package programmers.Lv_0.day13.순서바꾸기;

import java.util.Arrays;

class Solution {
	public int[] solution(int[] num_list, int n) {
		int[] answer = new int[num_list.length];
		int[] front = new int[n];
		int[] back = new int[num_list.length - n];

		front = Arrays.copyOfRange(num_list, 0, n);
		back = Arrays.copyOfRange(num_list, n, num_list.length);

		int index = 0;

		for (int i = 0; i < back.length; i++) {
			answer[index++] = back[i];
		}
		for (int i = 0; i < front.length; i++) {
			answer[index++] = front[i];
		}

		return answer;
	}
}