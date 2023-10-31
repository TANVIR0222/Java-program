public class StarPrint {
    public static void inverted_rotated_half_pyramidNumber(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print(j+" ");

            }
            System.out.println();
        }
    }
    public static void inverted_rotated_half_pyramidHa(int n){
        int counter=1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println();

        }

    }

    public static void Zero_one_triangle(int n) {
        //outer loop
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                if ((i+j)%2==0) {
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n) {
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
            }
            System.out.println();

        }

    }

    public static void solid_rhombus(int n) {
        for (int i = 1; i <=n ; i++) {
            //spase
            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print(" ");

            }
            // star 
            for (int j = 1; j <=n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void holo_Rectangle(int totRow,int totcol){
        // outer loop
        for (int i = 1; i <=totRow ; i++) {
            //inner colums
            for (int j = 1; j <=totcol ; j++) {
                //cell -(i,j)
                if (i==1 || i==totRow || j==1 || j==totcol) {
                    //boundery cell
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void holo_rhombus(int n) {
        for (int i = 1; i <=n ; i++) {
            //spase
            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n ; j++) {
                if (i == 1 || i==n || j == 1 || j == n) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

    public static void diamond(int n) {
        //outer loops
        for (int i = 1; i <=n ; i++) {
            // spase
            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <=(2*i)-1 ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i=n; i>=1 ; i--) {
            // spase
            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <=(2*i)-1 ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //inverted_rotated_half_pyramid(5,5);
       // inverted_rotated_half_pyramidNumber(5);
       // inverted_rotated_half_pyramidHa(5);
        // Zero_one_triangle(5);
       // solid_rhombus(5);
        //holo_rhombus(5);
    }
}
