/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ITRO
 */
public class FileHandlingExceptionHandling {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\ITRO\\Desktop\\Sample input.txt";
        readFile(filePath);
    }

    public static void basicExceptionHandling() {

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number");
            int numb = input.nextInt();
        } catch (Exception err) {
            System.out.println("there is an error " + err);
        }
    }

    public static void multipleCatch() {
        try {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter a number");
//            int numb = input.nextInt();
            int[] arr = new int[4];
            arr[10] = 4;
        } catch (InputMismatchException mismatch) {
            System.out.println("mismatch");
        } catch (Exception err) {
            System.out.println("general error");
        }
    }

    public static void finallyBlock() {

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number");
            int numb = input.nextInt();
        } catch (Exception err) {
            System.out.println("general error");
        } finally {
            System.out.println("Im done");
        }
    }

    public static void readFile(String filePath) {
        try {
            FileReader fReader = new FileReader(filePath);
            BufferedReader bReader = new BufferedReader(fReader);

            String line = "";
            while ((line = bReader.readLine()) != null) {
                String[] perWord = line.split(",");

                for (int count = 0; count < perWord.length; count++) {
                    System.out.println(perWord[count]);
                }
            }
            bReader.close();
            fReader.close();

        } catch (Exception e) {
            System.out.println("file not found");
        }
    }
}
