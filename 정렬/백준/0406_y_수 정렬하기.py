n = int(input()) 
array = [int(input()) for _ in range(n)]  

stack = [(0, len(array) - 1)]

while stack:
    start, end = stack.pop()
    if start >= end:  
        continue
    
    pivot = array[(start + end) // 2] 
    left, right = start, end
    
    while left <= right:
        while array[left] < pivot:  
            left += 1
        while array[right] > pivot:  
            right -= 1
        
        if left <= right:  
            array[left], array[right] = array[right], array[left]
            left, right = left + 1, right - 1
    
    stack.append((start, right))  
    stack.append((left, end))  

for num in array:
    print(num)
