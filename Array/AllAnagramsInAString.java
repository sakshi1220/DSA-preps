import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean allzero(int [] arr){
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
    public List<Integer> AllAnagramInAString(String s, String p) {
        int [] frequency= new int[26];
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<p.length();i++){
            char c= p.charAt(i);
             frequency[c-'a']++;
        }
        int j=0; int i=0;
        while(j<s.length()){
             frequency[s.charAt(j)-'a']--;
           if(j-i+1==p.length()){
            if(allzero(frequency)){
                list.add(i);
            }
            frequency[s.charAt(i)-'a']++;
            i++;
           }
           j++;
        }
        return list;
    }
    public static void main(String[] args)
{
    String s = "cbaebabacd";
    String p= "abc";
    Solution solution = new Solution();
    System.out.println(
        "Count : "
        + solution.AllAnagramInAString(s,p));

}
} 

