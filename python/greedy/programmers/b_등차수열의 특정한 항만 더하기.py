def solution(a, d, included):
    answer = 0
    lst = []
    
    for i in range(len(included)):
        lst.append(a+d*i)

    for j in range(len(included)):
        if included[j] == True:
            answer += lst[j]
        
        
    
    return answer