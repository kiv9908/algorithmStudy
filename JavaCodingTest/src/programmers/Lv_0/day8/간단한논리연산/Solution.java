package programmers.Lv_0.day8.간단한논리연산;

class Solution {
	public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
		boolean answer = true;

		answer = (x1 || x2) && (x3 || x4);

		return answer;
	}
}