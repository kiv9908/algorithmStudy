package programmers.Lv_0.day16.배열에서문자열대소문자변환하기;

class Solution {
	public String[] solution(String[] strArr) {

		for (int i = 0; i < strArr.length; i++) {
			if (i % 2 == 0) {
				strArr[i] = strArr[i].toLowerCase();
			} else {
				strArr[i] = strArr[i].toUpperCase();
			}
		}

		return strArr;
	}
}