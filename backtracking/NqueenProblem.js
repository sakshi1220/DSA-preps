//https://leetcode.com/problems/n-queens/description/


var solveNQueens = function (n) {
    const board = Array(n).fill().map(()=>Array(n).fill('.'));
     const ans = [];
     function isSafe(row, col) {
         for (let i = 0; i < row; i++) {
             if (board[i][col] === 'Q') {
                 return false;
             }
         }
 
         for (let i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--) {
             if (board[i][j] === 'Q') {
                 return false;
             }
         }
 
         for (let i = row-1, j = col+1; i >= 0 && j < n; i--, j++) {
             if (board[i][j] === 'Q') {
                 return false;
             }
         }
 
         return true;
     }
 
     // Recursive function to solve the N-Queens problem
     function solve(row) {
         if (row === n) {
             // Add a copy of the board to the results
             ans.push(board.map(row => row.join('')));
             return;
         }
 
         for (let col = 0; col < n; col++) {
             if (isSafe(row, col)) {
                 board[row][col] = 'Q'; 
                 solve(row + 1); 
                 board[row][col] = '.'; 
             }
         }
     }
 
     solve(0);
 
     return ans;
 };

 console.log(solveNQueens(4));