
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class WordSearch {

     static boolean[][] visited;
    public static boolean exist(char[][] board, String word) {
        
        int row=board.length;
        int column=board[0].length;
        
        visited=new boolean[row][column];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                
                if(board[i][j]==word.charAt(0) && searchWord(i,j,0,word,board))
                    return true;
            }
            
        }
        return false;
    }
    
   public static boolean searchWord(int i,int j, int index,String word,char[][] board)
   {
       if(index==board.length)
           return true;
       
       if(i < 0  || i>=board.length|| j<0 || j >= board[i].length)
           return false;
       
       if( board[i][j] != word.charAt(index) || visited[i][j])
           return false;
       
       visited[i][j]=true;
       
       if(
           searchWord(i+1,j,index+1,word,board) ||
           searchWord(i-1,j,index+1,word,board) ||
           searchWord(i,j+1,index+1,word,board) ||
           searchWord(i,j-1,index+1,word,board)|| visited[i][j]
       ){
                 return true;
       }
 
       
       visited[i][j]=false;
       return false;
       
   }
    
    public static void main ( String args[] ) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "SEE";
        System.out.println ( exist ( board, word ) );
    }
}
