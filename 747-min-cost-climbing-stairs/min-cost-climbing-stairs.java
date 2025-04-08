class Solution {
    public int minCostClimbingStairs(int[] c) {
        int n=c.length;
        for(int i=2;i<c.length;i++)
        {
            c[i]+=Math.min(c[i-1],c[i-2]);
        }
        return Math.min(c[n-1],c[n-2]);
    }
}