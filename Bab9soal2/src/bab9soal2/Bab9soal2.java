/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab9soal2;

/**
 *
 * @author admin
 */

import java.util.Scanner;
public class Bab9soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Masukan bilangan awal: ");
       int nilaiAwal = scanner.nextInt();
       
       System.out.print("Masukan bilangan akhir: ");
       int nilaiAkhir = scanner.nextInt();
       
       System.out.println("Hasil deret bilangan: ");
       
       for (int i = nilaiAwal; i <= nilaiAkhir; i +=5){
           if (i != nilaiAwal) {
               System.out.print(", ");
           }
           System.out.print(i);
       }
       
       System.out.println();
       scanner.close();
    }
    
}
