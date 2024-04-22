package programmers.Lv_0.day14.수열구간과쿼리1;

class Solution {
	public int[] solution(int[] arr, int[][] queries) {
		int[] answer = {};

		for (int j = 0; j < queries.length; j++) {
			int s = queries[j][0];
			int e = queries[j][1];
			for (int i = 0; i < arr.length; i++) {
				if (i >= s && i <= e) {
					arr[i] += 1;
				}

			}
		}

		answer = arr;
		return answer;
	}
}
//
//class Solution {
//    public int[] solution(int[] arr, int[][] queries) {
//        int[] answer = {};
//
//        for(int i=0; i<queries.length; i++){
//
//            for(int j=queries[i][0]; j<=queries[i][1]; j++){
//                arr[j]++;
//            }
//        }
//
//        return arr;
//    }
//}