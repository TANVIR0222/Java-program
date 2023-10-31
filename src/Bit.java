public class Bit {
    public static void oddOrEven(int n) {
        int bitMax=1;
        if ((n & bitMax )== 0) {
            System.out.println("even number :");
        }else {
            System.out.println("odd number :");
        }
    }

    public static int getIthBit (int n,int i) {
        int bitMax=1<<i;
        if ((n & bitMax) == 0) {
            return 0;
        }else {
            return 1;
        }

    }

    public static int setIthbit(int n ,int i) {
        int bitMax=1<<i;
       return n|bitMax;

    }
    public static int clearIthBit(int n ,int i) {
        int bitMax=~(1<<i);
        return n & bitMax;

    }

    public static int updateIthBit(int n , int i , int newBit) {
        if (newBit == 0) {
            return clearIthBit(n , i);
        }else {
            return setIthbit(n,i);
        }
    }

    public static int clearBitInRange(int n, int i,int j) {
        int a= ((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitMax=a | b;
        return n & bitMax;

    }

    public static boolean powerOfTow(int n) {
        return( n&(n-1)) == 0;
    }

    public static int counterSetBit(int n) {
        int counter=0;

        while (n > 0){
            if ((n & 1) != 0) {
                counter++;
            }
            n= n >> 1;
        }
        return counter;

    }
    public static void main(String[] args) {
    System.out.println(counterSetBit(9));
    }
}
