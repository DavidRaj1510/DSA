class Solution {
    public int fib(int n) {
        if(n==0||n==1)
        {
            return n;
        }
        int ft=0;
        int st=1;
        for(int i=1;i<=n;i++)
        {
            int tt=ft+st;
            ft=st;
            st=tt;
        }
        return ft;
    }
}