// Input:
// n = 56
// Output: 1
// Explanation:
// The digit sum of 56 is 5+6=11.Since, 11 is a palindrome number.Thus, answer is 1.

function isDigitSumPalindrome(n){
    //code here
    const digittoString= n.toString().split('');
    let i=0;
    let sum=0
    while(i!==digittoString.length){
        sum += parseInt(digittoString[i]);
        i++;
    }
    let temp= sum;
    let reverse=0;
     while(temp!==0){
        reverse= (reverse *10) + temp%10;
        temp= Math.floor(temp/10);
    }
    return reverse===sum ? 1: 0;
 }

 console.log(isDigitSumPalindrome(56))