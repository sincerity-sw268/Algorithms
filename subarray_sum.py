#O(n)
arr = [-2, 1, -3, 4, -1, 2, 1,-5, 4]

max_sum = arr[0]
total_max = arr[0]

for i in range(1, len(arr)):
    end = i
    max_sum += arr[i]

    if (max_sum < arr[end]):
        max_sum = arr[end]
        start = i

    if (total_max < max_sum):
        total_max = max_sum
        t_start = start
        t_end = end

print("array: ", arr[t_start:t_end+1])
print("sum  : ", total_max)
