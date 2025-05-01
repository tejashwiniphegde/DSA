class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        long maxHor = Math.max(horizontalCuts[0]-0,h-horizontalCuts[horizontalCuts.length-1])% (long)(Math.pow(10,9) + 7);
        long maxVer = Math.max(verticalCuts[0]-0,w-verticalCuts[verticalCuts.length-1])% (long)(Math.pow(10,9) + 7);
        for(int i=1;i<horizontalCuts.length;i++){
            maxHor = Math.max(maxHor,horizontalCuts[i]-horizontalCuts[i-1])% (long)(Math.pow(10,9) + 7);
        }
        for(int v=1;v<verticalCuts.length;v++){
            maxVer = Math.max(maxVer,verticalCuts[v]-verticalCuts[v-1])% (long)(Math.pow(10,9) + 7);
        }
        System.out.println(maxHor);
        System.out.println(maxVer);
        long ans =(maxHor*maxVer)% (long)(Math.pow(10,9) + 7);
        return (int)ans;
    }
}