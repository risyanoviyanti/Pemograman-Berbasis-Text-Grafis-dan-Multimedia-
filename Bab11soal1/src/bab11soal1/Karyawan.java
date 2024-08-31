/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab11soal1;

/**
 *
 * @author admin
 */
public class Karyawan {
    int IdKaryawan, GajiPokok;
    String NamaKaryawan, Gol, Jabatan;
    
    // constructor dengan 2 parameter
    Karyawan (int id, String nama, String Gol, String Jabatan, int GajiPokok){
    this.IdKaryawan = id;
    this.NamaKaryawan = nama;
    this.Gol = Gol;
    this.Jabatan = Jabatan;
    this.GajiPokok = GajiPokok;
    }
    void info(){
        System.out.println("Id Karyawan ; "+IdKaryawan+" Nama: "+NamaKaryawan+" Gol: "+Gol+" Jabatan: "+Jabatan+"Gaji Pokok: "+GajiPokok);
    }
}
