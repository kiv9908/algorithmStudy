package programmers.Lv_0.day3.더크게합치기;

class Solution {
	public int solution(int a, int b) {
		int answer = 0;

		String ab = "" + a + b;
		String ba = "" + b + a;

		answer = (Integer.parseInt(ab) > Integer.parseInt(ba) ? Integer.parseInt(ab) : Integer.parseInt(ba));

		return answer;
	}
}
