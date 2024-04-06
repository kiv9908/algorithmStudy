package programmers.Lv_0.day5.주사위게임2;

import java.util.HashSet;
import java.util.Set;

class Solution {
	public int solution(int a, int b, int c) {
		int answer = 0;

		Set<Integer> set = new HashSet<Integer>();

		set.add(a);
		set.add(b);
		set.add(c);

		if (set.size() == 3) {
			answer = a + b + c;
		} else if (set.size() == 2) {
			answer = (a + b + c) * ((int) Math.pow(a, 2) + (int) Math.pow(b, 2) + (int) Math.pow(c, 2));
		} else if (set.size() == 1) {
			answer = (a * 3) * (int) Math.pow(a, 2) * 3 * (int) Math.pow(a, 3) * 3;
		}

		return answer;
	}
}