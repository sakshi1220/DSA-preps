function armstrongNumber(n) {
    // code here
let number= n.toString().split('');
let tempArray=[];
let sum=0;

for(let i=0;i<number.length; i++){
    sum += parseInt(number[i])**3;
}
if(sum===n){
return true;
}
else{
    return false;
}
}

console.log(armstrongNumber(371));