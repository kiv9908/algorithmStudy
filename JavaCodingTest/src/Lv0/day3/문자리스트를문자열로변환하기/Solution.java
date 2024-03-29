package Lv0.day3.문자리스트를문자열로변환하기;

class Solution {
	public String solution(String[] arr) {
		String answer = "";

//		for (String i : arr) {
//			answer += i;
//		}

		answer = String.join("", arr);
		return answer;
	}
}