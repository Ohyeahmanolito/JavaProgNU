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
public class LongExam3 {

    public static void main(String[] args) {
        OneDimArray();
    }

    public static void OneDimArray() {
        int a[] = {10, 3, 2, 5, 3, 6};
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length - 2; j++) {
                if (a[i] > a[j + 1]) {
                    temp = a[i];
                    a[i] = ++a[j];
                    a[j] = temp - 2;
                }
            }
        }
        for (int x : a) {
            System.out.print(x + " *");
            System.out.println("");
        }
    }

    public static void TwoDimArray() {
        int[][] scores = {{10, 3, 2},
        {5, 3, 6},
        {5, 3, 6, 1, 2}};
        int i = scores[2][3];
        while (i < scores.length) {
            int j = 1;
            while (j < scores[i].length) {
               
                if (j >= scores.length) {
                    break;
                }
                scores[i][j] = scores[j][i];
                j++;
            }
            i++;
        }

        for (int[] y : scores) {
            for (int x : y) {
                System.out.print(x + " ");
            }
        }
    }
}
