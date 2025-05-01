class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int cnt =0;
        while(cnt<g.length && i< s.length){
            if(g[cnt]<=s[i]){
                cnt++;
            }
            i++;
        }
        return cnt;
    }
}