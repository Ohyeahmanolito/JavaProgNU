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
public class Methods {

    public static void main(String[] args) {
        displayName("Im here"); // Need to pass a value with type String

        displayHello(); // Empty parameter method

        int x = getNumber(); // A method that returns a value (int) and stores in variable x
        System.out.println("x: " + x); // Print the value of x

        double sum = addNumbers(4, 5); // A method that returns the sum (double) and stores in variable sum.
        // Before returning, the sum is explicitly casted to become a double.
        System.out.println("sum: " + sum); // Print the value of sum

    }

    public static void displayName(String name) {
        System.out.println("inside displayName()");
        System.out.println("The input name is: " + name);
        System.out.println("done displayName()");
    }

    public static void displayHello() {
        System.out.println("inside displayHello()");
        System.out.println("hello hello hello");
        System.out.println("done displayHello()");
    }

    public static int getNumber() {
        int constantNumber = 1000;
        return constantNumber;
    }

    public static double addNumbers(int numb1, int numb2) {
        return (double) (numb1 + numb2);
    }

}
