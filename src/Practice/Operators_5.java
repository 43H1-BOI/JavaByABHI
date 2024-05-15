package Practice;

public class Operators_5 {
    public static void main(String[] args){
        int a =  9 ; // Assignment Operator
        int b = 4 ;
        b += 3 ; //  This is Also Assignment Operator
        System.out.println("Value of A = " + a + " And Value of B = " + b);

        // Arithmetic Operator
        System.out.println("Sum of a and b is " + (a+b));

       if ( a == b ) { // Comparison Operator
           System.out.println("Equal");
       } else System.out.println("Not Equal");

       boolean c = true;
       System.out.println(a>b && a==b); // Logical Operator
       System.out.println("Not of True is " + (!c) );

       // Bitwise Operator operates with bits ( &,| )
    }
}
