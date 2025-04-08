class Solution {
    public int maxScore(int[] c, int k) {
        int ls=0,rs=0,ms=0;
        for(int i=0;i<k;i++)
        {
            ls+=c[i];
        }
        ms=ls;
        int rI=c.length-1;
        for(int i=k-1;i>=0;i--)
        {
            ls-=c[i];
            rs+=c[rI];
            rI--;
            ms=Math.max(ms,ls+rs);
        }
        return ms;
    }
}