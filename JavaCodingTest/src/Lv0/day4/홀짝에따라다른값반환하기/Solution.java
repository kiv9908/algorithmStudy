package Lv0.day4.홀짝에따라다른값반환하기;

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