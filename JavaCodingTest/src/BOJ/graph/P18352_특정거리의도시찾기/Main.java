package BOJ.graph.P18352_특정거리의도시찾기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int visited[];
	static ArrayList<Integer>[] A;
	static int N, M, K, X;
	static List<Integer> answer;

	public static void main(String[] args) {
		/*
		 * 도시의 개수 N 도로의 개수 M 거리 정보 K 출발 도시의 번호 X A B 식으로 입력 받음(A,B는 도시) 최단거리가 K인 도시가 없으면
		 * -1 출력 인접리스트 -> BFS 탐색, 방문리스트에 0부터 1씩 증가하게 표시하기
		 */

		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		M = scan.nextInt();
		K = scan.nextInt();
		X = scan.nextInt();
		A = new ArrayList[N + 1];
		answer = new ArrayList<Integer>();

		for (int i = 1; i <= N; i++) {
			A[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < M; i++) {
			int S = scan.nextInt();
			int E = scan.nextInt();
			A[S].add(E);
		}

		visited = new int[N + 1];
		for (int i = 0; i <= N; i++) {
			visited[i] = -1;
		}

		BFS(X);
		for (int i = 0; i <= N; i++) {
			if (visited[i] == K) {
				answer.add(i);
			}
		}
		if (answer.isEmpty()) {
			System.out.println("-1");
		} else {
			Collections.sort(answer);
			for (int temp : answer) {
				System.out.println(temp);
			}
		}
	}

	private static void BFS(int Node) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(Node);
		// 첫 방문한 노드 방문 표시 -1 + 1 = 0
		visited[Node]++;
		while (!queue.isEmpty()) {
			int now_Node = queue.poll();
			for (int i : A[now_Node]) {
				// 방문한 노드와 연결된 모든 노드에 이전 노드보다 +1 만큼 방문표시
				if (visited[i] == -1) {
					visited[i] = visited[now_Node] + 1;
					queue.add(i);
				}
			}
		}

	}

}
