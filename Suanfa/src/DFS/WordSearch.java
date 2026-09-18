package DFS;

/**
 * ClassName:WordSearch
 * Description:
 */
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        int height = board.length;
        int length = board[0].length;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                if (board[i][j]==word.charAt(0)){
                    if (dfs(board,word,i,j,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    private boolean dfs(char[][] board,String word,int i,int j,int k){
        if (k==word.length()){
            return true;
        }
        if(i<0||i>= board.length||j<0||j>=board[0].length||board[i][j]!=word.charAt(k)){
            return false;
        }
        char temp = board[i][j];
        board[i][j] = '#';
        boolean find = dfs(board, word, i + 1, j, k + 1) ||
                dfs(board, word, i - 1, j, k + 1) ||
                dfs(board, word, i, j + 1, k + 1) ||
                dfs(board, word, i, j - 1, k + 1);
        board[i][j]=temp;
        return find;
    }
}
