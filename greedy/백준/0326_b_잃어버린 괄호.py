a = str(input())
answer = 0
# -만 있는 식으로 만들면 최소가 됨
# ( +   + )  -  (  + )  -  ( ) ...
# -를 기준으로 문자열 분리
a = a.split('-')
# 분리한 문자열은 str 형태의 숫자와 +식이 포함된 덧셈식
# 첫 항에 나머지 항 모두 빼기
for i in range(len(a)):
    if i == 0:
        b = sum(map(int,(a[i].split("+"))))
        # 첫 항만 answer에 더해준다
        answer += b
    else:
        b = sum(map(int,(a[i].split("+"))))
        # 나머지 항을 다 빼준다
        answer -= b
print(answer)