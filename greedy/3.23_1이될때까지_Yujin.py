N,K = map(int,input().split())
num=0
while N > 1:
    if N % K == 0 :
        num += 1
        N = N//K
    else:
        N -= 1
        num += 1
print(num)