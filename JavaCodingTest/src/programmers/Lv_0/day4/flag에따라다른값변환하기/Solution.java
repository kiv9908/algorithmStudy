package Lv0.day4.flag에따라다른값변환하기;

class Solution {
	public int solution(int a, int b, boolean flag) {
		int answer = 0;

		answer = flag == true ? a + b : a - b;

		return answer;
	}
}