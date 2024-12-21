// Input: n = 12
// Output: 2
// Explanation: 1, 2 when both divide 12 leaves remainder 0.

function evenlyDivides(n) {
    // code here
    let count=0;
    let tempArray=[];
    let number= n.toString();
    for(let i=0; i<number.length; i++){
        tempArray.push(parseInt(number[i]));
    }
    for(let i=0; i<tempArray.length; i++){
        if(n%tempArray[i]==0){
            count++; 
        }
        
    }
    return count;
    
}

console.log(evenlyDivides(12))