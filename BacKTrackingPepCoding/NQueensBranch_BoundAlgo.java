public class NQueensBranch_BoundAlgo {
    public static void main(String[] args) {
        int n=4;
        boolean[][] a=new boolean[n][n];
        boolean[] col=new boolean[n];
        boolean[] nd=new boolean[(2*n)-1];
        boolean[] rd=new boolean[(2*n)-1];
        printNQ(a,0,col,nd,rd,"");
    }

    private static void printNQ(boolean[][] a, int r, boolean[] col, boolean[] nd, boolean[] rd,String asf) {

        if(r==a.length){
            System.out.println(asf);
            return;
        }

        for (int c = 0; c < a.length; c++) {
            if(!col[c]&&!nd[r+c]&&!rd[r-c+a.length-1]){
                a[r][c]=true;
                col[c]=true;
                nd[r+c]=true;
                rd[r-c+a.length-1]=true;
                printNQ(a,r+1,col,nd,rd,asf+r+"-"+c+" ");
                a[r][c]=false;
                col[c]=false;
                nd[r+c]=false;
                rd[r-c+a.length-1]=false;
            }
        }
    }
}
