package programmers.Lv_0.day15.원하는문자열찾기;

class Solution {
	public int solution(String myString, String pat) {
		int answer = 0;

		answer = myString.toUpperCase().contains(pat.toUpperCase()) ? 1 : 0;
		return answer;
	}
}