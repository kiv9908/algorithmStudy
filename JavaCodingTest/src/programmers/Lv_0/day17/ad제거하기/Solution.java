package programmers.Lv_0.day17.ad제거하기;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public String[] solution(String[] strArr) {
		String[] answer;
		List<String> list = new ArrayList<String>();

		for (int i = 0; i < strArr.length; i++) {
			if (!(strArr[i].contains("ad"))) {
				list.add(strArr[i]);
			}
		}

		answer = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}