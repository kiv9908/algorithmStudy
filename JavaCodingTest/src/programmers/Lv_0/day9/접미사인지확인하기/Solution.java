package programmers.Lv_0.day9.접미사인지확인하기;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public int solution(String my_string, String is_suffix) {
		int answer = 0;
		// 접미사 배열 만들기
		List<String> suffix = new ArrayList<String>();

		for (int i = 0; i < my_string.length(); i++) {
			suffix.add(my_string.substring(i, my_string.length()));
		}

		answer = suffix.contains(is_suffix) ? 1 : 0;
		return answer;
	}
}