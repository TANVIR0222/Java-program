import java.util.Scanner;

public class basicClass {
    public static void printhello ( ) {
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }
    public static int  calculateSum(int a, int b) {// parameters
        int sum=a+b;
        return sum;
    }
    public static int  factorial(int n) {
        int f=1;
        for (int i = 1; i <=n ; i++) {
            f=f*i;
        }
        return f;
    }
    public static void swap(int a, int b) {
        // swap
        int temp=a;
        a=b;
        b=temp;

    }
    public static int multiply(int a, int b) {
        int product=a*b;
        return product;

    }

    public static int bincoff(int n, int r) {
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);

        int bincoff=fact_n/(fact_r*fact_nmr);
        return bincoff;

    }
    // function overloading calc 2sum
//    public static int sum (int a, int b ) {
//        return a+b;
//
//    }
//    // function overloading calc 2sum
//    public static int sum(int a, int b,int c) {
//        return a+b+c;
//
//    }

    public static int sum(int a, int b) {
        return a+b;
    }

    public static float sum(float a,float b) {
        return a+b;

    }

//    public static boolean isPrime(int n) {
//        // only for n>=2
//        if (n == 2) {
//            return true;
//        }
//        for (int i = 2; i <n-1 ; i++) {             // is prime number
//            if (n%2 == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
    public static boolean isPrime(int n) {
        // only for n>=2
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n) {
        for (int i = 2; i <=n ; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }

    public static void binToDes(int binNum) {
        int pow=0;
        int decNum=0;

        while (binNum > 0){
            int lastDigit=binNum%10;
            decNum=decNum+( lastDigit * (int)Math.pow(2 ,pow));
            pow++;
            binNum=binNum /10;
        }
        System.out.println(" decimal of"+binNum+ " = " +decNum);
    }

    public static void decToBin(int n) {
        int myNum=n;
        int pow=0;
        int binum=0;

        while (binum > 0){
            int rem=n %2;
            binum=binum + ( rem* (int) Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println(" binary num "+ myNum + " = "+binum);

    }

    public static void main(String[] args) {
        decToBin(7);
    }
}
