class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        self.res = []
        def sets(start,path):
            if len(path)<=len(nums):
                path.sort()
                if path not in self.res:
                    self.res.append(path)

            for i in range(start,len(nums)):
                sets(i+1,path+[nums[i]])
        
        nums.sort()
        sets(0,[])
        return self.res