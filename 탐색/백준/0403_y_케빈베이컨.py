from collections import deque
n,m = map(int,input().split())
ab_list=[]
node_list = [[] for _ in range(n+1)]
for _ in range(m):
  a,b = map(int,input().split())
  ab_list.append([a,b])


for a,b in ab_list:
  node_list[a].append(b)
  node_list[b].append(a)



def bfs(start):
    visited = [-1] * (n + 1)  
    visited[start] = 0 
    queue = deque([start])

    while queue:
        v = queue.popleft()
        for i in node_list[v]:
            if visited[i] == -1:  
                visited[i] = visited[v] + 1
                queue.append(i)
    return sum(filter(lambda x: x >= 0, visited))  

result = float('inf')
min_kevin_man = -1

for i in range(1, n+1):
    kevin = bfs(i)
    if kevin < result:
        result = kevin
        min_kevin_man = i

print(min_kevin_man)