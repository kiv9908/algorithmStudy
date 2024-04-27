def solution(code):
    answer = ''
    mode = 0
    ret = ''
    
    for i in range(len(code)):
        if mode == 0:
                if code[i] != "1":
                    if i % 2 ==0:
                        ret = ret + code[i]
                elif code[i] == "1":
                    mode = 1
        elif mode == 1:
            if code[i] != "1":
                if i % 2>0:
                    ret = ret + code[i]
            elif code[i] == "1":
                mode = 0

    if ret == '':
        return "EMPTY"
    else:
        answer = ret
        return answer
