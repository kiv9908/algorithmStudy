package programmers.Lv_0.day8.문자열여러번뒤집기;

class Solution {
	public String solution(String my_string, int[][] queries) {
		StringBuilder str = new StringBuilder(my_string);

		for (int i = 0; i < queries.length; i++) {
			int start = queries[i][0];
			int end = queries[i][1];

			StringBuilder mid = new StringBuilder(str.substring(start, end + 1));
			mid.reverse();
			str.replace(start, end + 1, mid.toString());

		}
		return str.toString();
	}
}