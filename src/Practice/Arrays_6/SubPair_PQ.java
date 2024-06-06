package Practice.Arrays_6;

import java.util.Scanner;

public class SubPair_PQ {
    public static int[] getArr() {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int x = Sc.nextInt();
        System.out.println("Enter Elements in Array :: ");
        int[] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            arr[i] = Sc.nextInt();
        }
        System.out.println();
        return arr;
    }

    public static void printArr(int[] arr) {
        // System.out.println("Elements in Array Are :: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + (i + 1) + " = " + arr[i]);
        }
    }

    public static void SubP(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print("(" + arr[i] + "," + arr[j] + ") ");

                }
                System.out.println();
            }
        }

    }
}
