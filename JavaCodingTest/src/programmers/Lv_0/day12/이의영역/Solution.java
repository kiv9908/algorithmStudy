package programmers.Lv_0.day12.이의영역;

class Solution {
	public int[] solution(int[] arr) {

		int start = 0;
		int end = 0;

		// 2시작 인덱스 찾기
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 2) {
				start = i;
				break;
			}
		}

		// 2종료 인덱스 찾기
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == 2) {
				end = i;
				break;
			}
		}

		int[] answer = new int[end - start + 1];
		for (int i = start; i < end + 1; i++) {
			answer[i - start] = arr[i];
		}

		if (start == 0 && end == 0) {
			answer[0] = -1;
		}

		return answer;
	}
}