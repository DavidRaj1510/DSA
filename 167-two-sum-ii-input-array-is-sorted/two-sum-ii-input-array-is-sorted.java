class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int start=0;
        int end=n-1;
        int ans[]= new int[2];
        while(start<end)
        {
            int sum=nums[start]+nums[end];
            if(sum==target)
            {
                ans[0]=start+1;
                ans[1]=end+1;
                return ans;
            }
            else if(sum>target)
            {
                end--;
            }
            else
            {
                start++;
            }
        }
        return ans;
    }
}