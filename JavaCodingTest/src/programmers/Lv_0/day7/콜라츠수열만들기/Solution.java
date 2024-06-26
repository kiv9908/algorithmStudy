package programmers.Lv_0.day7.콜라츠수열만들기;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public List<Integer> solution(int n) {
		List<Integer> answer = new ArrayList<Integer>();
		answer.add(n);

		while (n != 1) {
			if (n % 2 == 0) {
				n /= 2;
				answer.add(n);
			} else {
				n = 3 * n + 1;
				answer.add(n);
			}
		}

		return answer;
	}
}