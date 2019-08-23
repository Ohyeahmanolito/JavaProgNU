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
public class ArraysExample {

    public static void main(String[] args) {
//        String input = "Donkey";
//        perChar(input);
 //       int[] arr = {1, 10, 3, 4, 64, 32};
 //       swappingRightToLeft(arr);
    }

    public static void perCharV2(String param) {

        for (int counter = 0; counter < param.length(); counter++) {
            System.out.println(param.charAt(counter));
        }
    }

    public static void example(int size, int index) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[size];

        // populating the values of array
        // NOTE: I intentially  display the start of array idx to one 
        for (int counter = 0; counter < arr.length; counter++) {
            System.out.println("idx " + (counter + 1) + ":");
            arr[counter] = input.nextInt();
        }

        // This displays the index that the user wants.
        System.out.println("what index you want to get the value? " + index);
        // This displays the array value at minus one index.
        System.out.println("output: " + arr[index - 1]);
    }

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

    public static void tracing() {
        int[] arr = {0, 1, 2, 1};
        int[] arr2 = new int[arr.length];
        for (int counter = 0; counter < arr.length; counter++) {
            arr2[counter] = arr[counter] * 2;
        }
        int b = ++arr[2];
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

    public static void perChar(String value) {
        char[] charArr = value.toCharArray();

        for (int counter = 0; counter < charArr.length; counter++) {
            System.out.println(charArr[counter] + " ");
        }
    }

}
