class Solution {
    public int countSubstrings(String s) {
        ArrayList<String> al = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                al.add(s.substring(i,j));
            }
        }
        int c=0;
        for(String w : al)
        {
            if(isPalindrome(w))
            {
                c++;
            }
        }
        return c;
    }
     private boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}