package Randoms;

import java.util.*;
// Fibonacci series --> 0 1 1 2 3 5 8 13 21 ...
// n = (n-1) + (n-2)

public class FibonacciSeries {
    public static void Fibb(int count) {
        int n1 = 0, n2 = 1, n3;
        System.out.println("Fibonacci Series ( " + count + " times )::");
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

    /*
    public void FibbRecursion(int count, int i1) {
        int n1 = 0 , n2 = 1 , n3 ;
        if (i1 == 0) {
            System.out.println(" 0");
        } else if (i1 == 1) {
            System.out.println(" 1");
        } else {
            for (int i = i1 ; i < count; i++) {
                n3 = n2 = n1;
                System.out.println(" "+ n3);
                n1=n2;
                n2=n3;
                FibbRecursion(count, i);
            }
        }
    }
    */

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Program to Generate Fibonacci Series :: ");
        System.out.print("Enter Count of Fibonacci Series :: ");
        int count = Sc.nextInt();
//        Fibb(count);
//        FibbRecursion(count,1);
    }
}
