class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums,goal)-atMost(nums,goal-1);
    }
    public int atMost(int[] nums, int goal) {
        if(goal<0) return 0;
        int l=0,r=0,s=0,c=0;
        while(r<nums.length)
        {
            s+=nums[r];
            while(s>goal)
            {
                s-=nums[l];
                l++;
            }
            c+=r-l+1;
            r++;
        }
        return c;
    }
}