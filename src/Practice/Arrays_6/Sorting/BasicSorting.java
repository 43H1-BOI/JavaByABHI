package Practice.Arrays_6.Sorting;

import java.util.Scanner;

public class BasicSorting {
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
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
// 5 4 3 1 2
    /*
    1st :-
        i = 0 --> 5
            j = 1 --> 4

            if(5 > 4){
                arr[i] = 4;
                arr[j] = 5;
            }

            j = 2 --> 3

            if
    */

    public static int[] BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] SelectionSort(int[] arr) {
//        int start = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    System.out.println();
                }

//                printArr(arr);
//                System.out.println();
            }
//            System.out.println();
        }
        return arr;
    }


    public static void main(String[] args) {
//        int[] arr = getArr();
//        System.out.println("Elements in Array are : ");
        int[] arr = {2, 7, 1, 0, 6};
        printArr(arr);
        System.out.println("\n : ");
//        printArr(BubbleSort(arr));
        printArr(SelectionSort(arr));
    }
}
