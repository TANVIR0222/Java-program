import java.util.ArrayList;
import java.util.Collections;
import  java .util.*;

public class ArrayDsa {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        // add element
        int temp= list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);




    }

//    public static int storeWater(ArrayList<Integer>height) {
//        int maxWater=0;
//        //brute force
//        for (int i = 0; i < height.size() ; i++) {
//            for (int j = i+1; j < height.size(); j++) {
//                 int ht=Math.min(height.get(i), height.get(j) );
//                 int with=j-1;
//                 int cru=ht * with;
//                 maxWater=Math.max(maxWater,cru);
//
//
//            }
//        }
//        return maxWater;
//
//    }

    // 2 pointer

    public static int  StoreWater(ArrayList <Integer> height) {
        int maxWater=0;
        int lp=0;
        int rp=height.size()-1;

        while (lp < rp){
            // calc water
            int ht=Math.min(height.get(lp),height.get(rp) );
            int wt=rp-lp;
            int curr=ht*wt;
            maxWater=Math.max(maxWater,curr);

            if (height.get(lp) < height.get(rp)){
                lp++;
            }
            else {
                rp--;
            }
        }
        return maxWater;
    }
    // 2

    public static boolean PairSum1(ArrayList<Integer>height, int target) {


        int lp=0;
        int rp=height.size()-1;
//        if(lp < rp){
//            return false;
//        }


            while (lp != rp){
            if (height.get( lp)  + height.get( rp)  == target){
                return true;
            }
            if (height.get( lp)  + height.get( rp)  < target) {
                lp++;

            }else {
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        ArrayList<Integer>height=new ArrayList<>();

        height.add(4);
        height.add(2);
        height.add(0);
        height.add(3);
        height.add(2);
        height.add(5);

        System.out.println((height));
       // 4,2,0,3,2,5;

    }
}
