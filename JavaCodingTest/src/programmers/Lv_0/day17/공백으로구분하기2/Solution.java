package programmers.Lv_0.day17.공백으로구분하기2;

class Solution {
	public String[] solution(String my_string) {
		String[] answer = {};

		answer = my_string.trim().split("\\s+");

		return answer;
	}
}