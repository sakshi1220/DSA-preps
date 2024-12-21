// Input:
// N = 9

// Output:
// 9 18 27 36 45 54 63 72 81 90

// Explanation:
// The table of 9 is the output whose 1st 
// term is 9 and the 10th term is 90

function getTable(N) {
    //code here
    let sum=[];
    for(let i=1; i<=10; i++){
        sum.push(N*i);
    }
    return sum;
  }

  console.log(getTable(9));