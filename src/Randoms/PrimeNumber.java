package Randoms;

import java.util.*;

public class PrimeNumber {
    // Using function
    public static boolean Prime(int num){
        for ( int i = 2 ; i < num ; i++){
            if (num % i == 0) return false;
        }
        return true;
    }

    // Optimized Code
    public static boolean optimizedPrime(int num) {
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Number Check whether a Number is Prime or Not : ");
        int num = Sc.nextInt();
        /*
        Using Loop
        int flag = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag ++;
            }
        } if (flag == 0) {
            System.out.println("Given Number is Prime");
        } else {
            System.out.println("Given Number is Not Prime");
            System.out.println("Number of Divisor of "+num+" is " + (flag+1) );
        }
        */
        // Using Function
        if (Prime(num)) {
            System.out.println("Given Number is Prime");
        } else {
            System.out.println("Given Number is Not Prime");
//            System.out.println("Number of Divisor of "+num+" is " + (flag+1) );
        }

    }
}
/*
Prime Number :
*/