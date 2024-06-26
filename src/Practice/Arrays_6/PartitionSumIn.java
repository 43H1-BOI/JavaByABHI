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

    public static void prefixSum(int[] arr) {


    }

    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println("Elements in Array are : ");
        printArr(arr);

        int preSum = 0;
        int sufSum = 0;

        int i = 0;
        int j = (arr.length - 1);
        while (i >= j) {
            if (preSum != sufSum && i >= j) {
                preSum += arr[i];
                i++;
            }
            sufSum += arr[j];
            j--;

            if (preSum == sufSum && i >= j) {
                break;
            }
        }

    }
}
