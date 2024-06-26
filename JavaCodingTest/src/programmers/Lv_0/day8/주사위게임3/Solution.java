package programmers.Lv_0.day8.주사위게임3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class Solution {
	public int solution(int a, int b, int c, int d) {
		double answer = 0;

		List<Integer> abcd = new ArrayList<>();
		abcd.add(a);
		abcd.add(b);
		abcd.add(c);
		abcd.add(d);

		Set<Integer> set = new HashSet<>();
		set.add(a);
		set.add(b);
		set.add(c);
		set.add(d);

		// iterator 생성
		Iterator<Integer> it = set.iterator();

		if (set.size() == 1) {
			answer = 1111 * a;

		} else if (set.size() == 2) {
			// set으로 변환하고 리스트에 추가
			List<Integer> list = new ArrayList<>();
			while (it.hasNext()) {
				list.add(it.next());
			}
			List<Integer> list2 = new ArrayList<>();
			int p3 = 0;
			int q1 = 0;

			for (int i = 0; i < list.size(); i++) {
				if (Collections.frequency(abcd, list.get(i)) == 2) {
					list2.add(list.get(i));
				} else if (Collections.frequency(abcd, list.get(i)) == 3) {
					p3 = list.get(i);
				} else {
					q1 = list.get(i);
				}
			}
			// 2개 2개인 경우
			if (list2.isEmpty()) {
				// 3개 1개인 경우
				answer = (p3 * 10 + q1) * (p3 * 10 + q1);
			} else {

				int p = list2.get(0);
				int q = list2.get(1);
				answer = (p + q) * Math.abs(p - q);
			}
		}

		else if (set.size() == 3) {

			List<Integer> list = new ArrayList<>();
			while (it.hasNext()) {
				list.add(it.next());
			}

			for (int i = 0; i < list.size(); i++) {
				if (Collections.frequency(abcd, list.get(i)) == 2) {
					list.remove(i);
				}
			}

			// 2개 1개 1개 인경우 1개나온것끼리만 곱함

			answer = list.get(0) * list.get(1);

		}

		else if (set.size() == 4) {
			List<Integer> list = new ArrayList<>();
			while (it.hasNext()) {
				list.add(it.next());
			}

			list.sort(Comparator.naturalOrder());
			answer = list.get(0);
		}

		return (int) answer;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(4, 1, 4, 4));
	}
}