class Solution:
    def numOfMinutes(self, n: int, headID: int, manager: List[int], informTime: List[int]) -> int:
        manager_map = {}
        maxTime = 0
        ans = 0
        def dfs(m):
            nonlocal manager_map,maxTime,ans
            maxTime = max(ans,maxTime)
            if m in manager_map:
                for emp in manager_map[m]:
                    ans=ans+informTime[m]
                    dfs(emp)
                    ans-=informTime[m]
    

        for i in range(len(manager)):
            if manager[i] !=-1:
                if manager[i] in manager_map:
                    manager_map[manager[i]].append(i)
                else:
                    manager_map[manager[i]] = [i]
        print(manager_map)
        dfs(headID)
        return maxTime
            


        