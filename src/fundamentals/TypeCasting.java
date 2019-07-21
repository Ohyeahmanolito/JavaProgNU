/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentals;

/**
 *
 * @author ITRO
 */
public class TypeCasting {

    public static void main(String[] args) {
        implicit();
        explicit();
    }

    /**
     * EXPLICIT CASTING
     */
    public static void implicit() {
        double d = 3.5;
        int i;
        i = (int) d;    // Cast "double" value of 3.5 to "int" 3. Assign the resultant value 3 to i
        // Casting from "double" to "int" truncates.

        System.out.println("d: " + d);
        System.out.println("i: " + i);
    }

    /**
     * IMPLICIT CASTING
     */
    public static void explicit() {
        int f = 3;
        double g;
        g = f;           // OK, no explicit type casting required
        // d = 3.0
        g = (double) f;   // Explicit type casting operator used here
        double aDouble = 55;   // Compiler auto-casts int 55 to double 55.0
        double nought = 0;     // Compiler auto-casts int 0 to double 0.0
        // int 0 and double 0.0 are different.

        System.out.println("f: " + f);
        System.out.println("g: " + g);
        System.out.println("aDouble: " + aDouble);
        System.out.println("nought: " + nought);
    }
}
