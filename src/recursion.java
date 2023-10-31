public class recursion {
    // print Decreasing number
    public static void PrintDec(int n) {
        //base case
        if (n == 1){
            System.out.println(n);
            return;
        }
        // print n Number
        System.out.print(n + " ");
        //recursion
        PrintDec(n-1);


    }
// Print increasing number
    public static void printInc(int n) {
        // Base case
        if (n == 1){
            System.out.print(n  +  " ");
            return;
        }
        //recursion
        printInc(n-1);
        // print n Number
        System.out.print(n + " ");


    }
    //print sum of first natural number
    public static int calcSum(int n ) {
        // base case
        if (n == 1){
            return 1;
        }
        // function F(n-1) call
        int Snm1=calcSum(n-1);
        // function N+F(n-1) call
        int Sn=n * Snm1;
        return Sn;
    }
    //print Nth Fibonacci Number
    public static int  fbc(int n) {
        //base case
        if (n == 0 || n == 1){
            return n;
        }

        // first number
        int fnm1=fbc(n-1);
        // second number
        int fnm2=fbc(n-2);
        // total number sum
        return fnm1+fnm2 ;
    }
    // sort Array check
    public static boolean isSort(int arr[],int i) {
        //base case
        if (i == arr.length-1){
            return true;
        }

        // false
        if (arr [i] > arr[i+1]){
            return false;
        }
        // sort arr check
       return isSort(arr,i+1);
    }
    //Find the first occurrence of an element  in an array
    public static int  firstoccurrence(int [] arr,int k ,int i) {
        // base case
        if (i == arr.length){
            return -1;
        }
        // first index check ? index
        if (arr[i] == k ){
            return i;
        }
       return firstoccurrence(arr, k, i+1);
    }
    //Find the last occurrence of an element  in an array
    public static int  LastOccurrence(int [] arr , int k, int i) {
        //base
        if (i == arr.length) {
            return -1;
        }
        int isFound=LastOccurrence(arr, k, i+1);

        if ( isFound == -1 && arr[i] == k){
            return i;
        }
        return isFound;

    }
// print 2^n
    public static int pow(int x,int n) {
        if (n == 0){
            return 1;
        }

        return  x * pow(x, n-1);
    }
// optimize print 2^n
    public static int  optimizePow(int a , int n) {
        // base case
        if (n == 0) {
            return 1;
        }
        // n is even
        int halfPowSq=optimizePow(a, n/2);
       int halfPowOp= halfPowSq * halfPowSq;
       // n is odd
        if (halfPowOp != 0){
            halfPowOp = a * halfPowOp;
        }
        return halfPowOp;
    }
    // tali horizontal and vertical

    public static int  printTali(int n) {
        if (n==0 || n == 1){
            return n;
        }
        return printTali(n-1)+printTali(n-1);

    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,8,5,6,7,5,9,0};
        System.out.println(printTali(3));
    }
}
