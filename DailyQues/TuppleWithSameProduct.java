//-------------------------APPROCH 1 (TLE)--------------->

import java.util.Arrays;

class Solution {
    public int tupleSameProduct(int[] nums) {
        int tupple=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
              for(int k=0;k<nums.length;k++){
            for(int l=k+1;l<nums.length;l++){
                if(i!=k && i!=l && j!=k && j!=l){
            int product1= nums[i]*nums[j];
            int product2=nums[k]*nums[l];
            if(product1==product2){
                tupple=tupple+1;
            }
                }
        }
        }
        }
        }
        tupple=tupple/2;
        return tupple*8;
    }

 //-------------------------APPROCH 2 (TLE)--------------->  

    public int tupleSameProduct2(int[] nums) {
        int tupple=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;j>i;j--){
              for(int k=i+1;k<j;k++){
            for(int l=j-1;l>k;l--){
                
            int product1= nums[i]*nums[j];
            int product2=nums[k]*nums[l];
            if(product1==product2){
                tupple=tupple+1;
            }
                
        }
        }
        }
        }
        
        return tupple*8;
    }
    
    public static void main(String[] args) {
        int [] nums= {1,2,4,5,10};
        Solution s = new Solution();
        System.out.println(s.tupleSameProduct(nums));
        System.out.println(s.tupleSameProduct2(nums));
    }

}