ll power_func(ll x, ll y){ // x= 2, y = 13
    ll ans=1;
    const ll mod = 1000000007;
    x%=mod;
    // x^1
    ll oper=0;
    while(y){
        if(y%2){
            ans*=x;
            ans%=mod;
            y--;
            x*=x;
            x%=mod;
            y/=2;
            oper++;
        }
        else{
            x*=x;
            x%=mod;
            y/=2;
            oper++;
        }
    }
    cout<<"bE oper: "<<oper<<"\n";
    cout<<ans<<"\n";
    return ans;
}
