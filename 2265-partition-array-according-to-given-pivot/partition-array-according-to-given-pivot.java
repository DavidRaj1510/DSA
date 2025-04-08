class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> al = new ArrayList<>();
        int index=0,c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==pivot)
            {
                c++;
            }
            else if(nums[i]>pivot)
            {
                al.add(nums[i]);
            }
            else
            {
                nums[index++]=nums[i];
            }
        }
        for(int i=0;i<c;i++)
        {
            nums[index++] = pivot;
        }
        for(int num : al)
        {
            nums[index++]=num;
        }
        return nums;
    }
}