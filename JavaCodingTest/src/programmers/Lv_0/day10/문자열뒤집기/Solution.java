package programmers.Lv_0.day10.문자열뒤집기;

class Solution {
	public String solution(String my_string, int s, int e) {
		String answer = "";
		StringBuilder str = new StringBuilder(my_string.substring(s, e + 1));

		answer = my_string.substring(0, s) + str.reverse().toString() + my_string.substring(e + 1);

		return answer;
	}
}