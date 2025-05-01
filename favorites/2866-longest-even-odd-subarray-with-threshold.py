class Solution:
    def longestAlternatingSubarray(self, nums: List[int], threshold: int) -> int:
        self.res = []
        def subArray(nums,start,end):
            if end == len(nums):
                return
            elif start > end:
                return subArray(nums,0,end+1)
            c = 0
            if len(self.res)<len(nums[start:end+1]):
                for i in range(start,end+1):
                    
                    if i+1 < end+1:
                      
                        if not (nums[i] % 2 != nums[i + 1] % 2 and nums[i] <= threshold and nums[start] % 2 == 0):
                            break
                        else:
                            c+=1
                    else:
                        if (len(nums[start:end+1])>1):
                            if not(nums[i] <= threshold and nums[start] % 2 == 0 and nums[i] % 2 != nums[i - 1] % 2):
                                break
                            else:
                                c+=1
                        else:
                            if not(nums[i] <= threshold and nums[start] % 2 == 0):
                                break
                            
                            else:
                                c+=1
                    
                    if c==len(nums[start:end+1]):
                        self.res = nums[start:end+1]
            return subArray(nums,start+1,end)
        subArray(nums,0,0)
        return len(self.res)
                    
                    
            
            
        
        