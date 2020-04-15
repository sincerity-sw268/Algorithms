num = list(map(int,input().split()))

i=0
j=0
for i in range(1,len(num)):
    key = num[i]
    j = i - 1
    while ( j >= 0 and num[j]>key):
        num[j+1]=num[j]
        j = j-1
    num[j+1] = key
    print(num)
print(num)