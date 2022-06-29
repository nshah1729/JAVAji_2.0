public class NQueens {
    public static void main(String[] args) {
        int[][] a=new int[2][2 ];
        printNQ(a,"",0);
    }

    private static void printNQ(int[][] a, String psf, int row){
        if(row==a.length){
            System.out.println(psf);
            return;
        }
        for (int col = 0; col < a.length; col++) {
           if( isItSafe(a,row,col)){
                a[row][col]=1;
                printNQ(a,psf+row+"-"+col+" ",row+1);
                a[row][col]=0;
            }
        }
    }

    private static boolean isItSafe(int[][] a, int row, int col) {
        //Vertical
        for (int r = row-1; r>=0 ; r--) {
            if(a[r][col]==1)return false;
        }
        //Left Diagonal
        for (int r = row-1,c=col-1; r >=0&&c>=0 ; r--,c--) {
            if(a[r][col]==1)return false;
        }
        //Right Diagonal
        for (int r = row-1,c=col+1; r >=0&&c<a.length ; r--,c++) {
            if(a[r][col]==1)return false;
        }
        return true;
    }

}
