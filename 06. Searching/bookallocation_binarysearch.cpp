#include<iostream>
#include<bits/stdc++.h>
using namespace std;

bool check(int a[],int n,int m,int max)
{
    int cnt=1;
    int sum=0;
    for(int i=0;i<n;i++)
    {
        sum+=a[i];
        if(sum>max)
        {
            cnt++;
            sum=a[i];
        }
        if(cnt>m)
        return false;
    }
    return true;
}

int main()
{
    int n,k;
    cin>>n>>k;
    int a[n];
    int start=-1,end=0;
    for(int i=0;i<n;i++)cin>>a[i];
    for(int i=0;i<n;i++)
    {
        start=max(start,a[i]);
        end+=a[i];
    }
    int res;
    while(start<=end)
    {
        int mid=(start+end)/2;
        if(check(a,n,k,mid))
        {
            res=mid;
            end=mid-1;
        }
        else
        start=mid+1;
    }
    cout<<res;
}