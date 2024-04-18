package programmers.Lv_0.day12.리스트자르기;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public int[] solution(int n, int[] slicer, int[] num_list) {

		List<Integer> list = new ArrayList<>();

		if (n == 1) {
			// num_list의 0번 인덱스부터 slicer[1]번 인덱스까지

			for (int i = 0; i <= slicer[1]; i++) {
				list.add(num_list[i]);
			}

		} else if (n == 2) {
			// num_list의 slicer[0]번 인덱스부터 마지막 인덱스까지

			for (int i = slicer[0]; i < num_list.length; i++) {
				list.add(num_list[i]);
			}

		} else if (n == 3) {
			// num_list의 slicer[0]번 인덱스부터 slicer[1]번 인덱스까지

			for (int i = slicer[0]; i <= slicer[1]; i++) {
				list.add(num_list[i]);
			}
		} else if (n == 4) {
			// num_list의 slicer[0]번 인덱스부터 slicer[1]번 인덱스까지 slicer[2]간격으로

			for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
				list.add(num_list[i]);
			}

		}
		int[] answer = list.stream().mapToInt(x -> x).toArray();
		return answer;

	}

}