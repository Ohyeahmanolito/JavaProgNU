/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentals.quiz;

/**
 *
 * @author ITRO
 */
public class LongExam2 {

    public static void main(String[] args) {

        int a = 1;
        int b = 4;
        int c = 5;
        int d = ((c / 10) - (c % 2) / 2);
        boolean e = !(!(!true && !false) || !true);
        int f = 0;
        a -= 2;
        if (a == 2) {
            System.out.println(" d");
            if ((b == 2) && (c % 2 == 1)) {
                a--;
            }
            a--;
            System.out.println(" e " + d);
        } else if (!true || !false) {
            b--;
            System.out.println(" f");
            if (c == 3) {
                c--;
            } else {
                System.out.println(" g " + f);
                c *= 2;
            }
            f = --b;
            System.out.println(" h " + e);
        }
        f *= 2;
        System.out.println(" i");

    }

}
