public class TargetSumSubset {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50,60};
        int k=50;
        find(a,k,0,0,"");
    }

    private static void find(int[] a, int k,int idx,int sum,String set) {
        if(idx==a.length) {
            if (sum == k) {
                System.out.println(set);
            }
            return;
        }

            find(a,k,idx+1,sum+a[idx],set+" "+a[idx]);
            find(a,k,idx+1,sum,set);
        }
    }
