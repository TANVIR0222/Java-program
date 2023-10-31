public class letcode {
    public static boolean array (int [] num, int target) {
        int n=num.length;
        int bp=-1;

        for(int i = 0 ; i < n ; i++) {
            if (num[i] > num[i + 1]) {
                bp = i;
                break;
            }
        }
            // case 1
        int lp= bp + 1;
        int rp=bp;

        while( lp !=  rp){
            if (num[lp] + num[rp] == target){
                return true; 
            }
                // case 2;

                if (num[lp] + num[rp] < target){
                    lp = (lp +1) % n;
                }else {
                    rp= (rp - 1) % n;
                }
            }

        return false;
    }
    public static void main(String[] args) {
        int num[]={3,2,4};
        int target=6;
        System.out.println(array(num,target));

    }
}

