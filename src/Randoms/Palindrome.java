package Randoms;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        int rem = 0 , rev = 0 , temp = num;
        for (; num != 0; num /= 10) {
            rem = num % 10;
            rev = (rev*10) + rem;
        }
        if (temp == rev) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");

    }
}
/*
Palindrome Program in Java
 151 --> Palindrome
 153 --> Not

    Logic ::
    rev = 0
    num = 151
    rem = num % 10 --> 151 % 10 = 1
    num /= 10 --> 151 / 10 = 15
    rev = (rev*10) + rem --> 0*10 + 1 = 1
    {Repeat this Until }

 num = 15
    rem = num % 10 --> 15 % 10 = 5
    num /= 10 --> 15 / 10 = 1
    rev = (rev*10) + rem --> 1*10 + 5 = 15

    num = 1
    rem = num % 10 --> 1 % 10 = 1
    num /= 10 --> 1 / 10 = 0
    rev = (rev*10) + rem --> 15*10 + 1
*/