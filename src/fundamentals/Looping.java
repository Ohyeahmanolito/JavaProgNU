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
public class Looping {

    public static void main(String[] args) {
        printContNumber(3);
    }

    /**
     * Add all numbers from 1 to end.
     *
     * @param end terminator of the loop.
     *
     * @return sum of numbers.
     *
     */
    public static int getSumOfNumbers(int end) {
        int sum = 0;
        for (int count = 1; count <= end; count++) {
            sum += count;
        }
        return sum;
    }

    /**
     * Display a star pattern using nested loop.
     */
    public static void printStar() {

        //row part
        for (int row = 0; row < 4; row++) {

            //col part
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    /**
     * Display a star pattern using nested loop.
     *
     * @param size the end of the loop
     */
    public static void printStarWithParam(int size) {
        // row part
        for (int row = 0; row <= size; row++) {

            //col part
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    /**
     * Display a star pattern using nested loop.
     *
     * @param size the end of the loop
     */
    public static void printStarOpposite(int size) {

        // outer loop
        for (int row = 0; row <= size; row++) {

            // loop for the space
            for (int space = size; row < space; space--) {
                System.out.print(" ");
            }

            // loop to display the star
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }

    /**
     * Display a number pattern using nested loop.
     *
     * @param size the end of the loop
     */
    public static void printContNumber(int size) {
        int total = 0;
        // outer loop
        for (int row = 1; row <= size; row++) {

            // loop for col
            for (int col = 1; col <= row; col++) {
                // continuously add the value
                total++;
                System.out.print(total + " ");
            }

            System.out.println("");
        }
    }

}
