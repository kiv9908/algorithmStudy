package programmers.Lv_0.day2.덧셈식출력하기;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a + b;

		System.out.println(a + " + " + b + " = " + sum);
	}
}