package Lv0.day5.이어붙인수;

class Solution {
	public int solution(int[] num_list) {
		int answer = 0;
		String e = "";
		String o = "";

		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] % 2 == 0) {
				e += num_list[i];
			} else if (num_list[i] % 2 != 0) {
				o += num_list[i];
			}
		}
		return answer = Integer.parseInt(o) + Integer.parseInt(e);
	}
}