package programmers.Lv_0.day17.공백으로구분하기2;

class Solution {
	public String[] solution(String my_string) {
		String[] answer = {};
		// 정규식 표현 사용하기
		answer = my_string.trim().split("\\s+");

		return answer;
	}
}