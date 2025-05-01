class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        self.res = []
        def comb(path,start):
            if len(path) == k:
                self.res.append(path.copy())
                return
            
            for i in range(start,n+1):
                if i not in path:
                    path.append(i)
                    comb(path,i+1)
                    path.pop()
        comb([],1)
        return self.res


