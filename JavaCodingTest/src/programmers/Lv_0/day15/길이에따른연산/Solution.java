package programmers.Lv_0.day15.길이에따른연산;

class Solution {
	public int solution(int[] num_list) {
		int answer = 0;

		if (num_list.length >= 11) {
			for (int i : num_list) {
				answer += i;
			}
		} else if (num_list.length <= 10) {
			answer = 1;
			for (int i : num_list) {
				answer *= i;
			}
		}
		return answer;
	}
}