package programmers.Lv_0.day9.접미사배열;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
	public List<String> solution(String my_string) {
		List<String> answer = new ArrayList<>();

		for (int i = 0; i < my_string.length(); i++) {
			answer.add(my_string.substring(i));
		}
		answer.sort(Comparator.naturalOrder());
		return answer;
	}
}