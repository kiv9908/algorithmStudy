package Lv0.day3.두수의연산값비교하기;

class Solution {
	public int solution(int a, int b) {
		int answer = 0;

		int ab = Integer.parseInt("" + a + b);
		int ab2 = a * b * 2;

		answer = (ab < ab2 ? ab2 : ab);

		return answer;
	}
}
