class Solution {
    public void nQueen(int col,int[][] board,List<String> temp, List<List<String>> ans,int n){
        //base case
        if(col==n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int row=0;row<n;row++){
            if(isSafe(col,row,board,n)){
               board[row][col]=1;
               char[] arr=new char[n];
               Arrays.fill(arr,'.');
               arr[row]='Q';
               temp.add(new String(arr));
               //next call
               nQueen(col+1,board,temp,ans,n);
               board[row][col]=0;
               temp.remove(temp.size()-1);
            }
        }

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
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        List<String> temp=new ArrayList<>();
         int[][] board=new int[n][n];
          nQueen(0,board,temp,ans,n);
          return ans;
    }
}