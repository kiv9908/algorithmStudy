package programmers.Lv_0.day5.코드처리하기;

class Solution {
	public String solution(String code) {
		String answer = "";
		int mode = 0;

		for (int i = 0; i < code.length(); i++) {
			if (mode == 0) {
				if (!String.valueOf(code.charAt(i)).equals("1")) {
					if (i % 2 == 0) {
						answer += code.charAt(i);
					}
				} else if (String.valueOf(code.charAt(i)).equals("1")) {
					mode = 1;
				}

			} else if (mode == 1) {
				if (!String.valueOf(code.charAt(i)).equals("1")) {
					if (i % 2 != 0) {
						answer += code.charAt(i);
					}
				} else if (String.valueOf(code.charAt(i)).equals("1")) {
					mode = 0;
				}
			}
		}
		if (answer.isEmpty()) {
			return "EMPTY";
		}
		return answer;
	}
}