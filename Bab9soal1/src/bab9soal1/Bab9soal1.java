/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab9soal1;

/**
 *
 * @author admin
 */

public class Bab9soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            int j = 1;

            while (j <= i) {
                System.out.print("* ");
                j++;
            }

            System.out.println();
            i++; // TODO code application logic here
        }

    }
}
