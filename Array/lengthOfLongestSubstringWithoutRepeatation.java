class Solution {
    public int lengthOfLongestSubstringWithoutRepeatation(String s) {
        int maxCount=0;
        int len=0;
        
        for(int i=0;i<s.length();i++){
            int[] charArray = new int[255];
            for(int j=i;j<s.length();j++){
                if(charArray[s.charAt(j)]==1){
                    break;
                }
                len=j-i+1;
                maxCount= Math.max(len,maxCount);
                charArray[s.charAt(j)]++;
            }
        }
        return maxCount;
    }


public static void main(String[] args)
{
    String s = "geeksforgeeks";
    Solution solution = new Solution();
    System.out.println(
        "Count : "
        + solution.lengthOfLongestSubstringWithoutRepeatation(s));

}
}