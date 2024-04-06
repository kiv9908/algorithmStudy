package BOJ.dfs_bfs.P2583_영역구하기;
// https://www.acmicpc.net/problem/2583

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	// 방향 정의
	// 하 우 상 좌
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };
	static int[][] visited;
	static int[][] A;
	static int N, M, K;
	static int count;
	static List<Integer> list = new ArrayList<Integer>();
	static int area;

	public static void main(String[] args) throws IOException {
		// 입력 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		A = new int[M][N];

		// 사각형 시작, 끝 좌표 입력 받기
		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int xs = Integer.parseInt(st.nextToken());
			int ys = Integer.parseInt(st.nextToken());
			int xe = Integer.parseInt(st.nextToken());
			int ye = Integer.parseInt(st.nextToken());

			// 사각형 꼭짓점 좌표 -> 배열 속 위치에 색칠(1표시)
			for (int y = ys; y < ye; y++) {
				for (int x = xs; x < xe; x++) {
					// 행
					A[y][x] = 1;
				}

			}
		}
		visited = A.clone();

		for (int i = 0; i < M; i++) {
//			System.out.println(Arrays.toString(A[i]));

			for (int j = 0; j < N; j++) {

				if (A[i][j] == 0 && visited[i][j] == 0) {
					area = 0;
					BFS(i, j);
					list.add(area);
					count++;
				}

			}

		}

		System.out.println(count++);
		list.sort(Comparator.naturalOrder());
		for (int i = 0; i < list.size(); i++) {
			if (i == list.size() - 1) {
				System.out.print(list.get(i));
			} else {
				System.out.print(list.get(i) + " ");
			}

		}

	}

	private static void BFS(int i, int j) {
		// BFS는 Queue로 구현
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.offer(new int[] { i, j });
		// 방문한 노드에 true
		visited[i][j] = 1;

		// 큐가 비면 반복을 멈춘다
		while (!queue.isEmpty()) {

			// 큐에서 하나를 꺼낸다
			int now[] = queue.poll();
			area++;
			// 상 하 좌 우 탐색
			for (int k = 0; k < 4; k++) {
				int x = now[0] + dx[k];
				int y = now[1] + dy[k];
				// 배열 안에서만 확인 가능하게 제한
				if (x >= 0 && y >= 0 && x < M && y < N) {
					// 0이 아니고 방문한 적이 없다면(탐색 가능 한 곳 기준)
					if (visited[x][y] == 0) {
						// true로 바꾸고
						visited[x][y] = 1;

						// 다음 노드를 큐에 다시 넣는다
						queue.add(new int[] { x, y });

					}
				}
			}
		}

	}

}
