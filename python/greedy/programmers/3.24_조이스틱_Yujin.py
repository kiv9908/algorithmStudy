def solution(name):
    answer = 0
    name=list(name)
    name_reverse = name[::-1]
    num_list=[]
    print(name)
    a_num1 = 0
    a_num2 = 0 
    
    t1 = 0
    t2 = 1
    alphabet_reverse = ['Z','Y','X','W','V','U','T','S','R','Q','P','O','N','M','L','K','J','I','H','G','F','E','D','C','B','A']
    alphabet = ['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z']
    print(alphabet[9]==name[0],alphabet[9],name[0])
    for name_alphabet in name:
        for cursor in alphabet:
            if name_alphabet == cursor:
                num_list.append(alphabet.index(cursor))
        for cursor in alphabet_reverse:
            if name_alphabet == cursor:
                num_list.append(alphabet.index(cursor)+1)
        min_num=min(num_list)
        print(num_list)
        answer=answer+min_num
        num_list=[]
    for name_alphabet in name:
        t1 += 1
        if name_alphabet == 'A':
            while name_alphabet == 'A':
                a_num1+=1
                if name_alphabet != 'A':
                    break
        break

    for name_alphabet in name_reverse:
        t2 += 1
        if name_alphabet == 'A':
            while name_alphabet == 'A':
                a_num2+=1
                if name_alphabet != 'A':
                    break
        break
    print(a_num1, a_num2, t1, t2)
    if a_num1 <= a_num2:
        answer = answer+t1    
    else:
        answer = answer+t2
            
        
    return answer