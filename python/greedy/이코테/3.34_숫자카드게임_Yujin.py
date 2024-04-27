N,M=map(int,input().split())
min_num = []
for i in range(N):
    input_list = list(map(int,input().split()))
    min_num.append(min(input_list))
print(max(min_num))