class Solution {
    public int longestNiceSubarray(int[] nums) {
       int n = nums.length;
        int l = 0, bit = 0, ml = 0;
        for (int r = 0; r < n; r++) {
            while ((bit & nums[r]) != 0) {
                bit ^= nums[l]; //removing nums[l] from subarray
                l++; //moving l to r;
            }
            bit |= nums[r]; //Adding nums[r] to bit
            ml = Math.max(ml, r - l + 1);
        }
        return ml;
    }
}