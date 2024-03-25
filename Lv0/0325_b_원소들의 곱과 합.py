def solution(num_list):
    
    answer = 0
    
    lstSum = sum(num_list)**2
    lstSquare = 1
    
    for i in num_list:
        lstSquare *= i
        
    return int(lstSquare < sum(num_list) ** 2)
        
    return answer
