class Solution {
    public long countSubarrays(int[] nums, long k) {
        int left=0;
        long c=0,sum=0;
        for(int right=0;right<nums.length;right++)
        {
            sum+=nums[right];
            while(sum*(right-left+1)>=k)
            {
                sum-=nums[left];
                left++;
            }
            c+=right-left+1;
        }
        return c;
    }
}