def printPairs(arr, n, sum):
    s = set()
     
    for i in range(0, n):
        temp = sum-arr[i]
        if (temp in s):
            print ("(" + str(arr[i]) + ", " + str(temp) + ")")
        s.add(arr[i])

A = [10, 15, 3, 7]
sum = 17
printPairs(A, len(A), sum)
