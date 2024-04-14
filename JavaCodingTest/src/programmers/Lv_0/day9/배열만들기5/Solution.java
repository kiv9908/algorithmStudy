package programmers.Lv_0.day9.배열만들기5;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public List<Integer> solution(String[] intStrs, int k, int s, int l) {
		List<Integer> answer = new ArrayList<Integer>();

		for (int i = 0; i < intStrs.length; i++) {

			// s부터 l까지 문자열 잘라내기

			// 자른 문자열 int로 변환 후 k와 비교하기
			if (k < Integer.parseInt(intStrs[i].substring(s, s + l))) {
				answer.add(Integer.parseInt(intStrs[i].substring(s, s + l)));
			}

			// k보다 큰 값들을 담은 배열을 리턴

		}
		return answer;
	}
}