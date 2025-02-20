x = int(input())
dp = [0]*(x+1)
dp[0]=0
def cal(x):
    if x>=2:
        if dp[x]!=0:
            return dp[x]
        if x%3==0:
            if dp[int(x/3)]!=0:
                dp[x]=dp[int(x/3)]+1
                return dp[x]
            else:
                dp[0]+=1
                x=int(x/3)
                return cal(x)
        if x%2==0:
            if dp[int(x/2)]!=0:
                dp[x]=dp[int(x/2)]+1
                return dp[x]
            else:
                dp[0]+=1
                x=int(x/2)
                return cal(x)
        if dp[x-1]!=0:
            dp[x]=dp[x-1]+1
            return dp[x]
        else:
            dp[0]+=1
            x-=1
            return cal(x)
    else:
        return dp[0]

if x==1:
    print(0)
else:
    for i in range(2,x+1):
        dp[0]=0
        dp[i]=cal(i)
        if i%2==0:
            if dp[i]>(dp[int(i/2)]+1):
                dp[i]=dp[int(i/2)]+1
        if i%3==0:
            if dp[i]>(dp[int(i/3)]+1):
                dp[i]=dp[int(i/3)]+1
        if dp[i]>(dp[i-1]+1):
            dp[i]=dp[i-1]+1
    print(dp[x])