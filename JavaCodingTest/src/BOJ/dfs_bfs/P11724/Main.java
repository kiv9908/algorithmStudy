package BOJ.dfs_bfs.P11724;
// DFS 깊이 우선 탐색

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	// 방문 기록 저장 배열
	static int[] visited;
	static ArrayList<Integer>[] A;
	static ArrayList<Integer> C = new ArrayList<Integer>();
	static int n, m, sum, min;

	public static void main(String[] args) throws IOException {

		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		// 그래프 데이터 저장 인접 리스트
		A = new ArrayList[n + 1];

		// 방문 기록 저장 배열

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

		for (int i = 1; i < n + 1; i++) {
			visited = new int[n + 1];
			sum = 0;
			BFS(i);

			for (int j = 0; j < visited.length; j++) {
				sum += visited[j];
				System.out.print(visited[i]);
				System.out.println();
			}

			C.add(sum);

//			for (int j : visited) {
//				System.out.print(j);
//			}

		}

		for (int i = 0; i < C.size(); i++) {
			System.out.println(C.get(i));
			if (i == 1) {
				min = C.get(i);
			} else {
				if (min > C.get(i)) {
					min = C.get(i);
				}
			}

		}
		System.out.println(C.indexOf(min) + 1);
	}

	private static void BFS(int b) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(b);

		visited[b] = 1;
		while (!queue.isEmpty()) {
			int now = queue.poll();

			for (int j : A[now]) {

				if (visited[j] == 0) {
					visited[j] = visited[now] + 1;
					queue.add(j);
				}

			}

		}

	}
}
