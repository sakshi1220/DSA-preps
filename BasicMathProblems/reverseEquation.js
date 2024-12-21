function reverseEqn(s) {
    //code here
    let sum=''
    let tempArray=[];
    let arr=['+','-','*','/'];
for(let i=0;i<s.length;i++){
    if(!arr.includes(s[i])){
        sum+=s[i];
    }
    else{
        tempArray.push(sum)
        tempArray.push(s[i]);
        sum='';
    }
}
tempArray.push(sum);
tempArray=tempArray.reverse().join('');
return tempArray;
}
console.log(reverseEqn("20+3*9"))