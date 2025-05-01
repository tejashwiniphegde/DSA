class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        self.res = []
        def generate(start,target,path):
            if target<0:
                return
            if target == 0:
                if path not in self.res:
                    self.res.append(path)
                return
            
            for i in range(start,len(candidates)):
                if i > start and candidates[i] == candidates[i - 1]:
                    continue
                if candidates[i] > target:
                    break
                generate(i+1,target-candidates[i],path+[candidates[i]])
        
        candidates.sort()
        generate(0,target,[])
        return self.res