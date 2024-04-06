package programmers.Lv_0.day3.문자열섞기;

class Solution {
	public String solution(String str1, String str2) {
		String answer = "";

//		int a = 0;
//		int b = 0;

//		for (int i = 0; i < str1.length()+str2.length(); i++) {
//			if (i % 2 == 0 || i == 0) {
//				answer += str1.charAt(a);
//				a++;
//			} else {
//				answer += str2.charAt(b);
//				b++;
//			}
//
//			
//		}

		for (int i = 0; i < str1.length(); i++) {
			answer += str1.charAt(i);
			answer += str2.charAt(i);
		}

		return answer;
	}
}
