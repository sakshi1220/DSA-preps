class Solution {
    int calcWithGoal(int[] nums, int goal){
       if(goal<0){
           return 0;
       }
       int left=0, right=0, sum=0, count =0;
       while(right<nums.length){
           sum= sum + nums[right];
           while(sum>goal){
               sum= sum - nums[left];
               left= left+1;
           }
           count= count+ (right-left+1);
           right=right+1;
       }
       return count;
   }
   public int numSubarraysWithSum(int[] nums, int goal) {
       
   
   return calcWithGoal( nums,goal)- calcWithGoal(nums,goal-1);
   }



public static void main(String[] args)
{
    int[] arr1 = { 1, 0, 1, 1, 0, 1 };
    int k1 = 2;
    Solution solution = new Solution();
    System.out.println(
        "Count of subarrays with sum " + k1 + ": "
        + solution.numSubarraysWithSum(arr1, k1));

    int[] arr2 = { 0, 0, 0, 0, 0 };
    int k2 = 0;
    System.out.println(
        "Count of subarrays with sum " + k2 + ": "
        + solution.numSubarraysWithSum(arr2, k2));
}
}
