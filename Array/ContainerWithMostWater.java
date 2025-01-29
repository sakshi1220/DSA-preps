class Solution {
    public int ContainerWithMostWater(int[] height) {
         int maxArea=0;
        int i=0; int j= height.length-1;

        while(i<j){
            int width= j-i;
           int maxHeight=Math.min(height[i],height[j]);
           maxArea = Math.max(maxArea,width*maxHeight);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args)
    {
        int [] height = {1,8,6,2,5,4,8,3,7};
        
        Solution solution = new Solution();
        System.out.println(
            "Count : "
            + solution.ContainerWithMostWater(height));
    
    }
}