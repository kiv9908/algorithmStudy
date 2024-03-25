def solution(num_list):
    answer = 0
    
    num_eval = ""
    num_odd = ""
    
    for i in num_list:
        if i % 2 == 0:
            num_eval += str(i)
        else:
            num_odd += str(i)
            
    answer = int(num_eval)+int(num_odd)
    
    return answer