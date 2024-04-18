package programmers.Lv_0.day12.배열만들기3;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public int[] solution(int[] arr, int[][] intervals) {
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < intervals.length; i++) {
			int a = intervals[i][0];
			int b = intervals[i][1];
			for (int j = a; j < b + 1; j++) {
				list.add(arr[j]);
			}
		}
		int[] answer = list.stream().mapToInt(x -> x).toArray();
		return answer;
	}
}