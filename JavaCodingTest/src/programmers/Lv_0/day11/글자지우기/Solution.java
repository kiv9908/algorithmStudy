package programmers.Lv_0.day11.글자지우기;

class Solution {
	public String solution(String my_string, int[] indices) {

		String answer = "";
		String[] str = new String[my_string.length()];

		for (int i = 0; i < my_string.length(); i++) {
			str[i] = String.valueOf(my_string.charAt(i));
		}

		for (int j = 0; j < str.length; j++) {
			for (int k = 0; k < indices.length; k++) {
				if (indices[k] == j) {
					str[j] = "0";
				}
			}
		}

		for (int j = 0; j < str.length; j++) {
			if (!"0".equals(str[j])) {
				answer += str[j];
			}
		}

		return answer;
	}
}