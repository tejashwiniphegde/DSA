class Solution(object):
    def combinationSum(self, candidates, target):
        
        self.res = []
        def generate(candidates,target,path):
            if target <0:
                return
            if target == 0:
                self.res.append(path)
            
            for i in range(len(candidates)):
                generate(candidates[i:],target-candidates[i],path+[candidates[i]])


        generate(candidates,target,[])
        return self.res
