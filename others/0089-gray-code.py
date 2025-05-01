class Solution:
    def grayCode(self, n: int) -> List[int]:
        self.res = []
        i=0
        num=0
        while i<=(2**n)-1:
            num=num^(i&-i)
            self.res.append(num)
            i+=1
        return self.res

            

        