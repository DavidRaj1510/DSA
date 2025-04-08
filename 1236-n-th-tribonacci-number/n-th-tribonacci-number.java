class Solution {
    public int tribonacci(int n) {
        if(n==0||n==1)
        {
            return n;
        }
        int ft=0;
        int st=1;
        int tt=1;
        for(int i=1;i<=n;i++)
        {
            int ftt=ft+st+tt;
            ft=st;
            st=tt;
            tt=ftt;
        }
        return ft;
    }
}