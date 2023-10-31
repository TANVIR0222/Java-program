import java .util.*;
public class Sort {public static void bubble(int [] arr) {
    for (int turn = 0; turn <arr.length-1 ; turn++) {
        for (int j = 0; j < arr.length-1-turn ; j++) {
            if (arr[j] > arr[j+1]){
                // swap

                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }

        }

    }
}
    public static void PrintArray(Integer [] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1 ; i++) {
            int mimPos=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[mimPos] > arr[j]){
                    mimPos = j;
                }
            }
            //swap
            int temp=arr[mimPos];
            arr[mimPos]=arr[i];
            arr[i]=temp;

        }

    }

    public static void insertionSort(Integer [] arr) {
        for (int i = 1; i < arr.length ; i++) {
            int curr=arr[i];
            int prev=i-1;

            while (prev >=0 && arr[prev]>curr){
                arr[prev +1]= arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }

    }
    public static void main(String[] args) {
        Integer []arr={4,5,1,2,3};
        Arrays.sort(arr,0,3, Collections.reverseOrder());
        PrintArray(arr);


    }
}
