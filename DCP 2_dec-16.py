def product_of_array_i(a, n):
    if n==1:
        print(0)
        return

    i, temp = 1,1

    prod = [1 for i in range(n)]

    for i in range(n):
        prod[i]=temp
        temp*=a[i]

    temp=1

    for i in range(n-1,-1,-1):
        prod[i]*=temp
        temp*=a[i]
    
    for i in range(n):
        print(prod[i], end = " ")

    return 

a = [1,2,3,4,5]
n=len(a)
product_of_array_i(a,n)
