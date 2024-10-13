/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab13soal1;

/**
 *
 * @author admin
 */
public class Bab13soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        kalkulator objek = new kalkulator();
        System.out.println("Hasil Pertambahan : " + objek.Tambah(20, 10));
        System.out.println("Hasil Pengurangan : " + objek.Kurang(20, 10));
        System.out.println("Hasil Perkalian   : " + objek.Kali(20, 10));
        System.out.println("Hasil Pembagian   : " + objek.Bagi(20, 10));
    }
    
}
