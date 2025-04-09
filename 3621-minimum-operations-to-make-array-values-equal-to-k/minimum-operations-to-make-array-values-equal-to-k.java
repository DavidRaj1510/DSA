class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int min = nums[0];
        if (min < k) return -1;
        int c = 0;
        for(int i=0;i<nums.length;i++)
        {
            if (nums[i]>k) { c++;
                while (i+1<nums.length && nums[i]==nums[i+1]) 
                    i++;
            }
        }
        return c;
    }
}