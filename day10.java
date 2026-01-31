
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int[][] a = new int[3][3];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int l = in.nextInt();
                a[i][j] = l;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += a[i][j];
            }
            System.out.println("");
        }
        System.out.println(sum);
    }

}
/******************************************************************************
 * 
 * Online Java Compiler.
 * Code, Compile, Run and Debug java program online.
 * Write your code in this editor and press "Run" button to execute it.
 * 
 *******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int small;
        int[][] a = new int[3][3];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int l = in.nextInt();
                a[i][j] = l;
            }
        }
        small = a[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                if (small > a[i][j]) {
                    small = a[i][j];
                }

            }
            System.out.println("");
        }
        System.out.println(small);
    }

}
/******************************************************************************
 * 
 * Online Java Compiler.
 * Code, Compile, Run and Debug java program online.
 * Write your code in this editor and press "Run" button to execute it.
 * 
 *******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int max = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int l = in.nextInt();
                a[i][j] = l;
            }
        }

        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += a[i][j];
            }
            if (max <= sum) {
                max = sum;
            }
        }
        System.out.println(max);

    }

}
/******************************************************************************
 * 
 * Online Java Compiler.
 * Code, Compile, Run and Debug java program online.
 * Write your code in this editor and press "Run" button to execute it.
 * 
 *******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int[][] a = new int[3][3];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int l = in.nextInt();
                a[i][j] = l;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[j][i] + " ");

            }
            System.out.println("");
        }
    }

}