var generateParenthesis = function(n) {
    var generateParenthesis = function(n) {
        let ans=[];
        function solve(curr,open,close){
            if(curr.length===2*n){
                ans.push(curr);
                return;
            }
            if(open<n){
                solve(curr +'(',open+1,close);
            }
            if(close<open){
                solve(curr + ')',open,close+1);
            }
        }
        
        solve('',0,0);
        return ans;
    };
};