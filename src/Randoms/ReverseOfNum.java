package Randoms;

import java.util.*;

public class ReverseOfNum {
    public static void revNum(int num) {
        if (num < 10) {
            System.out.print(num);
            return;
        } else {
            System.out.print(num%10);
            revNum(num / 10);
        }
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        revNum(num);
        // Using Loop
        /*
        int rev = 0, rem = 0;
        for ( ; num != 0 ; num /= 10){
            rem = num % 10;
            rev = (rev *10) + rem ;
        }
        System.out.println(rev);
        */
    }
}
