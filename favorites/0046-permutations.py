class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        self.res = []
        def perm(nums,path):
            if len(path) == len(nums):
                self.res.append(path.copy())
                return
            
            for n in nums:
                if n not in path:
                    path.append(n)
                    perm(nums,path)
                    path.pop()
            
        perm(nums,[])
        return self.res




        