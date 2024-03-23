# 배열의 크기 n
# 숫자가 더해지는 횟수 m
# 연속 더하기 가능 횟수 k

n, m, k = map(int, input().split())

data = list(map(int, input().split()))

data.sort(reverse=True)
count = 0
answer = 0

# 가장 큰 수 data[0]

# 두번째로 큰 수 data[1]

while (count!=m):
    for i in range(k):
        if count == m:
            break
        answer += data[0]
        count+=1
    
    answer += data[1]
    count+=1

print(answer)