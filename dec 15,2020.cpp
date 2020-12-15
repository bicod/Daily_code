#include <bits/stdc++.h>
using namespace std;

void pairFound(int n, int a[], int sum)
{
    unordered_set <int> s;
    for(int i=0;i<n;i++)
    {
        int temp = sum-a[i];
        if(s.find(temp)!=s.end())
        {
            cout<<"pair is:-- ("<<a[i]<<","<<temp<<")"<<endl;
        }
        s.insert(a[i]);
    }
}


int main() 
{
    int n;
    cin>>n;
    
    int sum;a
    cin>>sum;

    int a[n];
    for(int i=0; i<n; i++)
    {
        cin>>a[i];
    }
    pairFound(n,a,sum);
}
