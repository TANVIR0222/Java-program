public class GridWay {
    public static int  gridWay(int col , int row, int n,int m ) {

        // base case
        if (col == n-1 && row == m-1){ // cond last case
            return 1;
        }else {
            if (row == n || col == n){// boundary crosse  cond
                return 0;
            }

        }

        int w1=gridWay(col+1, row, n, m);
        int w2=gridWay(col, row+1, n, m);
        return w1+w2;

    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(gridWay(0,0,n,m));
    }
}
