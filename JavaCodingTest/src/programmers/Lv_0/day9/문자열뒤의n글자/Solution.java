package programmers.Lv_0.day9.문자열뒤의n글자;

class Solution {
	public String solution(String my_string, int n) {

		// P r o g r a m m e r S 1 2 3
		// 0 1 2 3 4 5 6 7 8 9 10 11 12 13
		// 뒤에서 11 번째 = 앞에서 length(14)-11=3번째
		String answer = "";

		answer = my_string.substring(my_string.length() - n);

		return answer;
	}
}