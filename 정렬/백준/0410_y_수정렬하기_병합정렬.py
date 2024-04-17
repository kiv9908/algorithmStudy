def merge_sort(arr):
    if len(arr) < 2:
        return arr

    mid = len(arr) // 2
    low_arr = merge_sort(arr[:mid])
    high_arr = merge_sort(arr[mid:])
    print(low_arr,"lowarr")
    merged_arr = []
    l = h = 0
    while l < len(low_arr) and h < len(high_arr):
        if low_arr[l] < high_arr[h]:
            merged_arr.append(low_arr[l])
            l += 1
            print(merged_arr,"left")
        else:
            merged_arr.append(high_arr[h])
            h += 1
            print(merged_arr,"right")

    print(merged_arr,"1")
    merged_arr += low_arr[l:]
    merged_arr += high_arr[h:]
    print(merged_arr,"2")
    return merged_arr

n = int(input()) 
array = [int(input()) for _ in range(n)]  
arr = merge_sort(array)
for i in arr:
    print(i)