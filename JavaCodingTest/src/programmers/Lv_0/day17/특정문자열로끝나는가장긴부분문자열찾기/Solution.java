package programmers.Lv_0.day17.특정문자열로끝나는가장긴부분문자열찾기;

class Solution {
	public String solution(String myString, String pat) {
		String answer = "";

		if (myString.endsWith(pat)) {

			if (myString.length() >= pat.length()) {
				answer = myString;
			}
		}

		return answer;
	}
}