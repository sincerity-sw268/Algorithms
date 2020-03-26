arr = [-2, 1, -3, 4, -1, 2, 1,-5, 4]
cnt=1
max = arr[0]
for i in range(len(arr)):
    for j in range(len(arr)):
        if (j+cnt) <= len(arr):
            a = arr[j:j + cnt]
            sum_A = sum(a)
            if (max < sum_A):
                 max = sum_A
                 max_arr= a

    cnt+=1

print("max",max,max_arr)
