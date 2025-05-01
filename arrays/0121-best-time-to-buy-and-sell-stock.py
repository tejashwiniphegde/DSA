class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy = 0
        sell = 1
        maxprofit = 0
        for i in range(1,len(prices)):
            print(i,buy)
            currprofit = prices[i] - prices[buy]
            if prices[i] > prices[buy]:
                maxprofit = max(maxprofit,currprofit)
            else:
                buy = i
            
        return maxprofit
