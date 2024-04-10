n = int(input()) 
array = [int(input()) for _ in range(n)]  
print(array)
stack = [(0, len(array) - 1)]
print(stack)
while stack:
    start, end = stack.pop()
    print(start,end,"start,end")
    if start >= end:  
        continue
    
    pivot = array[(start + end) // 2] 
    print("pivot",pivot)
    left, right = start, end
    
    while left <= right:
        while array[left] < pivot:  
            left += 1
        while array[right] > pivot:  
            right -= 1
        
        if left <= right:  
            array[left], array[right] = array[right], array[left]
            left, right = left + 1, right - 1
            print("!!!!",left,right)
    stack.append((start, right))  
    print("1",stack)
    stack.append((left, end))  
    print("2",stack)


for num in array:
    print(num)
