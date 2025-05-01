class Solution:
    def countNicePairs(self, nums: List[int]) -> int:
        freq = defaultdict(int)
        count = 0
        for n in nums:
            diff = n - int(str(n)[::-1])
            freq[diff]+=1
        for f in freq.values():
            count += (f-1)*f//2 % (10**9+7)
        return count%(10**9+7)


        