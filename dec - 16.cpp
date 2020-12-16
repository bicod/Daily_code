#include <iostream>
using namespace std;

void productA(int a[], int n)
{
    if(n==1)
    {
        cout<< 0;
        return;
    }

    int i;
    int temp=1;

    int* product = new int[sizeof(int)* n];

    memset(product,1,n);

    for(int i=0; i<n; i++)
    {
        product[i] = temp;
        temp=temp*a[i];
    }

    temp =1;

    for(int i=n-1; i>=0; i--)
    {
        product[i] *= temp;
        temp *= a[i];
    }

    for(int i=0;i<n;i++)
    {
        cout<<product[i]<<" ";
    }
    return;
}

int main() 
{
    int a[5] = {1,2,3,4,5};
    productA(a,5);
}
