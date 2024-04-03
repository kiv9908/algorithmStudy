package Lv0.day6.수열과구간쿼리3;

class Solution {
	public int[] solution(int[] arr, int[][] queries) {
//		int[] answer = new int[arr.length];

		for (int i = 0; i < queries.length; i++) {

			int x = arr[queries[i][0]];
			int y = arr[queries[i][1]];

			arr[queries[i][0]] = y;
			arr[queries[i][1]] = x;
		}

		return arr;
	}
}