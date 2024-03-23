# n * m 입력
# 행렬 값 입력

n, m = map(int,input().split())

min_data = []

for i in range(n):
    data = list(map(int,input().split()))
    min_data.append(min(data))

min_data.sort()
print(min_data[-1])