class Solution {
    public int nQueen(int col,int[][] board,int n){
        //base case
        if(col==n){
            return 1;
        }
        int cnt=0;
        for(int row=0;row<n;row++){
            if(isSafe(col,row,board,n)){
               board[row][col]=1;
               //next call
              cnt+= nQueen(col+1,board,n);
               board[row][col]=0;
            }
        }
        return cnt;

    }
    public boolean isSafe(int col,int row,int[][] board,int n){
        //check row
        for(int c=0;c<col;c++){
            if(board[row][c]==1){
                return false;
            }
        }
        //check dig 1
        int i=row ,j=col;
        while(i>=0 && j>=0){
            if(board[i][j]==1){
                return false;
            }
            i--;
            j--;
        }
        //check diag 2
        i=row;
        j=col;
        while(i<n && j>=0){
            if(board[i][j]==1){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
    public int totalNQueens(int n) {
         int[][] board=new int[n][n];
          return nQueen(0,board,n);
    }
}