package programmers.Lv_0.day6.수조작하기1;

class Solution {
	public int solution(int n, String control) {
		int answer = 0;

		for (int i = 0; i < control.length(); i++) {
			if ("w".equals(String.valueOf(control.charAt(i)))) {
				n += 1;
			} else if ("s".equals(String.valueOf(control.charAt(i)))) {
				n -= 1;
			} else if ("d".equals(String.valueOf(control.charAt(i)))) {
				n += 10;
			} else if ("a".equals(String.valueOf(control.charAt(i)))) {
				n -= 10;
			}
		}
		answer = n;

		return answer;
	}
}