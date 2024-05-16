package programmers.Lv_0.day17.문자열이몇번등장하는지세기;

class Solution {
	public int solution(String myString, String pat) {
		int answer = 0;
		for (int i = myString.length(); i >= 0; i--) {
			if (myString.substring(0, i).endsWith(pat)) {
				answer += 1;
			}
		}
		return answer;
	}
}