package programmers.Lv_0.day15.조건에맞게수열변환하기2;

class Solution {
	public int[] solution(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 50 && arr[i] % 2 == 0) {
				arr[i] /= 2;
			} else if (arr[i] < 50 && arr[i] % 2 != 0) {
				arr[i] = arr[i] * 2 + 1;
			}
		}

		return arr;
	}
}
