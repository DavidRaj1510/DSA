class Solution {
    public int numOfSubarrays(int[] arr) {
        long c=0,s=0,e=1,o=0;
        int n=arr.length;
        final long m=1000000007;
        for(int i=0;i<n;i++)
        {
            s+=arr[i];
            if(s%2==1)
            {
                c+=e;
                o++;
            }
            else
            {
                c+=o;
                e++;
            }
            c%=m;
        }
        return (int)c;
    }
}