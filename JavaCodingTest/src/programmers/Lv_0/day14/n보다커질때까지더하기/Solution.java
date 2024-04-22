package programmers.Lv_0.day14.n보다커질때까지더하기;

class Solution {
	public int solution(int[] numbers, int n) {
		int answer = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (answer <= n) {
				answer += numbers[i];
			} else {
				break;
			}
		}

		return answer;
	}
}