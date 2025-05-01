class Solution(object):
    def generateParenthesis(self, n):
        self.res = []
        def generatepara(left,right,s):
            if len(s)==n*2:
                self.res.append(s)
                return
            
            if left<n:
                generatepara(left+1,right,s+'(')
            
            if right<left:
                generatepara(left,right+1,s+')')
            
        generatepara(0,0,'')
        return self.res

        
        