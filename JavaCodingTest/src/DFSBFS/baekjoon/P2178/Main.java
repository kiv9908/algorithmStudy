package DFSBFS.baekjoon.P2178;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	// 방향 정의
	// 하 우 상 좌
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };
	static boolean[][] visited;
	static int[][] A;
	static int N, M;

	public static void main(String[] arg) throws IOException {

		// 입력 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		A = new int[N][M];
		visited = new boolean[N][M];

		// 입력한 값으로 2차원 배열 만들기
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			for (int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(line.substring(j, j + 1));

			}
		}

		BFS(0, 0);
		System.out.println(A[N - 1][M - 1]); // 인덱스가 0부터 시작하니까!

	}

	private static void BFS(int i, int j) {
		// BFS는 Queue로 구현
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.offer(new int[] { i, j });
		// 방문한 노드에 true
		visited[i][j] = true;

		// 큐가 비면 반복을 멈춘다
		while (!queue.isEmpty()) {
			// 큐에서 하나를 꺼낸다
			int now[] = queue.poll();
			// 상 하 좌 우 탐색
			for (int k = 0; k < 4; k++) {
				int x = now[0] + dx[k];
				int y = now[1] + dy[k];
				// 배열 안에서만 확인 가능하게 제한
				if (x >= 0 && y >= 0 && x < N && y < M) {
					// 0이 아니고 방문한 적이 없다면(탐색 가능 한 곳 기준)
					if (A[x][y] != 0 && !visited[x][y]) {
						// true로 바꾸고
						visited[x][y] = true;
						A[x][y] = A[now[0]][now[1]] + 1; // 이전 depth 보다 1 크게
						// 다음 노드를 큐에 다시 넣는다
						queue.add(new int[] { x, y });
					}
				}
			}
		}

	}

}
