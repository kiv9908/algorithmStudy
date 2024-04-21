package programmers.Lv_0.day13.n개간격의원소들;

class Solution {
	public int[] solution(int[] num_list, int n) {
		int[] answer = new int[(int) Math.ceil(num_list.length / (n * 1.0))];

		int index = 0;

		for (int i = 0; i < num_list.length; i += n) {
			answer[index++] = num_list[i];
		}

		return answer;
	}

}