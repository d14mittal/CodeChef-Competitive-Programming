ll n;
cin>>n;
ll root_n=sqrt(n);
vector<bool> seg_sieve(root_n+1,true);
vector<ll> primes; // 1st block primes
vector<ll> ans; // all other blocks
for(ll i=2;i<=root_n;i++){
    if(seg_sieve[i]==true){
        primes.push_back(i);
        for(ll j=i+i;j<=root_n;j+=i){
            seg_sieve[j]=false;
        }
    }
}
for(ll block=2; block*root_n<=n; block++){
    for(ll i=1;i<=root_n;i++){
        seg_sieve[i]=true;
    }
    ll end=block*root_n;
    ll start=end-root_n+1;
    for(ll j=0;j<primes.size();j++){
        ll first_multiple;
        if(start%primes[j]==0){
            first_multiple=start;
        }
        else{
            first_multiple=primes[j]+(primes[j]*(start/primes[j]));
        }
        first_multiple%=root_n;
        if(first_multiple==0)
            first_multiple+=root_n;
        for(ll k=first_multiple;k<=end;k+=primes[j]){
            seg_sieve[k]=false;
        }
    }
    for(ll i=1;i<=root_n;i++){
        if(seg_sieve[i]==true){
            ans.push_back(i+start-1);
        }
    }
}
cout<<ans.size()+primes.size()<<"\n";
for(ll i=0;i<primes.size();i++){
    cout<<primes[i]<<" ";
}
for(ll i=0;i<ans.size();i++){
    cout<<ans[i]<<" ";
}
