package programmers.Lv_0.day11.문자개수세기;

class Solution {
	public int[] solution(String my_string) {
		int[] answer = new int[52];

		// A 65 a 97

		for (int i = 0; i < my_string.length(); i++) {

			if (Character.isUpperCase(my_string.charAt(i))) {
				answer[my_string.charAt(i) - 65] += 1;
			} else if (Character.isLowerCase(my_string.charAt(i))) {
				answer[my_string.charAt(i) - 97 + 26] += 1;
			}

		}

		return answer;
	}
}