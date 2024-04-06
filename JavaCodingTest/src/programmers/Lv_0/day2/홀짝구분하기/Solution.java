package programmers.Lv_0.day2.홀짝구분하기;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

//		if (n % 2 == 0) {
//			System.out.println(n + " is even");
//		} else {
//			System.out.println(n + " is odd");
//		}

		// 삼항연산자
		System.out.println(n + " is " + (n % 2 == 0 ? "even" : "odd"));

	}
}