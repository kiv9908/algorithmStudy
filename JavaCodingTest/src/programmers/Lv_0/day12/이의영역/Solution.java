package programmers.Lv_0.day12.이의영역;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public int[] solution(int[] arr) {
		List<Integer> list = new ArrayList<>();
		int a = 0;
		int b = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 2) {
				list.add(arr[i]);

				for (int j = i; j < arr.length; j++) {
					if (arr[j] != 2) {
						list.add(arr[j]);
					} else {
						list.add(arr[j]);
						break;
					}
				}

			}
		}
		int[] answer = list.stream().mapToInt(x -> x).toArray();
		return answer;
	}
}