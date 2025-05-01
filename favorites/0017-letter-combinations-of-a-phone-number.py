class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        mapping = {
            "2":"abc",
            "3":"def",
            "4":"ghi",
            "5":"jkl",
            "6":"mno",
            "7":"pqrs",
            "8":"tuv",
            "9":"wxyz"
        }
        res = []
        def comb(combination,digits):
            nonlocal res,mapping
            if not digits:
                res.append(combination)
                return res
            
            for letter in mapping[digits[0]]:
                comb(combination+letter,digits[1:])
            
            return res
            
        if digits:
            return comb("",digits)
        return []


