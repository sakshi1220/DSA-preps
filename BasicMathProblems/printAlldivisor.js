function allDivisor(n){
    let temp=[];
for(let i=1; i<=n;i++){
    if(n%i==0){
        temp.push(i)
    }
}
return temp.join()}

console.log(allDivisor(20))