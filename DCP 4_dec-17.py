def smallest_missing_positive_element(a,n):
    ptr = 0
    a.sort()
    for i in range(n):
        if a[i]==1:
            ptr = 1
            break
    
    if ptr==0:
        return(1)

    i=0
    while i<n:
        if(a[i+1] == a[i]+1) or a[i]==1 or a[i]<0 or a[i]>=n:
            i+=1
        else:
            return a[i]+1
            break

    

A = [ 2, 3, -7, 6, 8, 1, -10, 15 ]
N = len(A)
print(smallest_missing_positive_element(A, N))
