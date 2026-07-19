class Solution {
    int ans=0;
    public int totalNQueens(int n) {
        int row=0;
        Set<Integer> col=new HashSet<>();
        Set<Integer> diag=new HashSet<>();
        Set<Integer> anti_diag=new HashSet<>();
        char[][] board= new char[n][n];
        for( char[] rows:board){
            Arrays.fill(rows,'.');
        }
        backtrack(row,n,col,diag,anti_diag,board);
        return ans;   
    }
    public void backtrack(
        int row,int n,
        Set<Integer> cols,
        Set<Integer> diag,
        Set<Integer> anti_diag, 
        char[][] board){

            if(row==n){
                ans++;
                return ;
            }
            for (int col=0;col<n;col++){
                if(cols.contains(col))continue;
                if(diag.contains(row-col))continue;
                if(anti_diag.contains(row+col))continue;
                board[row][col]='Q';
                cols.add(col);
                diag.add(row-col);
                anti_diag.add(row+col);
                backtrack(row+1,n,cols,diag,anti_diag,board);
                board[row][col]='.';
                cols.remove(col);
                diag.remove(row-col);
                anti_diag.remove(row+col);

            }


    }
}
