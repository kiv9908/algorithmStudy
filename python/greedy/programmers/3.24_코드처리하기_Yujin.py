# mode = 0:
#     1x => 짝: 뒤에 추가
#     1 => mode : 0=>1
# mode = 1:
#     1x => 홀: 뒤에 추가
#     1 => mode : 1=>0

def solution(code):
    answer = ''
    mode = 0
    for i in range(len(code)):
        if mode == 0:
            if code[i] == '1':
                mode = 1
            else:
                if i % 2 ==0:      
                    answer=answer+code[i]
        elif mode == 1 :
            if code[i] == '1':
                mode = 0
            else:
                if i % 2 !=0:      
                    answer=answer+code[i]
    if answer == '':
        answer = "EMPTY"
    return answer
