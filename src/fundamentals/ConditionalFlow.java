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
public class ConditionalFlow {

    public static void conditionaOne(String name) {
        if (name.length() == 4) {
            System.out.println("Your name '" + name + "' is exactly 4");
        }
    }

    public static void conditionalTwo(int numb1, int numb2) {
        if (numb1 > numb2) {
            System.out.println("first is highest");
        } else {
            System.out.println("second is highest");
        }
        System.out.println("Done for the condition");
    }

    public static int conditionalFour(int numb1, int numb2) {
        if (numb1 > numb2) {
            return numb1;
        } else if (numb1 < numb2) {
            return numb2;
        } else {
            return (numb1 + numb2);
        }
    }

    public static void conditionalThree(String val1, String val2, int numb1, int numb2) {

        if (val1.equals(val2) && ((numb1 < 4) && (numb2 < 4))) {
            System.out.println("match");
        } else if ((val1.length() > val2.length()) || (numb1 > numb2)) {
            System.out.println("bad");
        } else {
            System.out.println("none");
        }
    }

    public static void complexExample() {
        Scanner input = new Scanner(System.in);
        System.out.println("Op: ");
        int op = input.nextInt();
        if (op == 1 || op == 2) {
            System.out.println("number2: ");
            int numb2 = input.nextInt();
            System.out.println("number3: ");
            int numb3 = input.nextInt();

            if (op == 1) {
                System.out.println("output: " + complexExampleAdd(numb2, numb3));
            } else {
                System.out.println("output: " + complexExampleMultip(numb2, numb3));
            }
        } else {
            System.out.println("no operation");
            System.exit(0);
        }
    }

    public static int complexExampleAdd(int numb1, int numb2) {
        return numb1 + numb2;
    }

    public static double complexExampleMultip(int numb1, int numb2) {
        return (double) numb1 * numb2;
    }
}
