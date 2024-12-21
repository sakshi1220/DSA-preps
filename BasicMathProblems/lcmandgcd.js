function lcmAndGcd(a, b) {
    // code here
    let maxofTwo = Math.max(a,b);
    let gcd=0;
    let lcm=0;
    for(let i=0;i<maxofTwo;i++){
        if(a%i==0 && b%i==0){
            gcd=i;
        }
    }
     lcm =a*b/gcd;
     return [lcm,gcd];
}

console.log(lcmAndGcd(5,10))