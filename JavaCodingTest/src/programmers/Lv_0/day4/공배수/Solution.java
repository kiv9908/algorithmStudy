package programmers.Lv_0.day4.공배수;

class Solution {
	public int solution(int n) {
		int answer = 0;

		if (n % 2 != 0) {
			for (int i = 0; i < n + 1; i++) {
				if (i % 2 != 0) {
					answer += i;
				}

			}
		} else {

			for (int i = 1; i < n + 1; i++) {
				if (i % 2 == 0) {
					answer += (int) Math.pow(i, 2);
				}

			}
		}

		return answer;
	}
}