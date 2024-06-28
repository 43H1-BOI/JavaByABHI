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
        boolean cond = false; //kinda flag
        int part = 1; // partition is starting from 1st index b'coz common sense
        int n = arr.length; // length of array
        int pSum = 0; // prefix Sum
        int sSum = 0; // suffix Sum

        while (part < n) { // partition < size of array
            pSum = 0;
            sSum = 0;
            int j = 0; // pSum Variable

            // pSum must run till partition index (-1)
            while (j < part) {
                pSum += arr[j];
                j++;
            } // Prefix Sum Found
            System.out.println("Prefix Sum = " + pSum);

            // sSum must starts from partition index to end of array
            int i = part; // temp variable for sSUm
            while (i < n) {
                sSum += arr[i];
                i++;
            } // Suffix Sum Found
            System.out.println("Suffix Sum = " + sSum);

            // This Condition will be Checked only once to save our resources
            if (part == 1) {
                // This Condition means if Partition Sum Exists for any array then
                // it will not follow below condition
                float avg = (float) ((pSum + sSum) % 2);
                if (avg != 0) {
                    System.out.println("Sorry Mitr");
                    return cond;
                }
                // This Condition just says if partition sum exists then sum of pSum and sSum must be an even number
            }


            // This Checks if Partition Sum found then will return true
            if (pSum == sSum) {
                cond = true;
                System.out.println("Index of Partition = " + part);
                return cond;
            }

            part++; // Partition Index Moved 1 Step Forward if No Partition Sum Found
        }

        return cond; // means no partition found
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
