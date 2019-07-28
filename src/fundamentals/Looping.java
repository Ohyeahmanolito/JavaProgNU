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
        printStar();
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

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

}
