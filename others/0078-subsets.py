class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        self.res =[]
        def sets(path,i):
            self.res.append(path[:])
            if i>len(nums)-1:
                return
            
            for i in range(i,len(nums)):
                if nums[i] not in path:
                    path.append(nums[i])
                    sets(path,i+1)
                    path.pop()

        sets([],0)
        return self.res




