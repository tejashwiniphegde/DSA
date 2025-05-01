class Solution:
    def permuteUnique(self, nums: List[int]) -> List[List[int]]:
        self.res = []
        self.nums = nums
        def perm(nums,path):
            if len(path) == len(self.nums):
                if path not in self.res:
                    print('res',path)
                    self.res.append(path.copy())
                    return
            
            for i in nums:
                path.append(i)
                nums1 = nums.copy()
                nums1.remove(i)
                print(path)
                perm(nums1,path)
                path.pop()
            
        perm(nums,[])
        return self.res
            
