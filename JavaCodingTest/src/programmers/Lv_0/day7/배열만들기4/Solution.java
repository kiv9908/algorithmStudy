package programmers.Lv_0.day7.배열만들기4;

import java.util.ArrayList;
import java.util.List;

class Solution {

	public List<Integer> solution(int[] arr) {

		List<Integer> stk = new ArrayList<Integer>();
		int i = 0;

		while (i < arr.length) {

			if (stk.isEmpty()) {
				stk.add(arr[i]);

				i++;

			}

			else {
				if (stk.get(stk.size() - 1) < arr[i]) {
					stk.add(arr[i]);

					i++;

				}

				else if (stk.get(stk.size() - 1) >= arr[i]) {
					stk.remove(stk.size() - 1);

				}
			}

		}

		return stk;
	}
}
