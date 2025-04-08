class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int ml=0;
        for(int num : nums)
        {
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        for(int num : hm.keySet())
        {
            if(hm.containsKey(num+1))
            {
                ml=Math.max(ml,hm.get(num)+hm.get(num+1));
            }
        }
        return ml;
    }
}