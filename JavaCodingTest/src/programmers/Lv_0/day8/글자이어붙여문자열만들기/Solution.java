package programmers.Lv_0.day8.글자이어붙여문자열만들기;

class Solution {
	public String solution(String my_string, int[] index_list) {
		String answer = "";

		for (int i : index_list) {
			answer += my_string.charAt(i);
		}

		return answer;
	}
}