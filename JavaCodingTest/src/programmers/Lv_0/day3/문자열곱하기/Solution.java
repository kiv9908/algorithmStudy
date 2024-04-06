package Lv0.day3.문자열곱하기;

class Solution {
	public String solution(String my_string, int k) {
		String answer = "";

//        for (int i = 0; i<k;i++) {
//        	answer+= my_string;
//        }
//        
		answer = my_string.repeat(k);
		return answer;
	}
}