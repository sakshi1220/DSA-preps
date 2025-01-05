// Brute force Approach
function PermutationSequence(arr,k){
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
     result.sort();
     return result[k-1];
    }
       
    console.log(PermutationSequence([1,2,3,4],14));
    
    