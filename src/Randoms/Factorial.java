package Randoms;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter a Number to Find Factorial : ");
        int num = Sc.nextInt();
        double fact = 1;
//        for (int i = 1 ; i <= num ; i++){
//            fact *= i;
//        }
        for (int i = num; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
}
/*
    Factorial Number Program in Java
    num! = num * (num-1) * (num-2) * ... 2 * 1
*/
