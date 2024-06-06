package Practice.Arrays_6;

import java.util.Scanner;

public class Rev2 {
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
        return arr;
    }

    public static int[] Rev(int[] arr) {
        int[] rev = new int[arr.length];
        int j = (arr.length - 1);
        int i = 0;
        while (i < arr.length) {
            rev[i] = arr[j];
            j--;
            i++;
        }
        return rev;
    }

    public static void printArr(int[] arr) {
        // System.out.println("Elements in Array Are :: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + (i + 1) + " = " + arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int[] arr = getArr();
        printArr(arr);
        printArr(Rev(arr));

    }
}
