package programmers.Lv_0.day5.원소들의곱과합;

class Solution {
	public int solution(int[] num_list) {
		int answer = 0;
		int sum = 0;
		int mul = 1;

		for (int i : num_list) {
			sum += i;
			mul *= i;
		}

//        return (Arrays.stream(numList).reduce((acc, i) -> acc * i).getAsInt() < Math.pow(Arrays.stream(numList).sum(), 2)) ? 1 : 0;
// 		  .getAsInt(): 최종 결과로 나온 OptionalInt에서 정수값을 가져옵니다.

		answer = mul < sum * sum ? 1 : 0;

		return answer;
	}
}