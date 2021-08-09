#include <bits/stdc++.h>
#include <math.h>
#include <deque>
#include <string>
#include <set>
#include <map>
#include <queue>
#include <stdio.h>
#include <cstdlib>
#include <random>
#include <chrono>
#include <iomanip>
#include <array>
using namespace std;
using ll = long long;
bool check(vector<ll> X,ll n,ll c,ll gap){
    ll position_of_previous_cow=X[0];
    c--;
    for(ll i=1;i<n;i++){
        if(c==0){
            break;
        }
        if(X[i]-position_of_previous_cow>=gap){
            position_of_previous_cow=X[i];
            c--;
        }
        else{
            
        }
    }
    if(c==0){
        return true;
    }
    else{
        return false;
    }
}



int main(){
    ios::sync_with_stdio(false);
    cin.tie(0);
    // taking input
    ll n,c;
    cin>>n>>c;
    vector<ll> X(n);
    for(ll i=0;i<n;i++){
        cin>>X[i];
    }
    sort(X.begin(),X.end());
    ll low=1,high=1e9;
    while(low<high){
        ll mid=(low+high+1)/2;
        bool val=check(X,n,c,mid);
        if(val==true){
            low=mid;
        }
        else{
            high=mid-1;
        }
    }
    cout<<low<<"\n";
}
