package Practice.Arrays_6;

import java.util.Scanner;

public class UniqueElementIn {
    static Scanner Sc = new Scanner(System.in);

    public static int[] getArr() {
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

    public static void printArr(int[] arr) {
        // System.out.println("Elements in Array Are :: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + (i + 1) + " = " + arr[i]);
        }
    }

    public static void uniqueElement(int[] arr) {
        boolean flag = true;
//        int[] unique = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("Unique Element in Array are Present in Array");
        } else {
            System.out.println("There is No Unique Element present in Given Array");
        }
    }

    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println("Elements in Array are : ");
        printArr(arr);
        System.out.println("\n : ");
        uniqueElement(arr);
    }
}
