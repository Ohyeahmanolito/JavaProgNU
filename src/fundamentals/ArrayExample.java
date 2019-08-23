/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentals;

import java.util.Scanner;

/**
 *
 * @author ITRO
 */
public class ArrayExample {

    public static void main(String[] args) {
//        String input = "Donkey";
//        perChar(input);
        int[] arr = {1, 10, 3, 4, 64, 32};
        swappingRightToLeft(arr);
        changeValue(arr, 1000);
    }

    /**
     * The method will display the values of b, c, and d
     */
    public static void tracing() {
        int[] arr = {0, 1, 2, 1};
        int[] arr2 = new int[arr.length];
        for (int counter = 0; counter < arr.length; counter++) {
            arr2[counter] = arr[counter] * 2;
        }

        // increment before storing.
        int b = ++arr[2];

        // store before increment.
        int c = arr2[3]++;

        int d = 0;
        for (int x = 1; x < 2; x++) {
            for (int y = 0; y < 1; y++) {
                d += arr[1];
            }
        }

        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
    }

    public static void arrayBasicExample(int size, int index) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[size];

        // Populating the values of array
        // NOTE: It was intentially printed the start of array idx to one 
        for (int counter = 0; counter < arr.length; counter++) {
            System.out.println("idx " + (counter + 1) + ":");
            arr[counter] = input.nextInt();
        }

        // This displays the index that the user wants.
        System.out.println("what index you want to get the value? " + index);

        // This displays the array value at minus one index.
        System.out.println("output: " + arr[index - 1]);
    }

    /**
     * This method will swap the values of an adjacent index in an array
     *
     * @param size the size of the array.
     */
    public static void adjacentArr(int size) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[size];

        // populating the values of array
        for (int counter = 0; counter < arr.length; counter++) {
            System.out.println("idx " + counter + ":");
            arr[counter] = input.nextInt();
        }

        //swapping
        for (int count = 1; count < arr.length; count++) {
            int temp = arr[count];
            arr[count] = arr[count - 1];
            arr[count - 1] = temp;
        }
    }

    /**
     * This method will display all the characters of an input string.
     *
     * @param value the string that will be sliced.
     */
    public static void perChar(String value) {
        // Convert the string into array
        char[] charArr = value.toCharArray();

        // Displaying the values of the character array.
        for (int counter = 0; counter < charArr.length; counter++) {
            System.out.println(charArr[counter] + " ");
        }
    }

    /**
     * This method will display all the characters of an input string.
     *
     * @param value the string that will be sliced.
     */
    public static void perCharV2(String value) {

        for (int counter = 0; counter < value.length(); counter++) {

            // Accessing each character of the string.
            System.out.println(value.charAt(counter));
        }
    }

    /**
     * This method will reverse the values of the passed array.
     *
     * @param arr input array that will be reversed.
     */
    public static void swappingRightToLeft(int[] arr) {

        System.out.println("before swapped");

        // This is a for-each loop. Another version of looping. 
        // Printing the passed values of the array.
        for (int temp : arr) {
            System.out.print(temp + ", ");
        }

        // Swapping part of the code.
        for (int counter = 0; counter < (arr.length / 2); counter++) {
            int end = arr.length - 1 - counter;

            int temp = arr[counter];
            arr[counter] = arr[end];
            arr[end] = temp;
        }

        System.out.println("");
        System.out.println("swapped");

        // Printing the swapped values of the array
        for (int temp : arr) {
            System.out.print(temp + ", ");
        }
    }

    /**
     * This method will edit the values of the passed array using the value of
     * the index passed.
     *
     * @param arr is the input array that will be reversed.
     * @param valIndex is the index to identify what value will be used to edit
     * the arrays.
     */
    public static void changeValue(int[] arr, int valIndex) {

        // Checking whether the passed value is greater than the array length.
        if (valIndex >= arr.length) {
            System.out.println("wrong input");
        } else {
            System.out.println("Before change");

            // Printing the values of array.
            for (int temp : arr) {
                System.out.print(temp + ", ");
            }
            System.out.println("");
            System.out.println("After change");

            // Changing the values of the array based on the passed index.
            int temp = arr[valIndex];
            for (int counter = 0; counter < arr.length; counter++) {
                arr[counter] = temp;
            }

            // Printing the values of array.
            for (int number : arr) {
                System.out.print(number + ", ");
            }
        }
    }

}
