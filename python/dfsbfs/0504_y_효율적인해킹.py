#시간초과
from collections import deque
import sys
input = sys.stdin.readline

n,m = map(int,input().split())
relationship = [[]for _ in range(n+1)]

for _ in range(m):
    a,b = map(int, input().split())
    relationship[b].append(a)

def bfs(start):
    q = deque()
    q.append(start)
    num = 0

    visited = [False] * (n+1)
    visited[start] = True

    while q:
        current = q.popleft()
        for next in relationship[current]:
            if not visited[next]:
                visited[next] = True
                q.append(next)
                num += 1
    return num

result = []
for start in range(1, len(relationship)):
    result.append(bfs(start))

for i in range(len(result)):
    if max(result) == result[i]:
        print(i+1)

