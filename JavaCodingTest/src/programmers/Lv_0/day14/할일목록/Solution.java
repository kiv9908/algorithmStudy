package programmers.Lv_0.day14.할일목록;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public String[] solution(String[] todo_list, boolean[] finished) {

		List<String> list = new ArrayList<>();

		for (int i = 0; i < finished.length; i++) {
			if (!finished[i]) {
				list.add(todo_list[i]);
			}
		}

		String[] answer = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}

//class Solution {
//    public String[] solution(String[] todo_list, boolean[] finished) {
//        String str = "";
//        for(int i=0; i<finished.length; i++){
//            str = finished[i]==false ? str+todo_list[i]+"," : str;
//        }
//
//        return str.split(",");
//    }
//}