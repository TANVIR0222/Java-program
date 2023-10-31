import java.util.Scanner;
public class TowDArray {
//    public static boolean search(int [][] matrix, int key) {
//
//        for (int i = 0; i < matrix.length ; i++) {
//            for (int j = 0; j < matrix[0].length ; j++) {
//
//                if (matrix[i][j]==key){
//                    System.out.println(" key is index ("+i + ","+j+")");
//                    return true;
//                }
//            }
//        }
//        System.out.println("sorry");
//        return false;
//    }
//    public static void main(String[] args) {
//        int matrix[][]=new int [3][3];
//        Scanner sc=new Scanner(System.in);
//        int largest=Integer.MIN_VALUE;
//        int smallest=Integer.MAX_VALUE;
//
//        int n=matrix.length,m=matrix[0].length;
//        for (int i = 0; i <n ; i++) {
//            for (int j = 0; j <m ; j++) {
//                matrix[i][j] = sc.nextInt();
//
//            }
//        }
//        for (int i = 0; i <n ; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(matrix[i][j] + " ");
//
//            }
//            System.out.println();
//        }
//        search(matrix,6);
//    }
//public static void spiralPrint(int [][] matrix) {
//    int startRow=0;
//    int startCol=0;
//    int endRow= matrix.length-1;
//    int endCol= matrix[0].length-1;
//
//    while (startRow <= endRow && startCol <=endCol){
//        // top
//
//        for (int j = startRow; j <=endCol ; j++) {
//            System.out.print(matrix[startRow][j]+" ");
//        }
//        for (int i = startRow+1; i <=endCol ; i++) {
//            System.out.print(matrix[i][endCol]+ " ");
//        }
//        for (int j =endCol-1; j >= startCol ; j--) {
//            if (startRow == endRow) {
//                break;
//            }
//            System.out.print(matrix[endRow][j]+ " ");
//        }
//        for (int i = endCol-1; i >=startCol+1 ; i--) {
//            if (startCol == endCol ) {
//                break;
//            }
//            System.out.print(matrix[i][startCol] + " ");
//        }
//        startRow++;
//        startCol++;
//        endRow--;
//        endCol--;
//    }
//    System.out.println();
//
//}
public static int diagonalSum (int [] [] matrix) {
//    int sum=0;
//    for (int i = 0; i <matrix.length ; i++) {            0(n^2) time complex
//        for (int j = 0; j <matrix[0].length ; j++) {
//            if (i==j){
//                sum+=matrix[i][j];
//            }else {
//                if (i+j == matrix.length-1) {
//                    sum+=matrix[i][j];
//                }
//            }
//        }
//    }
//    return sum;


    int sum=0;
    for (int i = 0; i < matrix.length ; i++) {
        sum+=matrix[i][i];
        if (i != matrix.length-1-i)
            sum+=matrix[i][matrix.length-1-i];


    }
    return sum;
}

    public static boolean searchMatrix(int[] [] matrix, int key) {
        int row=0 , col=matrix[0].length-1;
        while (row < matrix.length && col >=0){
            if (matrix[row][col] == key){
                System.out.println("key found  (" + row+ "," + col+")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            }else {
                row++;
            }
        }
        System.out.println(" not ");
        return false;
    }

    public static void main(String[] args) {
    int [][] matrix={{10,20,30,40,},
                     {15,25,35,45},
                     {27,29,37,48},
                     {32,33,39,50}};
      int  key=33;
        System.out.println(searchMatrix(matrix,key));

   }

}
