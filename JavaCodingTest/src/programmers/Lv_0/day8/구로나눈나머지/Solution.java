package programmers.Lv_0.day8.구로나눈나머지;

class Solution {
	public int solution(String number) {
		int answer = 0;
		int sum = 0;

		for (int i = 0; i < number.length(); i++) {

			answer += Integer.parseInt(String.valueOf(number.charAt(i)));

		}
		return answer %= 9;
	}
}
