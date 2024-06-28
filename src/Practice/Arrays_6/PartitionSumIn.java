package Practice.Arrays_6;

import java.util.Scanner;

//Program to check if an array can be partitioned into sub-arrays with equal sum
public class PartitionSumIn {
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
            System.out.print(arr[i] + " ");
            //        System.out.println("Element " + (i + 1) + " = " + arr[i]);
        }
    }

    public static boolean partitionSum(int[] arr) {
        boolean cond = false; //main condition
        int part = 1; // partition
        int n = arr.length; // length of array

        while (part < n) { // partition < size of array
            int pSum = 0; // prefix Sum
            int sSum = 0; // suffix Sum
            int j = 0; // temp variable

            while (j < part) {
                pSum += arr[j];
                j++;
            }
            System.out.println("p" + pSum);

            int i = part;
            while (i < n) {
                sSum += arr[i];
                i++;
            }
            System.out.println("s" + sSum);
            part++;

            if (pSum == sSum) {
                cond = true;
                System.out.println("Index of i = " + part);
                return cond;
            }
            float avg = (float) ((pSum + sSum) % 2);
            if (avg != 0) {
                return cond;
            }

        }

        return cond;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 2, 6, 3, 1};
//        int[] arr = getArr();
//        System.out.println("Elements in Array are : ");
//        printArr(arr);
        System.out.println(partitionSum(arr));


//        {
//
//        int preSum = 0;
//        int sufSum = 0;
//        int i = 0;
//        int j = (arr.length - 1);
//        while (i >= j) {
//            if (preSum != sufSum && i >= j) {
//                preSum += arr[i];
//                i++;
//            }
//            sufSum += arr[j];
//            j--;
//
//            if (preSum == sufSum && i >= j) {
//                break;
//            }
//        }
//
//    }
    }
}
