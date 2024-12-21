// Input: n = 9
// Output: 2
// Explanation: 1 and 4 are the only Perfect Squares less than 9. So, the Output is 2.

class Solution {
    // Function to count the number of perfect squares.
    countSquares(n) {
        let count=0;
        for(let i=1;i<n;i++){
            if(i*i<n){
                count++;
            }
        }
        return count;
    }
}