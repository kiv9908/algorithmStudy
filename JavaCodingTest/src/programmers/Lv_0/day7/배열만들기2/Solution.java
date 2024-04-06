package Lv0.day7.배열만들기2;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public List<Integer> solution(int l, int r) {

		List<Integer> answer = new ArrayList<>();
		for (int i = l; i < r + 1; i++) {
			String num = "";
			for (int j = 0; j < String.valueOf(i).length(); j++) {

				if (String.valueOf(i).charAt(j) != '5' & String.valueOf(i).charAt(j) != '0') {

					break;
				} else {
					num += String.valueOf(i).charAt(j);
					System.out.println(i + " : " + num);
				}

				if (Integer.parseInt(num) == i) {
					answer.add(i);
				}
			}

		}

		if (answer.isEmpty()) {
			answer.add(-1);
		}
		return answer;

	}

}