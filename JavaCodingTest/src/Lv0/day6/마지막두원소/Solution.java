package Lv0.day6.마지막두원소;

class Solution {
	public int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length + 1];

		for (int i = 0; i < num_list.length; i++) {
			answer[i] = num_list[i];

		}

		int last = num_list[num_list.length - 1];
		int lastt = num_list[num_list.length - 2];

		if (last > lastt) {
			answer[answer.length - 1] = last - lastt;
		} else {
			answer[answer.length - 1] = last * 2;
		}

		return answer;
	}

}