import java.util.HashMap;

class Solution {
    public int allSubarrays(int[] nums, int k){
        int i=0; int j=0; int res=0;
        HashMap<Integer,Integer> hashmap=new HashMap<>();
        while(j<nums.length){
            
            hashmap.put(nums[j],hashmap.getOrDefault(nums[j],0)+1);
            while(hashmap.size()>k){
                hashmap.put(nums[i],hashmap.get(nums[i])-1);
                if(hashmap.get(nums[i])==0){
                    hashmap.remove(nums[i]);
                }
                i++;
            }
           res+= j-i+1;
        j++;
        }
        return res;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return allSubarrays(nums,k)-allSubarrays(nums,k-1);
    }
    public static void main(String[] args)
{
    int [] s ={1,2,1,2,3};
    int k=2;
    Solution solution = new Solution();
    System.out.println(
        "Count : "
        + solution.subarraysWithKDistinct(s,k));

}
}