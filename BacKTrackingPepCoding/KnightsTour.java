public class KnightsTour {
    public static void main(String[] args) {
        int[][] a=new int[7][7];
        printNT(a,2,3,1);
    }
    private static void printNT(int[][] a, int r,int c,int m) {
        if(m==a.length*a.length){
            a[r][c]=m;
            display(a);
            a[r][c]=0;
            return;
        }else if(r<0||c<0||r>=a.length||c>=a.length||a[r][c]>0)return;
        a[r][c]=m;
        printNT(a,r-2,c+1,m+1);
        printNT(a,r-1,c+2,m+1);
        printNT(a,r+2,c+1,m+1);
        printNT(a,r+1,c+2,m+1);
        printNT(a,r-2,c-1,m+1);
        printNT(a,r-1,c-2,m+1);
        printNT(a,r+1,c-2,m+1);
        printNT(a,r+2,c-1,m+1);
        a[r][c]=0;
    }

    private static void display(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
