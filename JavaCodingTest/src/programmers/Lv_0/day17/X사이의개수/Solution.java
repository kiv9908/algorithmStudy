package programmers.Lv_0.day17.X사이의개수;

class Solution {
	public int[] solution(String myString) {
		String[] arr = myString.split("x", myString.length());
		int[] answer = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			answer[i] = arr[i].length();
		}

		return answer;
	}
}