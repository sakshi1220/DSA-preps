const addDigits=(digit)=>{
    let digitToString= digit.toString().split('');
    let sum=0;
    let i=0;
    let res=num;
    while(digitToString.length!==1){
      if(i!==digitToString.length){
      sum += parseInt(digitToString[i]);//11
      i++;
      } else{
         digitToString=sum.toString().split('');
         res=sum;
        i=0;
        sum=0;
        
}
    }
     return res;

}

console.log(addDigits(38));