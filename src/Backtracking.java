public class Backtracking {
    public static void   changeArr(int [] arr,int i , int val ) {
        // base case
        if (i == arr.length){
            printArr(arr);
            return ;
        }

        //recursion
        arr[i] = val;
        changeArr(arr, i+1, val+1);
        arr[i]= arr[i] -2;

    }

    public static void printArr(int [] arr) {
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void fineStrSub(String  str , String ans , int i) {
        // base case
        if (i == str.length()){
            System.out.println(ans);
            return;
        }

        //yes
        fineStrSub(str, ans+ str.charAt(i), i+1);
        // no
        fineStrSub(str, ans, i+1);

    }

    public static void findPermutation(String str ,String ans) {
        // base case
        if (str.length() == 0){
            System.out.println(ans);
            return;
        }

        // recursion

        for (int i = 0; i <str.length() ; i++) {
            char curr=str.charAt(i);
            String Newstr=str.substring(0,i) + str.substring(i+1);
            findPermutation(Newstr,ans+curr);

        }

    }

    public static void main(String[] args) {
    }
}
