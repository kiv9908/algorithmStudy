package Lv0.day2.문자열돌리기;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();

		// indexOf 안됩니다.
		for (int i = 0; i < a.length(); i++) {
			System.out.println(a.charAt(i));
		}
	}
}