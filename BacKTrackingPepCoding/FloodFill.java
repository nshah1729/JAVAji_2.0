import java.util.ArrayList;

public class FloodFill {
    public static void main(String[] args) {
        int[][] a= {{0,1,0,0},
                    {0,0,0,1},
                    {1,0,0,0},
                    {0,1,0,0}};
        findPaths(a,0,0,"",new boolean[a.length][a.length]);
    }
    public static void findPaths(int[][] a,int sr,int sc,String psf,boolean[][] visited){

        if(sr==a.length-1&&sc== a.length-1){
            System.out.println(psf);
            return;
        }else if(sr<0||sc<0||sr==a.length||sc==a.length||a[sr][sc]==1||visited[sr][sc])return;

        visited[sr][sc]=true;
        //top
        findPaths(a,sr-1,sc,psf+"T",visited);
        //left
        findPaths(a,sr,sc-1,psf+"L",visited);
        //down
        findPaths(a,sr+1,sc,psf+"D",visited);
        //right
        findPaths(a,sr,sc+1,psf+"R",visited);

        visited[sr][sc]=false;
    }
}
