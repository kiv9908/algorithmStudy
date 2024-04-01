package Lv0.day6.마지막두원소;

class Solution {
	public int[] solution(int[] num_list) {
		// 배열 선언 [ ] 안에 배열 개수 쓰기
		int[] answer = new int[num_list.length + 1];

		for (int i = 0; i < num_list.length; i++) {
			answer[i] = num_list[i];

		}
		// 배열의 맨 마지막 인덱스는 길이 -1 (인덱스가 0부터 시작하기 때문)
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