package DFSBFS.baekjoon.b_0330_DFS와BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;
	static int V;
	static ArrayList<Integer>[] A;
	static boolean[] visited;
	static boolean[] visited2;

	static String Dfs = "";
	static String Bfs = "";

	public static void main(String[] args) throws IOException {

		// N,M,V 입력 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());

		// 인접 리스트
		A = new ArrayList[N + 1];
		// DFS 방문 리스트
		visited = new boolean[N + 1];

		// DFS 인접 리스트 공간 생성
		for (int i = 1; i < N + 1; i++) {
			A[i] = new ArrayList<Integer>();
		}

		// DFS 인접 리스트에 값 추가
		for (int i = 0; i < M; i++) {

			st = new StringTokenizer(br.readLine());

			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());

			A[s].add(e);
			A[e].add(s);

		}

		// 오름차순으로 정렬 (이 문제의 핵심!!)
		for (int i = 1; i < N + 1; i++) {
			A[i].sort(Comparator.naturalOrder());
		}

		// DFS 실행
		if (!visited[V]) {
			DFS(V);
		}
		// DFS 출력 (핵심)
		System.out.println(Dfs.substring(0, Dfs.length() - 1));

		// DFS 방문 리스트
		visited2 = new boolean[N + 1];

		// BFS 실행
		if (!visited2[V]) {
			BFS(V);
		}
		// BFS 출력
		System.out.println(Bfs.substring(0, Bfs.length() - 1));

	}

	// DFS 구현
	private static void DFS(int d) {

		if (visited[d]) {
			return;
		}
		visited[d] = true;
		// 방문한 노드 기록
		Dfs += (d + " ");

		for (int k : A[d]) {
			if (!visited[k]) {

				DFS(k);
			}
		}
	}

	private static void BFS(int b) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(b);

		visited2[b] = true;
		while (!queue.isEmpty()) {
//			for (int i : queue) {
//				System.out.print(i);
//			}
//			System.out.println();

			int now = queue.poll();
//			System.out.println(now);

			Bfs += (now + " ");
			for (int j : A[now]) {

				if (!visited2[j]) {
					visited2[j] = true;
					queue.add(j);
				}

			}

		}

	}

}
