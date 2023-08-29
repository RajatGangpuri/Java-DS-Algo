public class BackTrackingNQueens {

    public static boolean isSafe(char[][] chessBoard,int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(chessBoard[i][col]=='Q'){
                return false;
            }
        }

        //vertical right diagonal

        for(int i=row-1,j=col+1;i>=0 && j<chessBoard.length;i--,j++){
            if(chessBoard[i][j]=='Q'){
                return false;
            }
        }

        //vertical left diagonal

        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(chessBoard[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void seat(char[][] chessBoard,int row){
        if(row==chessBoard.length){
            printBoard(chessBoard);
            return;
        }
        for(int j=0;j<chessBoard.length;j++){
            if(isSafe(chessBoard,row,j)){
                chessBoard[row][j]='Q';
                seat(chessBoard,row+1);
                chessBoard[row][j]='*';
            }
        }
    }

    public static void printBoard(char[][] chessBoard){
        for(int i=0;i<chessBoard.length;i++){
            for(int j=0;j<chessBoard.length;j++){
                System.out.print(chessBoard[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }




    public static void main(String[] args){
        int n=5;
        char[][] chessBoard=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                chessBoard[i][j]='*';
            }
        }
        seat(chessBoard,0);
    }
}
