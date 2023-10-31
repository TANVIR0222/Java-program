public class Array {
    public static int searchNumber (int  [] number ) {
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for (int i = 0; i <number.length ; i++) {
            if(largest <number[i]){
                largest=number[i];
            }
            if (smallest >number[i]){
                smallest=number[i];
            }
        }
        System.out.println("smallest Number :"+smallest);
        return largest;
    }

    public static int  binary(int number[],int key) {

        int start=0,end= number.length -1;
        while (start <= end){
            int mid=(start + end)/2;
            if (number[mid] ==key ) {
                return mid;
            }
            if (number[mid] < key) {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return -1;
    }

    public static void revers(int number[]) {
        int first=0,last= number.length-1;
        while (first < last){
            int temp=number[last];
            number[last]=number[first];
            number[first]=temp;
            first++;
            last--;
        }
    }

    public static void pairPrint(int [] number) {
        int tp=0;
        for (int i = 0; i <number.length ; i++) {
            int curr=number[i];
            for (int j =0; j <i+1 ; j++) {
                System.out.print("(" +curr+","+number[j]+")" );
                tp++;

            }
            System.out.println();
        }
        System.out.println("Total pair  "+ tp);
    }
    public static void subArray(int [] number ) {
       int cur=0;
       int max=Integer.MIN_VALUE;
        int []prefix=new  int [number.length-1];

        prefix[0]=number[0];
        for(int i=1; i<= prefix.length; i++){
            prefix[i]=prefix[i+1]+number[i];
        }

        for(int i= 0; i<= number.length; i++){
            for(int j = i+1 ; j<number.length; j++){
                cur= i ==0 ? prefix[j ]: prefix[j]-prefix[i-1];

                if (max < cur) {
                    max=cur;

                }
            }

        }
        System.out.println("max number "+max);

    }
    public static void kedanSum(int number[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;

        for (int i = 0; i < number.length; i++) {
            cs=cs+ number[i];
            if (cs <0){
                cs=0;
            }
            ms=Math.max(ms,cs);

        }
        System.out.println(" our max sum : " +ms);
    }

    public static int trappedRainWatter(int [] height) {
        int n=height.length;

        // calculate left max boundary
        int[] letMax=new int[n];
        letMax[0]=height[0];
        for(int i=1; i < n ; i++){
            letMax[i]=Math.max(height[i],letMax[i-1]);
        }
        // calculate right max boundary

        int [] right=new int [n];
        letMax[n-1]=height[n-1];
        for (int i =n-2; i>=0; i--){
            right[i]=Math.max(height[i],right[i+1]);
        }
        int trappedWater=0;
     //   loop
        for (int i= 0 ; i< n ;i++){
            int waterLevel= Math.min(letMax[i],right[i] );
            trappedWater +=waterLevel-height[i];

        }
        return trappedWater;
    }

    public static void pe(int [] height ) {
        int n=height.length;
        int []leftMax=new int [n];
        leftMax[0]=height[0];
        for (int i = 1; i <n ; i++) {
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }

    }

    public static int  buyAndSellStocks(int [] price) {
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i = 0; i < price.length ; i++) {
            if (buyPrice < price[i]) { // profit
                int profit=price[i]-buyPrice;// today profit
                maxProfit=Math.max(maxProfit,profit);

            }else {
                buyPrice=price[i];
            }

        }

        return maxProfit;
    }
    public static void main(String[] args) {
       int [] number={4,2,1,6,3,2,5};
//        int key=10;
//        revers(number);
//        for (int i = 0; i <= number.length-1 ; i++) {
//            System.out.print(number[i]+" ");
//        }
//        System.out.println();
//        pairPrint(number);
//        subArray(number);
//        subArray(number);
//        kedanSum(number);
//        System.out.println(trappedRainWatter(height));
//
        searchNumber(number);


    }
}
