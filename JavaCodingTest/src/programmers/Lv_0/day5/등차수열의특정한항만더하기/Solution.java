package Lv0.day5.등차수열의특정한항만더하기;

class Solution {
	public int solution(int a, int d, boolean[] included) {
		int answer = 0;

		for (int i = 0; i < included.length; i++) {
			if (included[i]) {
				answer += d * i + a;
			}
		}

//		return IntStream.range(0, included.length).map(idx -> included[idx] ? a + (idx * d) : 0).sum();

		return answer;
	}
}