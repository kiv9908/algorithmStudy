package programmers.Lv_0.day10.세로읽기;

class Solution {
	public String solution(String my_string, int m, int c) {
		String answer = "";

		for (int i = 0; i < my_string.length(); i++) {

			if (i % m == c - 1) {
				answer += my_string.charAt(i);
			}
		}

		return answer;
	}
}