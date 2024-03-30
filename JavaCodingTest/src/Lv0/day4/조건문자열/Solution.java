package Lv0.day4.조건문자열;

class Solution {
	public int solution(String ineq, String eq, int n, int m) {
		int answer = 0;

		if (n > m && ">".equals(ineq) && "!".equals(eq)) {
			answer = 1;
		} else if (n < m && "<".equals(ineq) && "!".equals(eq)) {
			answer = 1;
		} else if (n <= m && "<".equals(ineq) && "=".equals(eq)) {
			answer = 1;
		} else if (n >= m && ">".equals(ineq) && "=".equals(eq)) {
			answer = 1;
		}

		return answer;
	}
}