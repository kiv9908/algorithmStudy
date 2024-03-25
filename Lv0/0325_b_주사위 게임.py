def solution(a, b, c):
    answer = 0
    
    check = len(set([a,b,c]))
    
    if check == 3:
        answer = a+b+c
        
    # a,b,c 2개만 같은 값    
    elif check == 2:
        answer = (a+b+c)*(a**2+b**2+c**2)
    
    # a,b,c 모두 같은 값
    elif check == 1:
        answer = (a*3)*((a**2)*3)*((a**3)*3)
    
    return answer