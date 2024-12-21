var commonFactors = function(a, b) {
    let temp=0;
    const num = Math.min(a,b)
    for(let i=1;i<=num;i++){
        if(a%i ==0 && b%i==0){
       temp++;
        }
    }
    return temp;
};

console.log((commonFactors(12,6)));