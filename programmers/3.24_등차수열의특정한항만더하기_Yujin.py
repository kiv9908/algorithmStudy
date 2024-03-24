def solution(a, d, included):
    answer_list=[a]
    answer = 0
    
    for i in range(len(included)-1):
            a = a + d
            answer_list.append(a)
    for i in range(len(answer_list)):
        if included[i] == True:
            answer+=answer_list[i]
    print(answer_list,included)
    return answer

# included[i]가 i + 1항