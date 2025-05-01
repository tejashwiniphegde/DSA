class Solution:
    def restoreIpAddresses(self, s: str) -> List[str]:
        self.res = []
        def restore(start,path):
            f = False

            
            for i in range(start,len(s)):
                path+=s[i]+'.'
                restore(i+1,path)
                path= path[:len(path)-1]
             
                
                if len(path.split('.'))==4 and len(path) == len(s)+3:
                    for i in path.split('.'):
                        if len(i)>0 and i[0]!='0' and int(i)>=0 and int(i)<=255:
                            f = True
                        elif len(i)==1:
                            f = True
                        else:
                            f=False
                            break
                if f:
                    print(path)
                    self.res.append(path[:])
                    
                
        restore(0,'')
        return self.res


