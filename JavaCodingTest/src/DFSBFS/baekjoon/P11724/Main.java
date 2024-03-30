package DFSBFS.baekjoon.P11724;
// DFS 깊이 우선 탐색

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	// 방문 기록 저장 배열
	static boolean[] visited;
	static ArrayList<Integer>[] A;

	public static void main(String[] args) throws IOException {

		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		// 그래프 데이터 저장 인접 리스트
		A = new ArrayList[n + 1];

		// 방문 기록 저장 배열
		visited = new boolean[n + 1];

		// 인접리스트를 저장할 수 있게 노드별 공간 마련
		for (int i = 1; i < n + 1; i++) {
			A[i] = new ArrayList<Integer>();
		}

		// 입력 값을 인접리스트에 추가
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());

			A[s].add(e);
			A[e].add(s);

		}

		int count = 0;

		// 방문 여부 확인 후 DFS 실행
		for (int i = 1; i < n + 1; i++) {
			// 방문 안한 경우
			if (!visited[i]) {
				count++;
				DFS(i);
			}
		}

		System.out.println(count);

	}

	public static void DFS(int v) {
		if (visited[v]) {
			return;
		}

		visited[v] = true;
		for (int i : A[v]) {
			if (!visited[i]) {
				DFS(i);
			}
		}

	}
}
