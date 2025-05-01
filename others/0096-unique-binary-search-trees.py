class Solution:
    def numTrees(self, n: int) -> int:
        sum=0
        dp = {}
        sum = construct(n,dp)
        return sum


def construct(n,dp):
    if n==0 or n==1:
        return 1
    sum =0
    if n in dp:
        return dp[n]
    for i in range(1,n+1):
        sum += construct(i-1,dp) * construct(n-i,dp)
    dp[n] = sum
    return sum   

        




    