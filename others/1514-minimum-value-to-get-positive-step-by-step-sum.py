class Solution:
    def minStartValue(self, nums: List[int]) -> int:
        sums =0 
        min_start = 0
        for i in nums:
            sums+=i
            min_start = min(sums,min_start)
        return abs(min_start)+1
        