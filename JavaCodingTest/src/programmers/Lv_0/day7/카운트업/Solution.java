package programmers.Lv_0.day7.카운트업;

class Solution {
	public int[] solution(int start_num, int end_num) {
		int[] answer = new int[end_num - start_num + 1];
		for (int i = start_num; i <= end_num; i++) {
			answer[i - start_num] = i;
		}

		return answer;
	}
}