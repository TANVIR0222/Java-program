public class DivideAndConquer {
    public static void printArray(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void MargeSort(int [] arr, int si,int ei ) {
        if (si >= ei){
            return;
        }

        int mid=si+(ei-si)/2;
        MargeSort(arr, si, mid);//left side
        MargeSort(arr, mid+1, ei);//right side
        Marge(arr,si,mid,ei);
    }

    public static void Marge(int [] arr, int si,int mid,int ei) {
        // mid
        int []temp=new int[ei-si+1]; // temp
        int i=si;// idx for left side margeSort
        int j=mid+1;// idx right side margeSort
        int k=0; //temp


        while (i <= mid && j <= ei){
            if (arr[i] < arr[j]) {
               temp[k] = arr[i];
               i++;
            }else {
                temp [k] = temp[j];
                j++;
            }
            k++;
        }
        // for leftover elements of list sorted path
        while (i <= mid){
            temp[k++]=arr[i++];
        }
        // for RightOver elements of list sorted path

        while (j <= mid+1){
            temp[k++]=arr[j++];
        }
        // copy temp to original arr
        for ( k = 0 , i=si; k < temp.length ; k++ , i++) {
            arr[i]=temp[k];
        }


    }

    public static void quickSort(int [] arr , int si,int ei) {
        if (si >= ei){
            return;
        }
       int pIdx=  partition(arr , si,ei);
       quickSort(arr, si, pIdx-1);//left
       quickSort(arr, pIdx+1 , ei);// right

    }

    public static int partition(int [] arr, int si ,int ei) {
        int pivod=arr[ei];
        int i = si - 1;

        for (int j = si; j <ei ; j++) {
            if (arr[j] <= pivod){
                i++;

                // swap

                int temp =arr [j];
                arr[j]= arr [i];
                arr [i] =temp;
            }
        }
        i++;
        int temp =pivod;
        arr[ei]= arr [i];
        arr [i] =temp;
        return i;

    }

    public static int search(int [] arr,int tar, int si,int ei ) {
        if (si > ei) {
            return -1;
        }
        // mid
        int mid =si + (ei - si)/ 2;

        //case a: left
        if (arr[mid] == tar ) {
            return  mid;
        }
        if (arr[si] <=arr[mid]){
            if(arr[si] <= tar && tar <=mid){
               return search(arr, tar, si, mid -1 );
            }else {
                // case b: right
                return  search(arr, tar, mid + 1, ei);
            }
        }
        // mid on  l2
        else {
           // case c:right
            if (arr[mid] <= tar && tar <=ei) {
               return search(arr, tar, mid +1, ei);
            }
            else {
              return search(arr, tar, si, mid-1);
            }
        }


    }

    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=0;
       int tarIdx= search(arr,target,0,arr.length-1 );
        System.out.println(tarIdx);
    }
}
