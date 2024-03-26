

# A 시간당 일하면 쌓이는 피로도 , 음수로 내려가면 0이된다
# B 시간당 처리 가능한 일의 양
# C 한시간 쉬었을 때 줄어드는 피로 양 
# M 피로도 최대치, 넘어가며 끝남 

# 하루에 일할 수 있는 최대 양 24시간

A, B, C, M = map(int, (input().split(" ")))

piro = 0
work = 0

for _ in range(24):
  # 피로가 최대치 이상이거나, 일하면 쌓이는 피로도가 피로도 최대치보다 큰 경우
  if piro > M or A>M:
    break
  # 현재 피로도에서 일을 하면 최대치를 넘는 경우 또는 현재 피로도가 이미 최대인 경우
  elif piro + A > M or piro==M:
    piro -= C
    # 피로도가 음수가 되는 경우, 피로도를 0으로 세팅
    if piro < 0:
      piro = 0
    
  else:
    # 그 외 모든 일할 수 있는 경우에는 시간당 피로가 쌓이고, 일한양을 work에 더한다
    piro += A
    work += B
  print(piro)

print(work)