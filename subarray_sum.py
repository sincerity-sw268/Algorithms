arr = [-2, 1, -3, 4, -1, 2, 1,-5, 4]

max_sum = arr[0]  # 1
total_max = arr[0]  # 1

for i in range(1, len(arr)):   # n-1
    end = i   # n-1
    max_sum += arr[i]  # n-1

    if (max_sum < arr[end]):  #n-1
        max_sum = arr[end]  #1
        start = i             #1

    if (total_max < max_sum):  # n-1
        total_max = max_sum
        t_start = start
        t_end = end

print("array: ", arr[t_start:t_end+1])
print("sum  : ", total_max)
