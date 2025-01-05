// Brute force Approach
function PermutationSequence(arr){
let result =[];

function permute(temp,remaining){
    if(remaining.length==0){
        result.push(temp.join(''));
    }
    else{
        for(let i=0; i<remaining.length;i++){
            const next=[...remaining];
            next.splice(i,1);
            permute([...temp,remaining[i]],next);
        }
    }
}
permute([],arr);
return result.sort();
}
   
console.log(PermutationSequence([1,2,3,4]));

